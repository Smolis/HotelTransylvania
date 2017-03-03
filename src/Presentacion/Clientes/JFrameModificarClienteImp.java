/**
 * 
 */
package Presentacion.Clientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main.Main.Evento;
import Negocio.Clientes.TransferCliente;
import Negocio.Comprobador.Comprobador;
import Negocio.Comprobador.Comprobador.TipoDato;
import Presentacion.Actividades.JFrameAltaActividad;
import Presentacion.Controlador.Controlador;
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
public class JFrameModificarClienteImp extends JFrameModificarCliente {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -1044125541992826402L;

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
	private JTextField introduceDNI;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceNombre;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceTelefono;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceContraseña;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceNTarjeta;

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
	private JPanel panelFondo;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		framePrinc = new JFrame("Modificar cliente");
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

		habitacionesButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaHabitacion.getInstance().initGUI();
			}
		});

		JButton clientesButton = new JButton("Clientes");
		clientesButton.setEnabled(false);

		JButton reservasButton = new JButton("Reservas");

		reservasButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAbrirReserva.getInstance().initGUI();
			}
		});

		JButton actividadesButton = new JButton("Actividades");

		actividadesButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaActividad.getInstance().initGUI();
			}
		});

		JButton empleadosButton = new JButton("Empleados");

		empleadosButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameContratarEmpleado.getInstance().initGUI();
			}
		});

		panelSup.add(Box.createRigidArea(new Dimension(135, 0)));
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

		JButton altaCliente = new JButton("Alta Cliente");
		altaCliente.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaCliente.getInstance().initGUI();
			}
		});

		JButton bajaCliente = new JButton("Baja Cliente");
		bajaCliente.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameBajaCliente.getInstance().initGUI();
			}
		});

		JButton modificarCliente = new JButton("Modificar Cliente");
		modificarCliente.setEnabled(false);

		JButton verDetallesCliente = new JButton("Ver Detalles Cliente");
		verDetallesCliente.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameVerDetallesCliente.getInstance().initGUI();
			}
		});

		JButton listarCliente = new JButton("Listar Clientes");
		listarCliente.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameListarClientes.getInstance().initGUI();
			}
		});

		panelLateral.setLayout(new GridLayout(5, 1, 10, 10));
		panelLateral.add(altaCliente);
		panelLateral.add(bajaCliente);
		panelLateral.add(modificarCliente);
		panelLateral.add(verDetallesCliente);
		panelLateral.add(listarCliente);
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

		JLabel id = new JLabel("  Introduce el ID del cliente a modificar: ");
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

		okButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				try {

					String id = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							id);

					Controlador.getInstance().accion(Integer.parseInt(id),
							Evento.MOSTRAR_DATOS_A_MODIFICAR_CLIENTE);

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
	 * @param ta
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarDetalles(final TransferCliente ta) {
		// begin-user-code
		frameDetalles = new JFrame("Detalles del cliente " + ta.getID());
		frameDetalles.setLayout(new GridLayout(7, 2));
		String[] opciones = { "Sí", "No" };

		JLabel mensajeActivo = new JLabel("Está activo: ");
		final JComboBox activo = new JComboBox(opciones);
		if (ta.getEstado()) {
			activo.setSelectedIndex(0);
		} else {
			activo.setSelectedIndex(1);
		}
		frameDetalles.add(mensajeActivo);
		frameDetalles.add(activo);

		JLabel mensajeNombre = new JLabel("Nombre: ");
		frameDetalles.add(mensajeNombre);
		introduceNombre = new JTextField(ta.getNombre());
		frameDetalles.add(introduceNombre);

		JLabel mensajeDNI = new JLabel("DNI: ");
		frameDetalles.add(mensajeDNI);
		introduceDNI = new JTextField(ta.getDNI());
		frameDetalles.add(introduceDNI);

		JLabel mensajeTelefono = new JLabel("Teléfono: ");
		frameDetalles.add(mensajeTelefono);
		introduceTelefono = new JTextField(String.valueOf(ta.getTelf()));
		frameDetalles.add(introduceTelefono);

		JLabel mensajeContraseña = new JLabel("Contraseña: ");
		frameDetalles.add(mensajeContraseña);
		introduceContraseña = new JTextField(ta.getContraseña());
		frameDetalles.add(introduceContraseña);

		JLabel mensajeTarjeta = new JLabel("Número de tarjeta: ");
		frameDetalles.add(mensajeTarjeta);
		introduceNTarjeta = new JTextField(String.valueOf(ta.getTarjeta()));
		frameDetalles.add(introduceNTarjeta);

		frameDetalles.add(new JPanel());
		JButton okButton = new JButton("Aplicar cambios");
		frameDetalles.add(okButton);
		okButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				try {

					String dni = introduceDNI.getText();
					Comprobador.getInstance().comprueba(TipoDato.DNI, dni);

					String nombre = introduceNombre.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, nombre);

					String contraseña = introduceContraseña.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, contraseña);

					String telefono = introduceTelefono.getText();
					Comprobador.getInstance().comprueba(TipoDato.TELEFONO,
							telefono);

					String tarjeta = introduceNTarjeta.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.NUMERO_TARJETA, tarjeta);

					TransferCliente tc = new TransferCliente(ta.getID(), dni,
							nombre, contraseña, Long.parseLong(telefono), Long
									.parseLong(tarjeta), true);
					if (activo.getSelectedIndex() != 0) {
						tc.setEstado(false);
					}

					Controlador.getInstance().accion(tc,
							Evento.MODIFICAR_CLIENTE);
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