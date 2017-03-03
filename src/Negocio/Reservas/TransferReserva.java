/**
 * 
 */
package Negocio.Reservas;

import java.util.ArrayList;
import java.util.List;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferReserva {

	//El cliente puede llevar una lista con sus reservas

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int idReserva;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int idCliente;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String fechaEntrada;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int precioTotal;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<TransferLineaReserva> lineaReserva;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int noches;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int numHab;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean estado;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String toString() {
		// begin-user-code
		String cadena = idCliente + System.getProperty("line.separator")
				+ fechaEntrada + System.getProperty("line.separator") + noches
				+ System.getProperty("line.separator") + numHab
				+ System.getProperty("line.separator") + precioTotal
				+ System.getProperty("line.separator") + estado;
		if (lineaReserva != null) {
			for (int i = 0; i < lineaReserva.size(); i++) {
				cadena += System.getProperty("line.separator")
						+ lineaReserva.get(i);
			}
		}
		return cadena;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idCliente
	 * @param entrada
	 * @param noches
	 * @param numHabs
	 * @param precioTotal
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferReserva(int idCliente, String entrada, int noches,
			int numHabs, int precioTotal, boolean estado) {
		// begin-user-code
		this.idCliente = idCliente;
		this.fechaEntrada = entrada;
		this.noches = noches;
		this.numHab = numHabs;
		this.estado = estado;
		this.precioTotal = precioTotal;
		this.lineaReserva = new ArrayList<TransferLineaReserva>();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idCliente
	 * @param entrada
	 * @param noches
	 * @param estado
	 * @param tlr
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferReserva(int idCliente, String entrada, int noches,
			boolean estado, TransferLineaReserva tlr) {
		// begin-user-code
		this.idCliente = idCliente;
		this.fechaEntrada = entrada;
		this.noches = noches;
		this.estado = estado;
		this.lineaReserva.add(tlr);
		this.lineaReserva = new ArrayList<TransferLineaReserva>();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idReserva
	 * @param idCliente
	 * @param entrada
	 * @param noches
	 * @param habitaciones
	 * @param precioTotal
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferReserva(int idReserva, int idCliente, String entrada,
			int noches, int habitaciones, int precioTotal, boolean estado) {
		// begin-user-code
		this.idReserva = idReserva;
		this.idCliente = idCliente;
		this.fechaEntrada = entrada;
		this.noches = noches;
		this.estado = estado;
		this.numHab = habitaciones;
		this.precioTotal = precioTotal;
		this.lineaReserva = new ArrayList<TransferLineaReserva>();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idRes
	 * @param idCliente
	 * @param fecha
	 * @param noches
	 * @param habitaciones
	 * @param precioTotal
	 * @param estado
	 * @param tlr
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferReserva(int idRes, int idCliente, String fecha, int noches,
			int habitaciones, int precioTotal, boolean estado,
			TransferLineaReserva tlr) {
		// begin-user-code
		this.idCliente = idCliente;
		this.idReserva = idRes;
		this.fechaEntrada = fecha;
		this.noches = noches;
		this.precioTotal = precioTotal;
		this.estado = estado;
		this.lineaReserva = new ArrayList<TransferLineaReserva>();
		this.lineaReserva.add(tlr);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getFechaEntrada() {
		// begin-user-code
		return this.fechaEntrada;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getNoches() {
		// begin-user-code
		return this.noches;
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
		return this.estado;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEstado(boolean estado) {
		// begin-user-code
		this.estado = estado;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param precioTotal
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPrecioTotal(int precioTotal) {
		// begin-user-code
		this.precioTotal = precioTotal;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getPrecioTotal() {
		// begin-user-code
		return precioTotal;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idCliente
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdCliente(int idCliente) {
		// begin-user-code
		this.idCliente = idCliente;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIdCliente() {
		// begin-user-code
		return idCliente;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idReserva
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdReserva(int idReserva) {
		// begin-user-code
		this.idReserva = idReserva;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIdReserva() {
		// begin-user-code
		return idReserva;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param id
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setId(int id) {
		// begin-user-code
		this.idReserva = id;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<TransferLineaReserva> getLineaReserva() {
		// begin-user-code
		return this.lineaReserva;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tlr
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addLineaReserva(TransferLineaReserva tlr) throws Exception {
		// begin-user-code
		this.lineaReserva.add(tlr);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param numHab
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNumHab(int numHab) {
		// begin-user-code
		this.numHab = numHab;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getNumHab() {
		// begin-user-code
		return numHab;
		// end-user-code
	}
}