/**
 * 
 */
package Integracion.Habitaciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Negocio.Habitaciones.TransferHabitacion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOHabitacionesImp implements DAOHabitaciones {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int leerContador() throws Exception {
		// begin-user-code
		String nombArchivo = "idHabitaciones.txt";
		String nombCarpeta = "habitaciones";

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
	 * @param th
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public int nuevaHab(TransferHabitacion th) throws Exception {
		// begin-user-code
		String nombArchivo = th.getID() + ".txt";
		String nombCarpeta = "habitaciones";

		try {
			File d = new File(nombCarpeta);
			File f = new File(nombArchivo);
			d.mkdir();
			FileWriter fw = new FileWriter(new File(d + "/" + f));
			fw.write(th.toString());
			fw.close();
		} catch (Exception e) {
			throw new Exception("asdasdas");
		}
		return th.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idHab
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferHabitacion leer(int idHab) throws FileNotFoundException {
		// begin-user-code
		String nombCarpeta = "habitaciones";
		Scanner in = null;
		List<String> fechaReserva = new ArrayList<String>();
		try {
			in = new Scanner(new FileReader(nombCarpeta + "/" + idHab + ".txt"));
			int num = in.nextInt();
			int precio = in.nextInt();
			boolean estado = in.nextBoolean();
			while (in.hasNext()) {
				String fecha = in.next();
				int dias = in.nextInt();
				fechaReserva.add(fecha + " " + String.valueOf(dias));
			}
			if (fechaReserva.size() == 0) {
				return new TransferHabitacion(idHab, num, precio, estado);
			} else {
				return new TransferHabitacion(idHab, num, precio, fechaReserva,
						estado);
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(
					"No existe ninguna habitación con ese identificador.");
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
	 * @param idHab
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public boolean borrarHab(int idHab) {
		// begin-user-code
		String nombArchivo = idHab + ".txt";
		String nombCarpeta = "habitaciones";
		File f = new File(nombCarpeta + "/" + nombArchivo);
		return f.delete();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idHab
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getPrecioHab(int idHab) throws FileNotFoundException {
		// begin-user-code
		TransferHabitacion th = leer(idHab);
		return th.getPrecio();
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
		String nombArchivo = "idHabitaciones.txt";
		String nombCarpeta = "habitaciones";

		int contador = leerContador();
		try {
			File f = new File(nombCarpeta + "/" + nombArchivo);
			f.delete();
			f = new File(nombArchivo);
			FileWriter fw = new FileWriter(nombCarpeta + "/" + f);
			fw.write(String.valueOf(contador + 1));
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error no controlado.");
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param numHab
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int buscarNumHab(int numHab) throws Exception {
		// begin-user-code
		int maxID = leerContador();
		boolean enc = false;
		TransferHabitacion t = null;
		for (int i = 1; i <= maxID && !enc; i++) {
			t = leer(i);
			if (t.getNumHab() == numHab) {
				enc = true;
			}
		}
		if (enc) {
			return t.getID();
		} else {
			return -1;
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param th
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(TransferHabitacion th) throws Exception {
		// begin-user-code
		borrarHab(th.getID());
		nuevaHab(th);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<TransferHabitacion> listar() throws Exception {
		// begin-user-code

		List<TransferHabitacion> lista = new ArrayList<TransferHabitacion>();
		int cont = leerContador();
		for (int i = 1; i <= cont; i++) {
			lista.add(leer(i));
		}
		return lista;
		// end-user-code
	}

}