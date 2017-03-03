/**
 * 
 */
package Integracion.Clientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Negocio.Clientes.TransferCliente;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOClientesImp implements DAOClientes {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public int leerContador() throws Exception {
		// begin-user-code
		String nombArchivo = "idClientes.txt";
		String nombCarpeta = "clientes";

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
	 * @param tc
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public int nuevoCliente(TransferCliente tc) throws Exception {
		// begin-user-code
		String nombArchivo = tc.getID() + ".txt";
		String nombCarpeta = "clientes";
		FileWriter fw = null;
		try {
			File d = new File(nombCarpeta);
			File f = new File(nombArchivo);
			d.mkdir();
			fw = new FileWriter(new File(d + "/" + f));
			fw.write(tc.toString());
		} catch (Exception e) {
			throw e;
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
		return tc.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idCliente
	 * @return
	 * @throws FileNotFoundException
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public TransferCliente leer(int idCliente) throws FileNotFoundException {
		// begin-user-code
		String nombCarpeta = "clientes";
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(nombCarpeta + "/" + idCliente
					+ ".txt"));
			return new TransferCliente(idCliente, in.nextLine(), in.nextLine(),
					in.nextLine(), in.nextLong(), in.nextLong(),
					in.nextBoolean());
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException(
					"El cliente no se encuentra en la base de datos.");
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
	 * @param idCliente
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public boolean borrarCliente(int idCliente) {
		// begin-user-code
		String nombArchivo = idCliente + ".txt";
		String nombCarpeta = "clientes";
		File f = new File(nombCarpeta + "/" + nombArchivo);
		return f.delete();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public void sumarContador() throws Exception {
		// begin-user-code
		String nombArchivo = "idClientes.txt";
		String nombCarpeta = "clientes";

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
	 * @param dni
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int buscarDNI(String dni) throws Exception {
		// begin-user-code
		int maxID = leerContador();
		boolean enc = false;
		TransferCliente t = null;
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
	 * @param tc
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(TransferCliente tc) throws Exception {
		// begin-user-code
		borrarCliente(tc.getID());
		nuevoCliente(tc);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<TransferCliente> listar() throws Exception {
		// begin-user-code
		List<TransferCliente> lista = new ArrayList<TransferCliente>();
		int cont = leerContador();
		for (int i = 1; i <= cont; i++) {
			lista.add(leer(i));
		}
		return lista;
		// end-user-code
	}
}