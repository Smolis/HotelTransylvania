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
@SuppressWarnings("serial")
public class JFrameAltaClienteImp extends JFrameAltaCliente {

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
	private JTextField introduceNombre;

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
	private JTextField introduceContraseña;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceTlf;

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
	private PanelFondo panelFondo;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		framePrinc = new JFrame("Alta cliente");
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
		altaCliente.setEnabled(false);

		JButton bajaCliente = new JButton("Baja Cliente");
		bajaCliente.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameBajaCliente.getInstance().initGUI();
			}
		});

		JButton modificarCliente = new JButton("Modificar Cliente");
		modificarCliente.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameModificarCliente.getInstance().initGUI();
			}
		});

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

		JLabel nombre = new JLabel("  Introduce el nombre: ");
		nombre.setForeground(Color.white);
		panelCentral.add(nombre);
		introduceNombre = new JTextField();
		panelCentral.add(introduceNombre);

		JLabel dni = new JLabel("  Introduce el DNI: ");
		dni.setForeground(Color.white);
		panelCentral.add(dni);
		introduceDNI = new JTextField();
		panelCentral.add(introduceDNI);

		JLabel contraseña = new JLabel("  Introduce la contraseña: ");
		contraseña.setForeground(Color.white);
		panelCentral.add(contraseña);
		introduceContraseña = new JTextField();
		panelCentral.add(introduceContraseña);

		JLabel tlf = new JLabel("  Introduce el telefono: ");
		tlf.setForeground(Color.white);
		panelCentral.add(tlf);
		introduceTlf = new JTextField();
		panelCentral.add(introduceTlf);

		JLabel nTarjeta = new JLabel("  Introduce el numero de tarjeta: ");
		nTarjeta.setForeground(Color.white);
		panelCentral.add(nTarjeta);
		introduceNTarjeta = new JTextField();
		panelCentral.add(introduceNTarjeta);

		JButton okButton = new JButton("Aceptar");
		panelCentral.add(new JLabel());
		panelCentral.add(okButton);
		panelCentral.setOpaque(false);

		okButton.addActionListener(new ActionListenerClientes() {
			public void actionPerformed(ActionEvent ae) {
				try {

					String dni = introduceDNI.getText();
					Comprobador.getInstance().comprueba(TipoDato.DNI, dni);

					String nombre = introduceNombre.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, nombre);

					String contraseña = introduceContraseña.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, contraseña);

					String telefono = introduceTlf.getText();
					Comprobador.getInstance().comprueba(TipoDato.TELEFONO,
							telefono);

					String tarjeta = introduceNTarjeta.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.NUMERO_TARJETA, tarjeta);

					Controlador.getInstance().accion(
							new TransferCliente(dni, nombre, contraseña, Long
									.parseLong(telefono), Long
									.parseLong(tarjeta)), Evento.ALTA_CLIENTE);
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