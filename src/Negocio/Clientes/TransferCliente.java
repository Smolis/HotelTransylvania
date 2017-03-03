/**
 * 
 */
package Negocio.Clientes;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferCliente {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int ID;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String nombre;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String contraseña;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String dni;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private long telefono;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private long numTarjeta;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean activo;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param dni
	 * @param nomb
	 * @param pass
	 * @param tlf
	 * @param nTarjeta
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferCliente(String dni, String nomb, String pass, long tlf,
			long nTarjeta) {
		// begin-user-code
		this.nombre = nomb;
		this.contraseña = pass;
		this.dni = dni;
		this.telefono = tlf;
		this.numTarjeta = nTarjeta;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param dni
	 * @param nomb
	 * @param pass
	 * @param tlf
	 * @param nTarjeta
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferCliente(String dni, String nomb, String pass, long tlf,
			long nTarjeta, boolean estado) {
		// begin-user-code
		this.nombre = nomb;
		this.contraseña = pass;
		this.dni = dni;
		this.telefono = tlf;
		this.numTarjeta = nTarjeta;
		this.activo = estado;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ID
	 * @param dni
	 * @param nomb
	 * @param pass
	 * @param tlf
	 * @param nTarjeta
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferCliente(int ID, String dni, String nomb, String pass,
			long tlf, long nTarjeta, boolean estado) {
		// begin-user-code
		this.ID = ID;
		this.nombre = nomb;
		this.contraseña = pass;
		this.dni = dni;
		this.telefono = tlf;
		this.numTarjeta = nTarjeta;
		this.activo = estado;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ID
	 * @param dni
	 * @param nomb
	 * @param pass
	 * @param tlf
	 * @param nTarjeta
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferCliente(int ID, String dni, String nomb, String pass,
			long tlf, long nTarjeta) {
		// begin-user-code
		this.ID = ID;
		this.nombre = nomb;
		this.contraseña = pass;
		this.dni = dni;
		this.telefono = tlf;
		this.numTarjeta = nTarjeta;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getID() {
		// begin-user-code
		return this.ID;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDNI() {
		// begin-user-code
		return this.dni;
		// end-user-code	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNombre() {
		// begin-user-code
		return this.nombre;
		// end-user-code	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getContraseña() {
		// begin-user-code
		return this.contraseña;
		// end-user-code	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public long getTarjeta() {
		// begin-user-code
		return this.numTarjeta;
		// end-user-code	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public long getTelf() {
		// begin-user-code
		return this.telefono;
		// end-user-code	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean getEstado() {
		// begin-user-code
		return this.activo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param id
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setID(int id) {
		// begin-user-code
		this.ID = id;
		// end-user-code	
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String toString() {
		// begin-user-code
		return dni + System.getProperty("line.separator") + nombre
				+ System.getProperty("line.separator") + contraseña
				+ System.getProperty("line.separator") + telefono
				+ System.getProperty("line.separator") + numTarjeta
				+ System.getProperty("line.separator") + activo;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param act
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEstado(boolean act) {
		// begin-user-code
		this.activo = act;
		// end-user-code
	}
}