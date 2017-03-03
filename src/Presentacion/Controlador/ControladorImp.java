/**
 * 
 */
package Presentacion.Controlador;

import Main.Main.Evento;
import Negocio.Actividades.TransferActEmp;
import Negocio.Actividades.TransferActividad;
import Negocio.Clientes.TransferCliente;
import Negocio.Empleados.TransferEmpleado;
import Negocio.FactoriaSA.FactoriaSA;
import Negocio.Habitaciones.TransferHabitacion;
import Negocio.Reservas.TransferReserva;
import Presentacion.Actividades.JFrameAltaActividad;
import Presentacion.Actividades.JFrameAsignarEmpleado;
import Presentacion.Actividades.JFrameBajaActividad;
import Presentacion.Actividades.JFrameListarActividades;
import Presentacion.Actividades.JFrameModificarActividad;
import Presentacion.Actividades.JFrameVerDetallesActividad;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Clientes.JFrameBajaCliente;
import Presentacion.Clientes.JFrameListarClientes;
import Presentacion.Clientes.JFrameModificarCliente;
import Presentacion.Clientes.JFrameVerDetallesCliente;
import Presentacion.Empleados.JFrameContratarEmpleado;
import Presentacion.Empleados.JFrameDespedirEmpleado;
import Presentacion.Empleados.JFrameListarEmpleados;
import Presentacion.Empleados.JFrameModificarEmpleado;
import Presentacion.Empleados.JFrameVerDetallesEmpleado;
import Presentacion.Habitaciones.JFrameAltaHabitacion;
import Presentacion.Habitaciones.JFrameBajaHabitacion;
import Presentacion.Habitaciones.JFrameListarHabitaciones;
import Presentacion.Habitaciones.JFrameModificarHabitacion;
import Presentacion.Habitaciones.JFrameVerDetallesHabitacion;
import Presentacion.Reservas.JFrameAbrirReserva;
import Presentacion.Reservas.JFrameCancelarReserva;
import Presentacion.Reservas.JFrameCerrarReserva;
import Presentacion.Reservas.JFrameListarReservas;
import Presentacion.Reservas.JFrameModificarReserva;
import Presentacion.Reservas.JFrameVerDetallesReserva;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ControladorImp extends Controlador {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param data
	 * @param evento
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void accion(Object data, Evento evento) {
		// begin-user-code
		switch (evento) {
		case ALTA_HABITACION:
			try {
				FactoriaSA.getInstance().generaSAHabitaciones()
						.alta((TransferHabitacion) data);
			} catch (Exception e) {
				JFrameAltaHabitacion.getInstance().update(e.getMessage());
			}
			break;
		case BAJA_HABITACION:
			try {
				FactoriaSA.getInstance().generaSAHabitaciones()
						.baja((Integer) data);
			} catch (Exception e) {
				JFrameBajaHabitacion.getInstance().update(e.getMessage());
			}
			break;
		case MOSTRAR_DATOS_A_MODIFICAR_HABITACION:
			try {
				JFrameModificarHabitacion.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAHabitaciones()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameModificarHabitacion.getInstance().update(e.getMessage());
			}
			break;
		case MODIFICAR_HABITACION:
			try {
				FactoriaSA.getInstance().generaSAHabitaciones()
						.modificar((TransferHabitacion) data);
			} catch (Exception e) {
				JFrameModificarHabitacion.getInstance().update(e.getMessage());
			}
			break;
		case LISTAR_HABITACIONES:
			try {
				JFrameListarHabitaciones.getInstance().updateTable(
						FactoriaSA.getInstance().generaSAHabitaciones()
								.listar());
			} catch (Exception e) {
				JFrameListarHabitaciones.getInstance().update(e.getMessage());
			}
			break;
		case VER_DETALLES_HABITACION:
			try {
				JFrameVerDetallesHabitacion.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAHabitaciones()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameVerDetallesHabitacion.getInstance()
						.update(e.getMessage());
			}
			break;

		case ALTA_CLIENTE:
			try {
				FactoriaSA.getInstance().generaSAClientes()
						.alta((TransferCliente) data);
			} catch (Exception e) {
				JFrameAltaCliente.getInstance().update(e.getMessage());
			}
			break;

		case BAJA_CLIENTE:
			try {
				FactoriaSA.getInstance().generaSAClientes()
						.baja((Integer) data);
			} catch (Exception e) {
				JFrameBajaCliente.getInstance().update(e.getMessage());
			}
			break;

		case MOSTRAR_DATOS_A_MODIFICAR_CLIENTE:
			try {
				JFrameModificarCliente.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAClientes()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameModificarCliente.getInstance().update(e.getMessage());
			}
			break;

		case MODIFICAR_CLIENTE:
			try {
				FactoriaSA.getInstance().generaSAClientes()
						.modificar((TransferCliente) data);
			} catch (Exception e) {
				JFrameModificarCliente.getInstance().update(e.getMessage());
			}
			break;

		case VER_DETALLES_CLIENTE:
			try {
				JFrameVerDetallesCliente.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAClientes()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameVerDetallesCliente.getInstance().update(e.getMessage());
			}
			break;

		case LISTAR_CLIENTES:
			try {
				JFrameListarClientes.getInstance().updateTable(
						FactoriaSA.getInstance().generaSAClientes().listar());
			} catch (Exception e) {
				JFrameListarClientes.getInstance().update(e.getMessage());
			}
			break;

		case CONTRATAR_EMPLEADO:
			try {
				FactoriaSA.getInstance().generaSAEmpleados()
						.contratar((TransferEmpleado) data);
			} catch (Exception e) {
				JFrameContratarEmpleado.getInstance().update(e.getMessage());
			}
			break;

		case DESPEDIR_EMPLEADO:
			try {
				FactoriaSA.getInstance().generaSAEmpleados()
						.despedir((Integer) data);
			} catch (Exception e) {
				JFrameDespedirEmpleado.getInstance().update(e.getMessage());
			}
			break;

		case LISTAR_EMPLEADOS:
			try {
				JFrameListarEmpleados.getInstance().updateTable(
						FactoriaSA.getInstance().generaSAEmpleados().listar());
			} catch (Exception e) {
				JFrameListarEmpleados.getInstance().update(e.getMessage());
			}
			break;
		case MOSTRAR_DATOS_A_MODIFICAR_EMPLEADO:
			try {
				JFrameModificarEmpleado.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAEmpleados()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameModificarEmpleado.getInstance().update(e.getMessage());
			}
			break;

		case MODIFICAR_EMPLEADO:
			try {
				FactoriaSA.getInstance().generaSAEmpleados()
						.modificar((TransferEmpleado) data);
			} catch (Exception e) {
				JFrameModificarEmpleado.getInstance().update(e.getMessage());
			}
			break;

		case VER_DETALLES_EMPLEADO:
			try {
				JFrameVerDetallesEmpleado.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAEmpleados()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameVerDetallesEmpleado.getInstance().update(e.getMessage());
			}
			break;

		case ALTA_ACTIVIDAD:
			try {
				FactoriaSA.getInstance().generaSAActividades()
						.alta((TransferActividad) data);
			} catch (Exception e) {
				JFrameAltaActividad.getInstance().update(e.getMessage());
			}
			break;

		case BAJA_ACTIVIDAD:
			try {
				FactoriaSA.getInstance().generaSAActividades()
						.baja((Integer) data);
			} catch (Exception e) {
				JFrameBajaActividad.getInstance().update(e.getMessage());
			}
			break;

		case ASIGNAR_EMPLEADO:
			try {
				FactoriaSA.getInstance().generaSAActividades()
						.asignar((TransferActEmp) data);
			} catch (Exception e) {
				JFrameAsignarEmpleado.getInstance().update(e.getMessage());
			}
			break;
		case LISTAR_ACTIVIDADES:
			try {
				JFrameListarActividades.getInstance()
						.updateTable(
								FactoriaSA.getInstance().generaSAActividades()
										.listar());
			} catch (Exception e) {
				JFrameListarActividades.getInstance().update(e.getMessage());
			}
			break;

		case VER_DETALLES_ACTIVIDAD:
			try {
				JFrameVerDetallesActividad.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAActividades()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameVerDetallesActividad.getInstance().update(e.getMessage());
			}
			break;
		case MOSTRAR_DATOS_A_MODIFICAR_ACTIVIDAD:
			try {
				JFrameModificarActividad.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAActividades()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameModificarActividad.getInstance().update(e.getMessage());
			}
			break;

		case MODIFICAR_ACTIVIDAD:
			try {
				FactoriaSA.getInstance().generaSAActividades()
						.modificar((TransferActividad) data);
			} catch (Exception e) {
				JFrameModificarActividad.getInstance().update(e.getMessage());
			}
			break;

		case ABRIR_RESERVA:

			try {
				FactoriaSA.getInstance().generaSAReservas()
						.abrir((TransferReserva) data);
			} catch (Exception e) {
				JFrameAbrirReserva.getInstance().update(e.getMessage());
			}
			break;

		case CERRAR_RESERVA:

			try {
				FactoriaSA.getInstance().generaSAReservas()
						.cerrar((Integer) data);
			} catch (Exception e) {
				JFrameCerrarReserva.getInstance().update(e.getMessage());
			}
			break;
		case CANCELAR_RESERVA:

			try {
				FactoriaSA.getInstance().generaSAReservas()
						.cancelar((Integer) data);
			} catch (Exception e) {
				JFrameCancelarReserva.getInstance().update(e.getMessage());
			}
			break;

		case LISTAR_RESERVAS:
			try {
				JFrameListarReservas.getInstance().updateTable(
						FactoriaSA.getInstance().generaSAReservas().listar());
			} catch (Exception e) {
				JFrameListarReservas.getInstance().update(e.getMessage());
			}
			break;

		case MOSTRAR_DATOS_A_MODIFICAR_RESERVA:
			try {
				JFrameModificarReserva.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAReservas()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameModificarReserva.getInstance().update(e.getMessage());
			}
			break;
		case MODIFICAR_RESERVA:
			try {
				FactoriaSA.getInstance().generaSAReservas()
						.modificar((TransferReserva) data);
			} catch (Exception e) {
				JFrameModificarReserva.getInstance().update(e.getMessage());
			}
			break;

		case VER_DETALLES_RESERVA:
			try {
				JFrameVerDetallesReserva.getInstance().mostrarDetalles(
						FactoriaSA.getInstance().generaSAReservas()
								.verDetalles((Integer) data));
			} catch (Exception e) {
				JFrameVerDetallesReserva.getInstance().update(e.getMessage());
			}
			break;

		}

	}

	// end-user-code
}
