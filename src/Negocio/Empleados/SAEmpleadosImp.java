/**
 * 
 */
package Negocio.Empleados;

import java.io.FileNotFoundException;
import java.util.List;

import Integracion.Empleados.DAOEmpleados;
import Integracion.FactoriaDAO.FactoriaDAO;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAEmpleadosImp implements SAEmpleados {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param te
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int contratar(TransferEmpleado te) throws Exception {
		// begin-user-code
		DAOEmpleados dao = FactoriaDAO.getInstance().generaDAOEmpleados();
		int cont = dao.leerContador();
		int id = dao.buscarDNI(te.getDNI());
		if (id == -1) {
			te.setId(cont + 1);
			te.setEstado(true);
			dao.nuevoEmpleado(te);
			dao.sumarContador();
		} else {
			te.setId(id);
			te = dao.leer(id);
			if (te.getEstado()) {
				throw new Exception(
						"El empleado ya estaba dado de alta. Se han mantenido los datos antiguos.");
			}
			te.setEstado(true);
			dao.update(te);
		}

		return te.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idEmpleado
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void despedir(int idEmpleado) throws Exception {
		// begin-user-code
		DAOEmpleados dao = FactoriaDAO.getInstance().generaDAOEmpleados();
		TransferEmpleado te = dao.leer(idEmpleado);
		if (te != null && te.getEstado()) {
			te.setEstado(false);
			dao.update(te);
		} else if (!te.getEstado()) {
			throw new Exception("El empleado ya estaba dado de baja.");
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
	public void modificar(TransferEmpleado te) throws Exception {
		// begin-user-code
		DAOEmpleados daoEmp = FactoriaDAO.getInstance().generaDAOEmpleados();
		int id = daoEmp.buscarDNI(te.getDNI());
		if (id != te.getID() && id != -1) {
			throw new Exception(
					"El DNI de empleado ya existe en la base de datos.");
		}
		daoEmp.update(te);
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
	public TransferEmpleado verDetalles(int idEmpleado)
			throws FileNotFoundException {
		// begin-user-code
		DAOEmpleados dao = FactoriaDAO.getInstance().generaDAOEmpleados();
		return dao.leer(idEmpleado);
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
		DAOEmpleados daoEmp = FactoriaDAO.getInstance().generaDAOEmpleados();
		return daoEmp.listar();
		// end-user-code
	}

}