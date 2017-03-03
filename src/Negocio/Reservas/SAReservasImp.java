package Negocio.Reservas;
import java.util.ArrayList;
import java.util.List;

import Integracion.Clientes.DAOClientes;
import Integracion.FactoriaDAO.FactoriaDAO;
import Integracion.Habitaciones.DAOHabitaciones;
import Integracion.Reservas.DAOReservas;
import Negocio.Habitaciones.TransferHabitacion;


public class SAReservasImp implements SAReservas {


	public int abrir(TransferReserva tr) throws Exception {
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		DAOClientes daoC = FactoriaDAO.getInstance().generaDAOClientes();
		DAOHabitaciones daoH = FactoriaDAO.getInstance().generaDAOHabitaciones();
		int cont = dao.leerContador();
		int numHabs = tr.getNumHab();
		List<Integer> habsDisp = dao.getDisponibilidad(tr.getFechaEntrada(), tr.getNoches());
		if(daoC.leer(tr.getIdCliente()) == null){
			throw new Exception("El cliente no existe");
		}

		if(daoH.leerContador() < numHabs || habsDisp.size() < numHabs){
			throw new Exception("No hay tantas habitaciones disponibles");
		}

		else{
			if(dao.leerContador() > 0){
				for (int i = 0; i < dao.leerContador(); i++){
					if(tr == dao.leer(i+1)){
						throw new Exception("Esta reserva ya existe en la base de datos");
					}
				}
			}
			tr.setId(cont+1);
			dao.sumarContador();
			dao.update(tr);
		}

		return tr.getIdReserva();
	}

	public int precioTotal(TransferReserva tr) throws Exception{
		int precio = 0;
		for(int i = 0; i < tr.getLineaReserva().size(); i++){
			precio += tr.getLineaReserva().get(i).getPrecioHab();
		}
		return precio*tr.getNoches();
	}

	public void asignarHabitaciones(TransferReserva tr, int numHab) throws NumberFormatException, Exception {
		DAOHabitaciones dao = FactoriaDAO.getInstance().generaDAOHabitaciones();
		DAOReservas daoR = FactoriaDAO.getInstance().generaDAOReservas();
		int cont = 0;
		int i = 1;
		while(i <= dao.leerContador() && cont < numHab){
			TransferHabitacion th = dao.leer(i);
			if(th.getFechasReserva().size() == 0 && th.getEstado()){
				TransferLineaReserva tlr = new TransferLineaReserva(tr.getIdReserva(), th.getID(), th.getPrecio());
				tr.addLineaReserva(tlr);
				tr.setEstado(true);
				tr.setPrecioTotal(precioTotal(tr));
				String fechaReserva = tr.getFechaEntrada()+" "+tr.getNoches();
				th.addFechaReserva(fechaReserva);
				dao.update(th);
				cont++;
			}
			else if(th.getFechasReserva().size() != 0 && th.getEstado()){
				List<Integer> habsDisp = daoR.getDisponibilidad(tr.getFechaEntrada(), tr.getNoches());
				if(habsDisp.contains(th.getID())){
					TransferLineaReserva tlr = new TransferLineaReserva(tr.getIdReserva(), th.getID(), th.getPrecio());
					tr.addLineaReserva(tlr);
					tr.setEstado(true);
					tr.setPrecioTotal(precioTotal(tr));
					String fechaReserva = tr.getFechaEntrada()+" "+tr.getNoches();
					th.addFechaReserva(fechaReserva);
					dao.update(th);
					cont++;
				}
			}
			i++;
		}
	}


	public int cerrar(int idReserva) throws Exception {
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		TransferReserva tr = dao.leer(idReserva);
		List<Integer> habsDisp = dao.getDisponibilidad(tr.getFechaEntrada(), tr.getNoches());
		if (tr.getPrecioTotal() != 0){
			throw new Exception("Esta reserva ya esta cerrada.");
		}
		if(habsDisp.size() < tr.getNumHab()){
			throw new Exception("No se puede cerrar la reserva."+System.getProperty("line.separator")+"No hay suficientes habitaciones disponibles en este momento.");
		}
		asignarHabitaciones(tr, tr.getNumHab());
		dao.update(tr);

		return tr.getIdReserva();
	}


	public void cancelar(int idReserva) throws Exception {
		// begin-user-code
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		DAOHabitaciones daoH = FactoriaDAO.getInstance().generaDAOHabitaciones();
		TransferReserva tr = dao.leer(idReserva);
		if (tr != null) {
			if(!tr.getEstado()){
				throw new Exception("La reserva está inactiva");
			}
			else{
				List<TransferLineaReserva> linea = tr.getLineaReserva();
				for(int i = 0 ; i < linea.size(); i++){
					TransferLineaReserva trl = linea.get(i);
					TransferHabitacion th = daoH.leer(trl.getIdHabitacion());
					th.setFechasReserva(new ArrayList<String>());
					daoH.update(th);
				}
			}
			tr.setEstado(false);

			dao.update(tr);
		}
		// end-user-code
	}


	public void modificar(TransferReserva tr) throws Exception {
		// begin-user-code
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		TransferReserva aux = dao.leer(tr.getIdReserva());
		List<Integer> habsDisp = dao.getDisponibilidad(tr.getFechaEntrada(), tr.getNoches());
		if(aux.getNumHab() != tr.getNumHab()){
			if(habsDisp.size() < tr.getNumHab()){
				throw new Exception("No hay suficientes habitaciones disponibles");
			}
			else{
				cancelar(tr.getIdReserva());
				tr.setEstado(true);
				asignarHabitaciones(tr, tr.getNumHab());
			}

		}
		dao.update(tr);
		// end-user-code
	}


	public List<TransferReserva> listar() throws Exception {
		// begin-user-code
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		return dao.listar();
		// end-user-code
	}

	public TransferReserva verDetalles(int idReserva) throws Exception {
		// begin-user-code
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		return dao.leer(idReserva);
		// end-user-code
	}

}