/**
 * 
 */
package Negocio.Actividades;

import java.io.FileNotFoundException;
import java.util.List;

import Integracion.Actividades.DAOActividades;
import Integracion.Empleados.DAOEmpleados;
import Integracion.FactoriaDAO.FactoriaDAO;
import Negocio.Empleados.TransferEmpleado;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAActividadesImp implements SAActividades {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ta
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TransferActividad ta) throws Exception {
		// begin-user-code
		DAOActividades dao = FactoriaDAO.getInstance().generaDAOActividades();
		int cont = dao.leerContador();
		int id = dao.buscarNombre(ta.getNombre());
		if (id == -1) {
			ta.setId(cont + 1);
			ta.setEstado(true);
			dao.nuevaAct(ta);
			dao.sumarContador();
		} else {
			ta.setId(id);
			ta = dao.leer(ta.getID());
			if (ta.getEstado()) {
				throw new Exception(
						"La actividad ya estaba dada de alta. Se han mantenido los datos antiguos");
			}
			ta.setEstado(true);
			dao.update(ta);
		}
		return ta.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idActividad
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void baja(int idActividad) throws Exception {
		// begin-user-code
		DAOActividades dao = FactoriaDAO.getInstance().generaDAOActividades();
		TransferActividad ta = dao.leer(idActividad);
		if (ta.getEstado() && ta != null) {
			ta.setEstado(false);
			dao.update(ta);
		} else if (!ta.getEstado()) {
			throw new Exception("La actividad ya estaba dada de baja.");
		} else {
			throw new Exception(
					"No existe ninguna actividad con ese identificador.");
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
	public void modificar(TransferActividad ta) throws Exception {
		// begin-user-code
		DAOActividades dao = FactoriaDAO.getInstance().generaDAOActividades();
		int id = dao.buscarNombre(ta.getNombre());
		if (id != ta.getID() && id != -1) {
			throw new Exception(
					"El nombre de la actividad ya existe en la base de datos.");
		}
		dao.update(ta);
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
		DAOActividades daoAct = FactoriaDAO.getInstance()
				.generaDAOActividades();

		return daoAct.listar();

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
	public TransferActividad verDetalles(int idActividad)
			throws FileNotFoundException {
		// begin-user-code
		DAOActividades dao = FactoriaDAO.getInstance().generaDAOActividades();
		TransferActividad ta = dao.leer(idActividad);
		String nombre = ta.getNombre();
		String lugar = ta.getLugar();
		String fechaInicio = ta.getFecha();
		int duracion = ta.getDuracion();
		String hora = ta.getHora();
		boolean estado = ta.getEstado();
		List<String> empleados = ta.getListaEmp();

		return new TransferActividad(idActividad, nombre, lugar, fechaInicio, duracion, hora, estado, empleados);

	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tae
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void asignar(TransferActEmp tae) throws Exception {
		// begin-user-code
		DAOActividades dao = FactoriaDAO.getInstance().generaDAOActividades();
		DAOEmpleados daoE = FactoriaDAO.getInstance().generaDAOEmpleados();
		TransferEmpleado te = daoE.leer(tae.getidEmpleado());
		if(!te.getEstado()){
			throw new Exception("El empleado seleccionado está dado de baja");
		}
		dao.updateAsig(tae);
		// end-user-code
	}

}