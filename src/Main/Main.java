/**
 * 
 */
package Main;

import Presentacion.Clientes.JFrameAltaCliente;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Main {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @author Pablo
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public enum Evento {
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		ALTA_HABITACION,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		BAJA_HABITACION,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MOSTRAR_DATOS_A_MODIFICAR_HABITACION,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MODIFICAR_HABITACION,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		VER_DETALLES_HABITACION,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		LISTAR_HABITACIONES,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		ALTA_CLIENTE,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		BAJA_CLIENTE,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MOSTRAR_DATOS_A_MODIFICAR_CLIENTE,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MODIFICAR_CLIENTE,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		VER_DETALLES_CLIENTE,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		LISTAR_CLIENTES,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		CONTRATAR_EMPLEADO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		DESPEDIR_EMPLEADO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MOSTRAR_DATOS_A_MODIFICAR_EMPLEADO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MODIFICAR_EMPLEADO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		LISTAR_EMPLEADOS,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		VER_DETALLES_EMPLEADO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		ABRIR_RESERVA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		CERRAR_RESERVA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MOSTRAR_DATOS_A_MODIFICAR_RESERVA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MODIFICAR_RESERVA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		VER_DETALLES_RESERVA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		LISTAR_RESERVAS,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		ALTA_ACTIVIDAD,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		BAJA_ACTIVIDAD,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MOSTRAR_DATOS_A_MODIFICAR_ACTIVIDAD,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		MODIFICAR_ACTIVIDAD,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		ASIGNAR_EMPLEADO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		VER_DETALLES_ACTIVIDAD,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		LISTAR_ACTIVIDADES,
		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		CANCELAR_RESERVA;

	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param args
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String[] args) {
		// begin-user-code
		JFrameAltaCliente.getInstance().initGUI();
		// end-user-code
	}

}