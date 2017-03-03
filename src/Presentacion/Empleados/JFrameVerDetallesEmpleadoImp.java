/**
 * 
 */
package Presentacion.Empleados;

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
import Negocio.Comprobador.Comprobador;
import Negocio.Comprobador.Comprobador.TipoDato;
import Negocio.Empleados.TransferEmpleado;
import Presentacion.Actividades.JFrameAltaActividad;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Controlador.Controlador;
import Presentacion.Habitaciones.JFrameAltaHabitacion;
import Presentacion.Imagenes.PanelFondo;
import Presentacion.Reservas.JFrameAbrirReserva;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class JFrameVerDetallesEmpleadoImp extends JFrameVerDetallesEmpleado {
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
		habitacionesButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaHabitacion.getInstance().initGUI();
			}
		});

		JButton clientesButton = new JButton("Clientes");
		clientesButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaCliente.getInstance().initGUI();
			}
		});

		JButton reservasButton = new JButton("Reservas");

		reservasButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAbrirReserva.getInstance().initGUI();
			}
		});

		JButton actividadesButton = new JButton("Actividades");

		actividadesButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaActividad.getInstance().initGUI();
			}
		});

		JButton empleadosButton = new JButton("Empleados");
		empleadosButton.setEnabled(false);

		panelSup.add(Box.createRigidArea(new Dimension(151, 0)));
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

		JButton contratarEmpleado = new JButton("Contratar Empleado");
		contratarEmpleado.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameContratarEmpleado.getInstance().initGUI();
			}
		});

		JButton despedirEmpleado = new JButton("Despedir Empleado");
		despedirEmpleado.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameDespedirEmpleado.getInstance().initGUI();
			}
		});

		JButton modificarEmpleado = new JButton("Modificar Empleado");
		modificarEmpleado.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameModificarEmpleado.getInstance().initGUI();
			}
		});

		JButton verDetallesEmpleado = new JButton("Ver Detalles Empleado");
		verDetallesEmpleado.setEnabled(false);

		JButton listarEmpleados = new JButton("Listar Empleados");
		listarEmpleados.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameListarEmpleados.getInstance().initGUI();
			}
		});

		panelLateral.setLayout(new GridLayout(6, 1, 10, 10));
		panelLateral.add(contratarEmpleado);
		panelLateral.add(despedirEmpleado);
		panelLateral.add(modificarEmpleado);
		panelLateral.add(verDetallesEmpleado);
		panelLateral.add(listarEmpleados);
		verDetallesEmpleado.setEnabled(false);
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

		JLabel id = new JLabel("  Introduce el ID del empleado: ");
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
							Evento.VER_DETALLES_EMPLEADO);
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
	 * @param te
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarDetalles(TransferEmpleado te) {
		// begin-user-code
		JFrame frameDetalles = new JFrame("Detalles del empleado " + te.getID());

		frameDetalles.setLayout(new GridLayout(7, 1));
		String estado;
		if (te.getEstado()) {
			estado = "Si";
		} else {
			estado = "No";
		}
		JLabel mensajeActivo = new JLabel("Está activo: ");
		JLabel estadoL = new JLabel(estado);
		frameDetalles.add(mensajeActivo);
		frameDetalles.add(estadoL);

		JLabel mensajeNombre = new JLabel("Nombre: ");
		JLabel nombre = new JLabel(te.getNombre());
		frameDetalles.add(mensajeNombre);
		frameDetalles.add(nombre);

		JLabel mensajeDNI = new JLabel("DNI: ");
		JLabel dni = new JLabel(te.getDNI());
		frameDetalles.add(mensajeDNI);
		frameDetalles.add(dni);

		JLabel mensajeTelefono = new JLabel("Teléfono: ");
		JLabel tel = new JLabel(String.valueOf(te.getTelefono()));
		frameDetalles.add(mensajeTelefono);
		frameDetalles.add(tel);

		JLabel mensajeDatosB = new JLabel("Datos Bancarios: ");
		JLabel banc = new JLabel(String.valueOf(te.getDatosBanc()));
		frameDetalles.add(mensajeDatosB);
		frameDetalles.add(banc);

		JLabel mensajeHorario = new JLabel("Horario: ");
		JLabel hor = new JLabel(te.getHorario());
		frameDetalles.add(mensajeHorario);
		frameDetalles.add(hor);

		JLabel mensajeSalario = new JLabel("Salario: ");
		JLabel sueldo = new JLabel(String.valueOf(te.getSueldo()));
		frameDetalles.add(mensajeSalario);
		frameDetalles.add(sueldo);

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