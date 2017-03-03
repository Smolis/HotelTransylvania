/**
 * 
 */
package Negocio.Clientes;

import java.io.FileNotFoundException;
import java.util.List;

import Integracion.Clientes.DAOClientes;
import Integracion.FactoriaDAO.FactoriaDAO;
import Integracion.Reservas.DAOReservas;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAClientesImp implements SAClientes {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tc
	 * @return
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TransferCliente tc) throws Exception {
		// begin-user-code
		DAOClientes daoC = FactoriaDAO.getInstance().generaDAOClientes();
		int cont = daoC.leerContador();
		int id = daoC.buscarDNI(tc.getDNI());
		if (id == -1) {
			tc.setID(cont + 1);
			tc.setEstado(true);
			daoC.nuevoCliente(tc);
			daoC.sumarContador();
		} else {
			tc.setID(id);
			tc = daoC.leer(id);
			if (tc.getEstado()) {
				throw new Exception(
						"El cliente ya estaba dado de alta. Se han mantenido los datos antiguos");
			}
			tc.setEstado(true);
			daoC.update(tc);
		}
		return tc.getID();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idCliente
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void baja(int idCliente) throws Exception {
		// begin-user-code
		DAOClientes daoC = FactoriaDAO.getInstance().generaDAOClientes();
		TransferCliente tc = daoC.leer(idCliente);
		if (tc != null && tc.getEstado() && !tieneReservasPendientes(idCliente)) {
			tc.setEstado(false);
			daoC.update(tc);
		} 
		else if (!tc.getEstado()) {
			throw new Exception("El cliente ya estaba dado de baja.");
		}
		else if(tieneReservasPendientes(idCliente)){
			throw new Exception("No se puede dar de baja al cliente porque tiene reservas activas");
		}
		else {
			throw new Exception(
					"No existe ningún cliente con ese identificador.");
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
	public void modificar(TransferCliente tc) throws Exception {
		// begin-user-code
		DAOClientes daoC = FactoriaDAO.getInstance().generaDAOClientes();
		int id = daoC.buscarDNI(tc.getDNI());
		if (id != tc.getID() && id != -1) {
			throw new Exception(
					"El DNI de cliente ya existe en la base de datos.");
		}
		daoC.update(tc);
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
	public TransferCliente verDetalles(int idCliente)
			throws FileNotFoundException {
		// begin-user-code
		DAOClientes daoC = FactoriaDAO.getInstance().generaDAOClientes();
		return daoC.leer(idCliente);
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
		DAOClientes daoC = FactoriaDAO.getInstance().generaDAOClientes();
		return daoC.listar();
		// end-user-code
	}
	
	private boolean tieneReservasPendientes(int idCliente) throws Exception{
		DAOReservas dao = FactoriaDAO.getInstance().generaDAOReservas();
		boolean pendiente = false;
		for(int i = 1; i <= dao.leerContador(); i++){
			if(dao.leer(i).getEstado() && dao.leer(i).getIdCliente() == idCliente)
				pendiente = true;
		}
		return pendiente;
	}
}