/**
 * 
 */
package Integracion.Empleados;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Negocio.Empleados.TransferEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOEmpleadosImp implements DAOEmpleados {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param te
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int nuevoEmpleado(TransferEmpleado te) throws Exception {
		// begin-user-code
		String nombArchivo = te.getID() + ".txt";
		String nombCarpeta = "empleados";

		try {
			File d = new File(nombCarpeta);
			File f = new File(nombArchivo);
			d.mkdir();
			FileWriter fw = new FileWriter(new File(d + "/" + f));
			fw.write(te.toString());
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return te.getID();
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
		String nombArchivo = "idEmpleados.txt";
		String nombCarpeta = "empleados";

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
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idEmpleado
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferEmpleado leer(int idEmpleado) throws FileNotFoundException {
		// begin-user-code
		String nombCarpeta = "empleados";
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(nombCarpeta + "/" + idEmpleado
					+ ".txt"));
			String dni = in.nextLine();
			String nombre = in.nextLine();
			long numBanco = Long.parseLong(in.nextLine());
			long telef = Long.parseLong(in.nextLine());
			String horario = in.nextLine();
			int salario = Integer.parseInt(in.nextLine());
			boolean estado = in.nextBoolean();
			return new TransferEmpleado(idEmpleado, dni, nombre, numBanco,
					telef, horario, salario, estado);

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(
					"No existe ningún empleado con ese identificador.");
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
	 * @param id
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean eliminar(int id) {
		// begin-user-code
		String nombArchivo = id + ".txt";
		String nombCarpeta = "empleados";
		File f = new File(nombCarpeta + "/" + nombArchivo);
		return f.delete();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int leerContador() {
		// begin-user-code
		String nombArchivo = "idEmpleados.txt";
		String nombCarpeta = "empleados";

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
			}
		} catch (Exception e) {
			e.printStackTrace();
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
	 * @param dni
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int buscarDNI(String dni) throws FileNotFoundException {
		// begin-user-code
		int maxID = leerContador();
		boolean enc = false;
		TransferEmpleado t = null;
		for (int i = 1; i <= maxID && !enc; i++) {
			t = leer(i);
			if (t != null && t.getDNI().equalsIgnoreCase(dni)) {
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
	 * @param te
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(TransferEmpleado te) throws Exception {
		// begin-user-code
		eliminar(te.getID());
		nuevoEmpleado(te);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<TransferEmpleado> listar() throws FileNotFoundException {
		// begin-user-code
		List<TransferEmpleado> lista = new ArrayList<TransferEmpleado>();

		int cont = leerContador();

		for (int i = 1; i <= cont; i++) {
			lista.add(leer(i));
		}
		return lista;
		// end-user-code
	}
}