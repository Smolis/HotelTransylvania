/**
 * 
 */
package Presentacion.Reservas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Main.Main.Evento;
import Negocio.Comprobador.Comprobador;
import Negocio.Comprobador.Comprobador.TipoDato;
import Negocio.Reservas.TransferReserva;
import Presentacion.Actividades.JFrameAltaActividad;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Controlador.Controlador;
import Presentacion.Empleados.JFrameContratarEmpleado;
import Presentacion.Habitaciones.JFrameAltaHabitacion;
import Presentacion.Imagenes.PanelFondo;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JFrameAbrirReservaImp extends JFrameAbrirReserva {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -3646180326956362590L;

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
	private JTextField introduceNoches;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceHabs;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private PanelFondo panelFondo;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JFormattedTextField dateTextField;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		framePrinc = new JFrame("Abrir reserva");
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
		habitacionesButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaHabitacion.getInstance().initGUI();
			}
		});

		JButton clientesButton = new JButton("Clientes");
		clientesButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaCliente.getInstance().initGUI();
			}
		});
		JButton reservasButton = new JButton("Reservas");
		reservasButton.setEnabled(false);

		JButton actividadesButton = new JButton("Actividades");

		actividadesButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaActividad.getInstance().initGUI();
			}
		});

		JButton empleadosButton = new JButton("Empleados");

		empleadosButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameContratarEmpleado.getInstance().initGUI();
			}
		});

		panelSup.add(Box.createRigidArea(new Dimension(143, 0)));
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

		JButton abrirReserva = new JButton("Abrir Reserva");
		abrirReserva.setEnabled(false);

		JButton cerrarReserva = new JButton("Cerrar Reserva");
		cerrarReserva.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameCerrarReserva.getInstance().initGUI();
			}
		});

		JButton cancelarReserva = new JButton("Cancelar Reserva");
		cancelarReserva.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameCancelarReserva.getInstance().initGUI();
			}
		});

		JButton modificarReserva = new JButton("Modificar Reserva");
		modificarReserva.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameModificarReserva.getInstance().initGUI();
			}
		});

		JButton verDetallesReserva = new JButton("Ver Detalles Reserva");
		verDetallesReserva.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameVerDetallesReserva.getInstance().initGUI();
			}
		});

		JButton listarReservas = new JButton("Listar Reservas");
		listarReservas.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameListarReservas.getInstance().initGUI();
			}
		});

		panelLateral.setLayout(new GridLayout(6, 1, 10, 10));
		panelLateral.add(abrirReserva);
		panelLateral.add(cerrarReserva);
		panelLateral.add(cancelarReserva);
		panelLateral.add(modificarReserva);
		panelLateral.add(verDetallesReserva);
		panelLateral.add(listarReservas);
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
		panelCentral.setLayout(new GridLayout(5, 2, 10, 5));

		JLabel id = new JLabel("  Introduce el ID del cliente: ");
		id.setForeground(Color.white);
		panelCentral.add(id);
		introduceID = new JTextField();
		panelCentral.add(introduceID);

		JLabel fecha = new JLabel(
				"  Introduce la fecha de inicio: (DD/MM/YYYY) ");
		fecha.setForeground(Color.white);

		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("##/##/####");
		} catch (Exception ex) {
		}

		dateTextField = new JFormattedTextField(mascara);
		panelCentral.add(fecha);
		panelCentral.add(dateTextField);

		JLabel noches = new JLabel("  Introduce el numero de noches: ");
		noches.setForeground(Color.white);
		panelCentral.add(noches);
		introduceNoches = new JTextField();
		panelCentral.add(introduceNoches);

		JLabel habs = new JLabel("  Introduce el numero de habitaciones: ");
		habs.setForeground(Color.white);
		panelCentral.add(habs);
		introduceHabs = new JTextField();
		panelCentral.add(introduceHabs);

		JButton okButton = new JButton("Aceptar");
		panelCentral.add(new JLabel());
		panelCentral.add(okButton);
		panelCentral.setOpaque(false);

		okButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent ae) {
				try {

					String idCliente = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							idCliente);

					String fecha = dateTextField.getText();
					Comprobador.getInstance().comprueba(TipoDato.FECHA, fecha);

					String noches = introduceNoches.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							noches);

					String numHabs = introduceHabs.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							numHabs);

					Controlador.getInstance().accion(
							new TransferReserva(Integer.parseInt(idCliente),
									fecha, Integer.parseInt(noches), Integer
											.parseInt(numHabs), 0, false),
							Evento.ABRIR_RESERVA);
				} catch (Exception ex) {
					update(ex.getMessage());
				}
			}
		});

		panelFondo.add(panelCentral, BorderLayout.CENTER);
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