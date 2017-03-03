/**
 * 
 */
package Negocio.FactoriaSA;

import Negocio.Actividades.SAActividades;
import Negocio.Actividades.SAActividadesImp;
import Negocio.Clientes.SAClientes;
import Negocio.Clientes.SAClientesImp;
import Negocio.Empleados.SAEmpleados;
import Negocio.Empleados.SAEmpleadosImp;
import Negocio.Habitaciones.SAHabitaciones;
import Negocio.Habitaciones.SAHabitacionesImp;
import Negocio.Reservas.SAReservas;
import Negocio.Reservas.SAReservasImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaSAImp extends FactoriaSA {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAHabitaciones generaSAHabitaciones() {
		// begin-user-code
		return new SAHabitacionesImp();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAClientes generaSAClientes() {
		// begin-user-code
		return new SAClientesImp();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAReservas generaSAReservas() {
		// begin-user-code
		return new SAReservasImp();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAEmpleados generaSAEmpleados() {
		// begin-user-code
		return new SAEmpleadosImp();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAActividades generaSAActividades() {
		// begin-user-code
		return new SAActividadesImp();
		// end-user-code
	}
}