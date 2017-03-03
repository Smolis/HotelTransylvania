/**
 * 
 */
package Negocio.Habitaciones;

import java.io.FileNotFoundException;
import java.util.List;

import Integracion.FactoriaDAO.FactoriaDAO;
import Integracion.Habitaciones.DAOHabitaciones;
import Integracion.Reservas.DAOReservas;
import Negocio.Reservas.TransferLineaReserva;
import Negocio.Reservas.TransferReserva;


public class SAHabitacionesImp implements SAHabitaciones {
	
	public int alta(TransferHabitacion th) throws Exception {
		// begin-user-code
		DAOHabitaciones daoHab = FactoriaDAO.getInstance().generaDAOHabitaciones();
		int id = daoHab.buscarNumHab(th.getNumHab());
		if (id == -1) {
			int contador = daoHab.leerContador();
			th.setID(contador + 1);
			th.setEstado(true);
			daoHab.nuevaHab(th);
			daoHab.sumarContador();
		} else {
			th = daoHab.leer(id);
			if (th.getEstado()) {
				throw new Exception(
						"El numero de habitacion ya estaba dado de alta. Se han mantenido los datos antiguos");
			}
			th.setEstado(true);
			daoHab.update(th);
		}
		return th.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idHab
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void baja(int idHab) throws Exception {
		// begin-user-code
		DAOHabitaciones daoHab = FactoriaDAO.getInstance().generaDAOHabitaciones();
		TransferHabitacion th = daoHab.leer(idHab);
		if (!th.getEstado()) {
			throw new Exception("La habitación ya estaba dada de baja.");
		}
		else if(tieneReservasPendientes(idHab)){
			throw new Exception("No se puede dar de baja la habitación porque está reservada");
		}
		th.setEstado(false);
		daoHab.update(th);
		// end-user-code
	}

	public void modificar(TransferHabitacion th) throws Exception {
		// begin-user-code
		DAOHabitaciones daoHab = FactoriaDAO.getInstance()
				.generaDAOHabitaciones();
		int id = daoHab.buscarNumHab(th.getNumHab());
		if (id != th.getID() && id != -1) {
			throw new Exception("Ya existe una habitación con ese número.");
		}
		daoHab.update(th);
		// end-user-code
	}

	
	public TransferHabitacion verDetalles(int idHab)
			throws FileNotFoundException {
		// begin-user-code
		DAOHabitaciones daoHab = FactoriaDAO.getInstance().generaDAOHabitaciones();
		return daoHab.leer(idHab);
		// end-user-code
	}

	
	public List<TransferHabitacion> listar() throws Exception {
		// begin-user-code
		DAOHabitaciones daoHab = FactoriaDAO.getInstance().generaDAOHabitaciones();
		return daoHab.listar();
		// end-user-code
	}
	
	private boolean tieneReservasPendientes(int idHab) throws Exception{
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		boolean pendiente = false;
		for(int i = 1; i <= dao.leerContador(); i++){
			TransferReserva tr = dao.leer(i);
			if(tr.getEstado()){
				List<TransferLineaReserva> linea = tr.getLineaReserva();
				for (int j = 0; j < linea.size(); j++){
					if(idHab == linea.get(j).getIdHabitacion()){
						return true;
					}
				}
			}
		}
		return pendiente;
	}
}