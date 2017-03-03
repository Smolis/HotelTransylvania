/**
 * 
 */
package Presentacion.Actividades;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main.Main.Evento;
import Negocio.Actividades.TransferActividad;
import Negocio.Comprobador.Comprobador;
import Negocio.Comprobador.Comprobador.TipoDato;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Controlador.Controlador;
import Presentacion.Empleados.ActionListenerEmpleados;
import Presentacion.Empleados.JFrameContratarEmpleado;
import Presentacion.Habitaciones.JFrameAltaHabitacion;
import Presentacion.Imagenes.PanelFondo;
import Presentacion.Reservas.JFrameAbrirReserva;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JFrameVerDetallesActividadImp extends JFrameVerDetallesActividad {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -1918467734263860315L;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JFrame framePrinc;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JPanel panelSup;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JPanel panelLateral;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JPanel panelCentral;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceID;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JPanel panelFondo;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		framePrinc = new JFrame("Ver Detalles del Empleado");
		panelFondo = new PanelFondo();
		panelFondo.setLayout(new BorderLayout());
		framePrinc.setLayout(new BorderLayout());

		initSupPanel();

		initLateralPanel();

		initCentralPanel();

		framePrinc.add(panelFondo);
		framePrinc.pack();
		framePrinc.setVisible(true);
		framePrinc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initSupPanel() {
		// begin-user-code
		panelSup = new JPanel(new GridLayout(1, 6, 10, 10));

		JButton habitacionesButton = new JButton("Habitaciones");
		habitacionesButton.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaHabitacion.getInstance().initGUI();
			}
		});

		JButton clientesButton = new JButton("Clientes");
		clientesButton.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaCliente.getInstance().initGUI();
			}
		});

		JButton reservasButton = new JButton("Reservas");

		reservasButton.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAbrirReserva.getInstance().initGUI();
			}
		});

		JButton actividadesButton = new JButton("Actividades");
		actividadesButton.setEnabled(false);

		JButton empleadosButton = new JButton("Empleados");
		empleadosButton.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameContratarEmpleado.getInstance().initGUI();
			}
		});

		panelSup.add(Box.createRigidArea(new Dimension(172, 0)));
		panelSup.add(clientesButton);
		panelSup.add(reservasButton);
		panelSup.add(habitacionesButton);
		panelSup.add(actividadesButton);
		panelSup.add(empleadosButton);
		panelSup.setOpaque(false);
		panelFondo.add(panelSup, BorderLayout.NORTH);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initLateralPanel() {
		// begin-user-code
		panelLateral = new JPanel();

		JButton altaActividad = new JButton("Alta Actividad");
		altaActividad.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaActividad.getInstance().initGUI();
			}
		});

		JButton bajaActividad = new JButton("Baja Actividad");
		bajaActividad.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameBajaActividad.getInstance().initGUI();
			}
		});

		JButton asignarEmpleado = new JButton("Asignar Empleado");
		asignarEmpleado.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAsignarEmpleado.getInstance().initGUI();
			}
		});

		JButton modificarActividad = new JButton("Modificar Actividad");
		modificarActividad.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameModificarActividad.getInstance().initGUI();
			}
		});
		JButton verDetalles = new JButton("Ver Detalles de Actividad");
		verDetalles.setEnabled(false);

		JButton listarActividades = new JButton("Listar Actividades");
		listarActividades.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameListarActividades.getInstance().initGUI();
			}
		});

		panelLateral.setLayout(new GridLayout(6, 1, 10, 10));
		panelLateral.add(altaActividad);
		panelLateral.add(bajaActividad);
		panelLateral.add(asignarEmpleado);
		panelLateral.add(modificarActividad);
		panelLateral.add(verDetalles);
		panelLateral.add(listarActividades);
		panelLateral.setOpaque(false);

		panelFondo.add(panelLateral, BorderLayout.WEST);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initCentralPanel() {
		// begin-user-code
		panelCentral = new JPanel();
		panelCentral.setOpaque(false);
		panelCentral.setLayout(new GridLayout(6, 2, 10, 5));

		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());

		JLabel id = new JLabel(
				"  Introduce el ID de la actividad a visualizar: ");
		id.setForeground(Color.white);
		panelCentral.add(id);
		introduceID = new JTextField();
		panelCentral.add(introduceID);

		JButton okButton = new JButton("Aceptar");
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(okButton);

		okButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				try {

					String id = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							id);

					Controlador.getInstance().accion(Integer.parseInt(id),
							Evento.VER_DETALLES_ACTIVIDAD);
				} catch (Exception ex) {
					update(ex.getMessage());
				}
			}
		});

		panelFondo.add(panelCentral);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ta
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarDetalles(TransferActividad ta) {
		// begin-user-code
		JFrame frameDetalles = new JFrame("Detalles de la actividad "
				+ ta.getID());

		frameDetalles.setLayout(new GridLayout(7, 1));
		String estado;
		if (ta.getEstado()) {
			estado = "Si";
		} else {
			estado = "No";
		}
		JLabel mensajeActivo = new JLabel("Está activo: ");
		JLabel estadoL = new JLabel(estado);
		frameDetalles.add(mensajeActivo);
		frameDetalles.add(estadoL);

		JLabel mensajeNombre = new JLabel("Nombre: ");
		JLabel nombre = new JLabel(ta.getNombre());
		frameDetalles.add(mensajeNombre);
		frameDetalles.add(nombre);

		JLabel mensajeLugar = new JLabel("Lugar: ");
		JLabel lugar = new JLabel(ta.getLugar());
		frameDetalles.add(mensajeLugar);
		frameDetalles.add(lugar);

		JLabel mensajeFecha = new JLabel("Fecha inicio: ");
		JLabel fecha = new JLabel(String.valueOf(ta.getFecha()));
		frameDetalles.add(mensajeFecha);
		frameDetalles.add(fecha);

		JLabel mensajeDuracion = new JLabel("Duración: ");
		JLabel duracion = new JLabel(String.valueOf(ta.getDuracion()));
		frameDetalles.add(mensajeDuracion);
		frameDetalles.add(duracion);

		JLabel mensajeHorario = new JLabel("Horario: ");
		JLabel hor = new JLabel(ta.getHora());
		frameDetalles.add(mensajeHorario);
		frameDetalles.add(hor);

		JLabel mensajeEmpleados = new JLabel("Número de empleados: ");
		JLabel empleados = new JLabel(String.valueOf(ta.getListaEmp().size()));
		frameDetalles.add(mensajeEmpleados);
		frameDetalles.add(empleados);

		frameDetalles.setPreferredSize(new Dimension(400, 200));
		frameDetalles.pack();
		frameDetalles.setVisible(true);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param msg
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update(String msg) {
		// begin-user-code
		JOptionPane.showMessageDialog(framePrinc, msg, "Error",
				JOptionPane.ERROR_MESSAGE);
		// end-user-code
	}

}