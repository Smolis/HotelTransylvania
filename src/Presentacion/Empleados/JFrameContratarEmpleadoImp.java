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
public class JFrameContratarEmpleadoImp extends JFrameContratarEmpleado {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -1966279851665759426L;

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
	private JTextField introduceDatosBanc;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceTel;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceSalario;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceHorario;

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
		framePrinc = new JFrame("Contratar Empleado");
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
		verDetallesEmpleado.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameVerDetallesEmpleado.getInstance().initGUI();
			}
		});

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
		contratarEmpleado.setEnabled(false);
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

		panelCentral.setLayout(new GridLayout(7, 2, 10, 5));
		panelCentral.setOpaque(false);

		JLabel nombre = new JLabel("  Introduce el nombre: ");
		nombre.setForeground(Color.white);
		introduceNombre = new JTextField();
		panelCentral.add(nombre);
		panelCentral.add(introduceNombre);

		JLabel dni = new JLabel("  Introduce el DNI: ");
		dni.setForeground(Color.white);
		introduceDNI = new JTextField();
		panelCentral.add(dni);
		panelCentral.add(introduceDNI);

		JLabel datosBanc = new JLabel("  Introduce el numero de tarjeta: ");
		datosBanc.setForeground(Color.white);
		introduceDatosBanc = new JTextField();
		panelCentral.add(datosBanc);
		panelCentral.add(introduceDatosBanc);

		JLabel tel = new JLabel("  Introduce el telefono: ");
		tel.setForeground(Color.white);
		introduceTel = new JTextField();
		panelCentral.add(tel);
		panelCentral.add(introduceTel);

		JLabel salario = new JLabel("  Introduce el salario: ");
		salario.setForeground(Color.white);
		introduceSalario = new JTextField();
		panelCentral.add(salario);
		panelCentral.add(introduceSalario);

		JLabel horario = new JLabel("  Introduce el horario(HH:MM-HH:MM): ");
		horario.setForeground(Color.white);
		introduceHorario = new JTextField();
		panelCentral.add(horario);
		panelCentral.add(introduceHorario);

		JButton okButton = new JButton("Aceptar");
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panelCentral.add(panel1);
		panelCentral.add(okButton);

		okButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				try {

					String dni = introduceDNI.getText();
					Comprobador.getInstance().comprueba(TipoDato.DNI, dni);

					String nombre = introduceNombre.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, nombre);

					String tarjeta = introduceDatosBanc.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.NUMERO_TARJETA, tarjeta);

					String telefono = introduceTel.getText();
					Comprobador.getInstance().comprueba(TipoDato.TELEFONO,
							telefono);

					String horario = introduceHorario.getText();
					Comprobador.getInstance().comprueba(TipoDato.HORARIO,
							horario);

					String salario = introduceSalario.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							salario);

					Controlador.getInstance().accion(
							new TransferEmpleado(dni, nombre, Long
									.parseLong(tarjeta), Long
									.parseLong(telefono), horario, Integer
									.parseInt(salario), true),
							Evento.CONTRATAR_EMPLEADO);
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