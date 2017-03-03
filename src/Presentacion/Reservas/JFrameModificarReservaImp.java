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
import javax.swing.JComboBox;
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
public class JFrameModificarReservaImp extends JFrameModificarReserva {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = 594383871213552366L;

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
	private JFrame frameDetalles;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField idCliente;

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
	private JTextField introducePrecio;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceHabitaciones;

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
		framePrinc = new JFrame("Modificar reserva");
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
		abrirReserva.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAbrirReserva.getInstance().initGUI();
			}
		});

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
		modificarReserva.setEnabled(false);

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
		panelCentral.setLayout(new GridLayout(6, 2, 10, 5));

		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());

		JLabel id = new JLabel("  Introduce el ID de la reserva a modificar: ");
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
		panelCentral.setOpaque(false);

		panelCentral.add(okButton);

		okButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				try {

					String id = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							id);

					Controlador.getInstance().accion(Integer.parseInt(id),
							Evento.MOSTRAR_DATOS_A_MODIFICAR_RESERVA);

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
	 * @param tr
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarDetalles(final TransferReserva tr) {
		// begin-user-code

		frameDetalles = new JFrame("Detalles de la reserva "
				+ tr.getIdReserva());
		frameDetalles.setLayout(new GridLayout(7, 2));

		String[] opciones = { "Sí", "No" };

		JLabel mensajeActivo = new JLabel("Está activo: ");
		final JComboBox activo = new JComboBox(opciones);
		if (tr.getEstado()) {
			activo.setSelectedIndex(0);
		} else {
			activo.setSelectedIndex(1);
		}
		frameDetalles.add(mensajeActivo);
		frameDetalles.add(activo);

		JLabel mensajeIdCliente = new JLabel("ID cliente: ");
		frameDetalles.add(mensajeIdCliente);
		idCliente = new JTextField(String.valueOf(tr.getIdCliente()));
		frameDetalles.add(idCliente);

		JLabel fecha = new JLabel("  Fecha de inicio: (DD/MM/YYYY) ");
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("##/##/####");
		} catch (Exception ex) {
		}

		dateTextField = new JFormattedTextField(mascara);
		dateTextField.setText(tr.getFechaEntrada());
		frameDetalles.add(fecha);
		frameDetalles.add(dateTextField);

		JLabel mensajeNoches = new JLabel("Noches: ");
		frameDetalles.add(mensajeNoches);
		introduceNoches = new JTextField(String.valueOf(tr.getNoches()));
		frameDetalles.add(introduceNoches);

		JLabel mensajeHabitaciones = new JLabel("Numero de habitaciones: ");
		frameDetalles.add(mensajeHabitaciones);
		introduceHabitaciones = new JTextField(String.valueOf(tr.getNumHab()));
		frameDetalles.add(introduceHabitaciones);

		JLabel mensajePrecioTotal = new JLabel("Precio Total: ");
		frameDetalles.add(mensajePrecioTotal);
		introducePrecio = new JTextField(String.valueOf(tr.getPrecioTotal()));
		frameDetalles.add(introducePrecio);

		frameDetalles.add(new JPanel());
		JButton okButton = new JButton("Aplicar cambios");
		frameDetalles.add(okButton);
		okButton.addActionListener(new ActionListenerReservas() {
			public void actionPerformed(ActionEvent e) {
				try {

					String idCliente = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							idCliente);

					String fecha = dateTextField.getText();
					Comprobador.getInstance().comprueba(TipoDato.FECHA, fecha);

					String noches = introduceNoches.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							noches);

					String numHabs = introduceHabitaciones.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							numHabs);

					String precio = introducePrecio.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							precio);

					TransferReserva tr2 = new TransferReserva(
							tr.getIdReserva(), Integer.parseInt(idCliente),
							fecha, Integer.parseInt(noches), Integer
									.parseInt(numHabs), Integer
									.parseInt(precio), true);
					if (activo.getSelectedIndex() != 0) {
						tr2.setEstado(false);
					}
					Controlador.getInstance().accion(tr2,
							Evento.MODIFICAR_RESERVA);
					frameDetalles.dispose();
				} catch (Exception ex) {
					update(ex.getMessage());
				}
			}
		});

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