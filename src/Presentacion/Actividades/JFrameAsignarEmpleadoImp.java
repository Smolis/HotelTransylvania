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
import Negocio.Actividades.TransferActEmp;
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
 * <!--&nbsp;begin-UML-doc&nbsp;--><br><!--&nbsp;end-UML-doc&nbsp;--><br>@author&nbsp;Pablo
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JFrameAsignarEmpleadoImp extends JFrameAsignarEmpleado {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -8536352174988244034L;

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
	private JPanel panelIzq;

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
	private JPanel panelSup;

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
	private JTextField introduceIDEmp;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceIDAct;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introduceHoras;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		framePrinc = new JFrame("Asignar Empleado");
		panelFondo = new PanelFondo();
		panelFondo.setLayout(new BorderLayout());
		framePrinc.setLayout(new BorderLayout());

		initPanelIzq();
		initPanelCentral();
		initSupPanel();

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
	private void initSupPanel() {
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
	private void initPanelCentral() {
		// begin-user-code
		panelCentral = new JPanel();

		panelCentral.setLayout(new GridLayout(7, 2, 10, 5));
		panelCentral.setOpaque(false);

		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());

		JLabel actividad = new JLabel("  Introduce el ID de la actividad: ");
		actividad.setForeground(Color.white);
		introduceIDAct = new JTextField();
		panelCentral.add(actividad);
		panelCentral.add(introduceIDAct);

		JLabel empleado = new JLabel("  Introduce el ID del empleado: ");
		empleado.setForeground(Color.white);
		introduceIDEmp = new JTextField();
		panelCentral.add(empleado);
		panelCentral.add(introduceIDEmp);

		JLabel horas = new JLabel("  Introduce el número de horas: ");
		horas.setForeground(Color.white);
		introduceHoras = new JTextField();
		panelCentral.add(horas);
		panelCentral.add(introduceHoras);

		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());

		JButton okButton = new JButton("Aceptar");
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panelCentral.add(panel1);
		panelCentral.add(okButton);

		okButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				try {

					String idAct = introduceIDAct.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							idAct);

					String idEmp = introduceIDEmp.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							idEmp);

					String horas = introduceHoras.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							horas);

					Controlador.getInstance().accion(
							new TransferActEmp(Integer.parseInt(idAct), Integer
									.parseInt(idEmp), Integer.parseInt(horas)),
							Evento.ASIGNAR_EMPLEADO);
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
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private void initPanelIzq() {
		// begin-user-code
		panelIzq = new JPanel();

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
		asignarEmpleado.setEnabled(false);

		JButton modificarActividad = new JButton("Modificar Actividad");
		modificarActividad.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameModificarActividad.getInstance().initGUI();
			}
		});
		JButton verDetalles = new JButton("Ver Detalles de Actividad");
		verDetalles.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameVerDetallesActividad.getInstance().initGUI();
			}
		});
		JButton listarActividades = new JButton("Listar Actividades");
		listarActividades.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameListarActividades.getInstance().initGUI();
			}
		});

		panelIzq.setLayout(new GridLayout(6, 1, 10, 10));
		panelIzq.add(altaActividad);
		panelIzq.add(bajaActividad);
		panelIzq.add(asignarEmpleado);
		panelIzq.add(modificarActividad);
		panelIzq.add(verDetalles);
		panelIzq.add(listarActividades);
		panelIzq.setOpaque(false);
		panelFondo.add(panelIzq, BorderLayout.WEST);

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