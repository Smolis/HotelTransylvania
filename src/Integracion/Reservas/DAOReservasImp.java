/**
 * 
 */
package Integracion.Reservas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Integracion.FactoriaDAO.FactoriaDAO;
import Integracion.Habitaciones.DAOHabitaciones;
import Negocio.Habitaciones.TransferHabitacion;
import Negocio.Reservas.TransferLineaReserva;
import Negocio.Reservas.TransferReserva;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOReservasImp implements DAOReservas {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idRes
	 * @return
	 * @throws Exception
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferReserva leer(int idRes) throws Exception,
	FileNotFoundException {
		// begin-user-code
		String nombCarpeta = "reservas";
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(nombCarpeta + "/" + idRes + ".txt"));
			int idCliente = in.nextInt();
			String fecha = in.next();
			int noches = in.nextInt();
			int habitaciones = in.nextInt();
			int precioTotal = in.nextInt();
			boolean estado = in.nextBoolean();
			TransferReserva tr = new TransferReserva(idRes, idCliente, fecha, noches, habitaciones, precioTotal, estado);
			while (in.hasNext()) {
				int idHab = in.nextInt();
				int precio = in.nextInt();
				TransferLineaReserva tlr = new TransferLineaReserva(idRes,idHab, precio);
				tr.addLineaReserva(tlr);
			}
			return tr;

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(
			"No existe ninguna reserva con ese identificador.");
		} finally {
			if (in != null) {
				in.close();
			}
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idRes
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean borrarReserva(int idRes) {
		// begin-user-code
		String nombArchivo = idRes + ".txt";
		String nombCarpeta = "reservas";
		File f = new File(nombCarpeta + "/" + nombArchivo);
		return f.delete();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int leerContador() throws Exception {
		// begin-user-code
		String nombArchivo = "idReservas.txt";
		String nombCarpeta = "reservas";

		int contador = 0;
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(nombCarpeta + "/" + nombArchivo));
			contador = in.nextInt();
		} catch (FileNotFoundException e) {
			File f = new File(nombArchivo);
			File d = new File(nombCarpeta);
			d.mkdir();
			try {
				FileWriter fw = new FileWriter(d + "/" + f);
				fw.write(String.valueOf(contador));
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
				throw new Exception("Error no controlado.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error no controlado.");
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return contador;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tr
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int nuevaReserva(TransferReserva tr) throws Exception {
		// begin-user-code
		String nombArchivo = tr.getIdReserva() + ".txt";
		String nombCarpeta = "reservas";

		try {
			File d = new File(nombCarpeta);
			File f = new File(nombArchivo);
			d.mkdir();
			FileWriter fw = new FileWriter(new File(d + "/" + f));
			fw.write(tr.toString());
			fw.close();
		} catch (Exception e) {
			throw e;
		}
		return tr.getIdReserva();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tr
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(TransferReserva tr) throws Exception {
		// begin-user-code
		borrarReserva(tr.getIdReserva());
		nuevaReserva(tr);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<TransferReserva> listar() throws Exception {
		// begin-user-code
		List<TransferReserva> lista = new ArrayList<TransferReserva>();
		int cont = leerContador();
		for (int i = 1; i <= cont; i++) {
			lista.add(leer(i));
		}
		return lista;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sumarContador() throws Exception {
		// begin-user-code
		String nombArchivo = "idReservas.txt";
		String nombCarpeta = "reservas";

		int contador = leerContador();
		try {
			File f = new File(nombCarpeta + "/" + nombArchivo);
			f.delete();
			f = new File(nombArchivo);
			FileWriter fw = new FileWriter(nombCarpeta + "/" + f);
			fw.write(String.valueOf(contador + 1));
			fw.close();
		} catch (Exception e) {
			throw e;
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param fechaEntradaCliente
	 * @param fechaEntradaTransfer
	 * @param fechaSalidaCliente
	 * @param fechaSalidaTransfer
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean estaDisponible(String fechaEntradaCliente,String fechaEntradaTransfer, String fechaSalidaCliente,String fechaSalidaTransfer) {
		// begin-user-code
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaEC = sdf.parse(fechaEntradaCliente, new ParsePosition(0));
		Date fechaET = sdf.parse(fechaEntradaTransfer, new ParsePosition(0));
		Date fechaSC = sdf.parse(fechaSalidaCliente, new ParsePosition(0));
		Date fechaST = sdf.parse(fechaSalidaTransfer, new ParsePosition(0));

		if (fechaEC.before(fechaET) && fechaSC.after(fechaST)) {
			return false;
		} else if (fechaEC.equals(fechaET) || fechaSC.equals(fechaST)) {
			return false;
		} else if (fechaEC.after(fechaET) && fechaSC.before(fechaST)) {
			return false;
		} else if (fechaST.before(fechaEC)) {
			return true;
		} else if (fechaET.after(fechaSC)) {
			return true;
		}

		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param fechaEntradaCliente
	 * @param noches
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<Integer> getDisponibilidad(String fechaEntradaCliente, int noches) throws Exception {
		// begin-user-code
		String fechaSalidaCliente = calcularFechaSalida(fechaEntradaCliente,noches);
		DAOHabitaciones daoH = FactoriaDAO.getInstance().generaDAOHabitaciones();
		List <Integer> habsDisponibles = new ArrayList<Integer>();
		if (daoH.leerContador() > 0) {
			for (int i = 1; i <= daoH.leerContador(); i++) {
				TransferHabitacion th = daoH.leer(i);
				if (th.getFechasReserva().size() == 0) {
					habsDisponibles.add(th.getID());
				}
				else{
					String[] array = th.getFechasReserva().toString().split(" ");
					char[] fecha = array[0].toCharArray();
					String fechaEntradaArray = "";
					for(int j = 0; j < fecha.length; j++){
						if(fecha[j] != '[' && fecha[j] != ','){
							fechaEntradaArray += fecha[j];
						}
					}
					char[] nochesArray = array[1].toCharArray();
					String nochesA = "";
					for(int k = 0; k < nochesArray.length; k++){
						if(nochesArray[k] != ']' && nochesArray[k] != ','){
							nochesA += nochesArray[k];
						}
					}
					String fechaSalidaTransfer = calcularFechaSalida(fechaEntradaArray,Integer.parseInt(nochesA));
					if(estaDisponible(fechaEntradaCliente,fechaEntradaArray,fechaSalidaCliente, fechaSalidaTransfer)){
						habsDisponibles.add(th.getID());
					}
				}
			}

		}
		return habsDisponibles;
	}


	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param lista
	 * @param valor
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean esta(int[] lista, int valor) {
		// begin-user-code
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == valor) {
				return true;
			}
		}
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param fechaEntrada
	 * @param noches
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String calcularFechaSalida(String fechaEntrada, int noches) {
		String mesString = "0";
		String[] fechaDividida = fechaEntrada.split("/");
		int dia = Integer.parseInt(fechaDividida[0]);
		int mes = Integer.parseInt(fechaDividida[1]);
		int anio = Integer.parseInt(fechaDividida[2]);
		int[] mes31 = { 1, 3, 5, 7, 8, 10, 12 };
		if (mes == 2) {
			dia += noches;
			if (dia > 29) {
				dia -= 28;
				mes++;
			}
		} else if (esta(mes31, mes)) {
			dia += noches;
			if (dia > 32) {
				dia -= 31;
				mes++;
			}
		} 
		else {
			dia += noches;
			if (dia > 31){
				dia -= 30;
				if (mes == 12) {
					mes = 1;
					anio++;
				} else {
					mes++;
				}
			}
		}
		if(mes < 10){
			mesString += ""+mes;
		}
		else{
			mesString = ""+mes;
		}

		return dia + "/" + mesString + "/" + anio;
	}

}