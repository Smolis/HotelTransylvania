/**
 * 
 */
package Negocio.Actividades;

import java.util.List;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferActividad {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String lugar;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<String> listaEmpleados;

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
	private String fecha;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int id;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String hora;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int duracion;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean estado;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idActividad
	 * @param nombre
	 * @param lugar
	 * @param fechaInicio
	 * @param duracion
	 * @param hora
	 * @param estado
	 * @param empleados
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferActividad(int idActividad, String nombre, String lugar,
			String fechaInicio, int duracion, String hora, boolean estado,
			TransferActEmp empleados) {
		// begin-user-code
		this.id = idActividad;
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fechaInicio;
		this.duracion = duracion;
		this.hora = hora;
		this.estado = estado;
		this.listaEmpleados.add(empleados.toString());
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idActividad
	 * @param nombre
	 * @param lugar
	 * @param fechaInicio
	 * @param duracion
	 * @param hora
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferActividad(int idActividad, String nombre, String lugar,
			String fechaInicio, int duracion, String hora, boolean estado) {
		// begin-user-code
		this.id = idActividad;
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fechaInicio;
		this.duracion = duracion;
		this.hora = hora;
		this.estado = estado;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param nombre
	 * @param lugar
	 * @param fechaInicio
	 * @param duracion
	 * @param hora
	 * @param estado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferActividad(String nombre, String lugar, String fechaInicio,
			int duracion, String hora, boolean estado) {
		// begin-user-code
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fechaInicio;
		this.duracion = duracion;
		this.hora = hora;
		this.estado = estado;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idActividad
	 * @param nombre
	 * @param lugar
	 * @param fechaInicio
	 * @param duracion
	 * @param hora
	 * @param estado
	 * @param empleados
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferActividad(int idActividad, String nombre, String lugar,
			String fechaInicio, int duracion, String hora, boolean estado,
			List<String> empleados) {
		// begin-user-code
		this.id = idActividad;
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fechaInicio;
		this.duracion = duracion;
		this.hora = hora;
		this.estado = estado;
		this.listaEmpleados = empleados;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param id
	 * @param nombre
	 * @param lugar
	 * @param fechaInicio
	 * @param duracion
	 * @param hora
	 * @param estado
	 * @param idEmpleado
	 * @param horas
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferActividad(int id, String nombre, String lugar,
			String fechaInicio, int duracion, String hora, boolean estado,
			int idEmpleado, int horas) {
		// begin-user-code
		this.id = id;
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fechaInicio;
		this.duracion = duracion;
		this.hora = hora;
		this.estado = estado;
		TransferActEmp tae = new TransferActEmp(id, idEmpleado, horas);
		this.listaEmpleados.add(tae.toString());
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
		return this.id;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getLugar() {
		// begin-user-code
		return this.lugar;
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
	public String getFecha() {
		// begin-user-code
		return this.fecha;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getHora() {
		// begin-user-code
		return this.hora;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getDuracion() {
		// begin-user-code
		return this.duracion;
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
	 * @param id
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setId(int id) {
		// begin-user-code
		this.id = id;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<String> getListaEmp() {
		// begin-user-code
		return this.listaEmpleados;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEmpleado(String empleado) {
		// begin-user-code
		listaEmpleados.add(empleado);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleado
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void borrarEmpleado(String empleado) {
		// begin-user-code
		listaEmpleados.remove(empleado);
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
		String cadena = nombre + System.getProperty("line.separator") + lugar
				+ System.getProperty("line.separator") + fecha
				+ System.getProperty("line.separator") + duracion
				+ System.getProperty("line.separator") + hora
				+ System.getProperty("line.separator") + estado;
		if (listaEmpleados != null) {
			for (int i = 0; i < listaEmpleados.size(); i++) {
				cadena += System.getProperty("line.separator")
						+ listaEmpleados.get(i);
			}
		}
		return cadena;
		// end-user-code
	}

}