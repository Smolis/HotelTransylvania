/**
 * 
 */
package Integracion.Actividades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Negocio.Actividades.TransferActEmp;
import Negocio.Actividades.TransferActividad;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOActividadesImp implements DAOActividades {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ta
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int nuevaAct(TransferActividad ta) throws Exception {
		// begin-user-code
		String nombArchivo = ta.getID() + ".txt";
		String nombCarpeta = "actividades";

		try {
			File d = new File(nombCarpeta);
			File f = new File(nombArchivo);
			d.mkdir();
			FileWriter fw = new FileWriter(new File(d + "/" + f));
			fw.write(ta.toString());
			fw.close();
		} catch (Exception e) {
			throw e;
		}
		return ta.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idActividad
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferActividad leer(int idActividad) throws FileNotFoundException {
		// begin-user-code
		Scanner in = null;
		String archivo = idActividad + ".txt";
		String nombreCarpeta = "actividades";
		File f = new File(nombreCarpeta + "/" + archivo);
		TransferActividad ta = null;
		TransferActEmp tae = null;
		List<String> empleados = new ArrayList<String>();
		try {

			in = new Scanner(new FileReader(f));

			String nombre = in.nextLine();
			String lugar = in.nextLine();
			String fechaInicio = in.nextLine();
			int duracion = Integer.parseInt(in.nextLine());
			String hora = in.nextLine();
			boolean estado = in.nextBoolean();
			while (in.hasNext()) {
				int idEmp = in.nextInt();
				int horas = in.nextInt();
				tae = new TransferActEmp(idActividad, idEmp, horas);
				empleados.add(tae.toString());
			}

			ta = new TransferActividad(idActividad, nombre, lugar, fechaInicio,
					duracion, hora, estado, empleados);

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(
			"La actividad no se encuentra en la base de datos.");
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return ta;
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
		String nombCarpeta = "actividades";
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
		String nombArchivo = "idActividades.txt";
		String nombCarpeta = "actividades";

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
			System.out.println("Error reading the file: " + nombArchivo);
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
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sumarContador() throws Exception {
		// begin-user-code
		String nombArchivo = "idActividades.txt";
		String nombCarpeta = "actividades";

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
	 * @param ta
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(TransferActividad ta) throws Exception {
		// begin-user-code
		eliminar(ta.getID());
		nuevaAct(ta);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<TransferActividad> listar() throws Exception,
	FileNotFoundException {
		// begin-user-code
		List<TransferActividad> lista = new ArrayList<TransferActividad>();

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
	 * @param nombre
	 * @return
	 * @throws Exception
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int buscarNombre(String nombre) throws Exception,
	FileNotFoundException {
		// begin-user-code
		int maxID = leerContador();
		boolean enc = false;
		TransferActividad t = null;
		for (int i = 1; i <= maxID && !enc; i++) {
			t = leer(i);
			if (t != null && t.getNombre().equalsIgnoreCase(nombre)) {
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
	 * @param tae
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void updateAsig(TransferActEmp tae) throws Exception {
		// begin-user-code
		TransferActividad ta = leer(tae.getidActividad());
		List<String> listaEmp = ta.getListaEmp();
		for (int i = 0; i < listaEmp.size(); i++) {
			String[] emp = listaEmp.get(i).split(" ");
			if (Integer.parseInt(emp[0]) == tae.getidEmpleado()) {
				ta.borrarEmpleado(listaEmp.get(i));
				tae = new TransferActEmp(tae.getidActividad(),tae.getidEmpleado(), tae.getHoras()+ Integer.parseInt(emp[1]));
				i = listaEmp.size();
			}
		}
		String empleado = tae.toString();
		ta.setEmpleado(empleado);
		update(ta);
		// end-user-code
	}

}

