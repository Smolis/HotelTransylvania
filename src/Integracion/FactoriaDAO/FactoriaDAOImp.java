/**
 * 
 */
package Integracion.FactoriaDAO;

import Integracion.Actividades.DAOActividades;
import Integracion.Actividades.DAOActividadesImp;
import Integracion.Clientes.DAOClientes;
import Integracion.Clientes.DAOClientesImp;
import Integracion.Empleados.DAOEmpleados;
import Integracion.Empleados.DAOEmpleadosImp;
import Integracion.Habitaciones.DAOHabitaciones;
import Integracion.Habitaciones.DAOHabitacionesImp;
import Integracion.Reservas.DAOReservas;
import Integracion.Reservas.DAOReservasImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaDAOImp extends FactoriaDAO {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOHabitaciones generaDAOHabitaciones() {
		// begin-user-code
		return new DAOHabitacionesImp();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOClientes generaDAOClientes() {
		// begin-user-code
		return new DAOClientesImp();

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOActividades generaDAOActividades() {
		// begin-user-code
		return new DAOActividadesImp();

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOEmpleados generaDAOEmpleados() {
		// begin-user-code
		return new DAOEmpleadosImp();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOReservas generaDAOReservas() {
		// begin-user-code
		return new DAOReservasImp();
		// end-user-code
	}

}