package Presentacion.Habitaciones;

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
import Negocio.Habitaciones.TransferHabitacion;
import Presentacion.Actividades.JFrameAltaActividad;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Controlador.Controlador;
import Presentacion.Empleados.JFrameContratarEmpleado;
import Presentacion.Imagenes.PanelFondo;
import Presentacion.Reservas.JFrameAbrirReserva;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JFrameAltaHabitacionImp extends JFrameAltaHabitacion {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -4570453187443726192L;
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
	private JPanel panelDer;
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
	private JTextField introduceNumHab;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField introducePrecioHab;

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
		framePrinc = new JFrame("Alta Habitacion");
		panelFondo = new PanelFondo();
		panelFondo.setLayout(new BorderLayout());
		framePrinc.setLayout(new BorderLayout());

		initPanelIzq();
		initPanelDer();
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
		habitacionesButton.setEnabled(false);

		JButton clientesButton = new JButton("Clientes");
		clientesButton.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaCliente.getInstance().initGUI();
			}
		});

		JButton reservasButton = new JButton("Reservas");

		reservasButton.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAbrirReserva.getInstance().initGUI();
			}
		});

		JButton actividadesButton = new JButton("Actividades");

		actividadesButton.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaActividad.getInstance().initGUI();
			}
		});

		JButton empleadosButton = new JButton("Empleados");
		empleadosButton.addActionListener(new ActionListenerHabitaciones() {
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
	private void initPanelDer() {
		// begin-user-code  
		panelDer = new JPanel();
		panelDer.setLayout(new GridLayout(7, 2, 10, 5));

		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());

		JLabel numeroHab = new JLabel("  Introduce el número de habitación: ");
		numeroHab.setForeground(Color.white);
		panelDer.add(numeroHab);
		introduceNumHab = new JTextField();
		panelDer.add(introduceNumHab);

		JLabel precioHab = new JLabel("  Introduce el precio de habitación: ");
		precioHab.setForeground(Color.white);
		panelDer.add(precioHab);
		introducePrecioHab = new JTextField();
		panelDer.add(introducePrecioHab);

		JButton aceptar = new JButton("Aceptar");
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(aceptar);
		panelDer.setOpaque(false);

		aceptar.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent ae) {
				try {

					String numHab = introduceNumHab.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							numHab);

					String precio = introducePrecioHab.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							precio);

					Controlador.getInstance().accion(
							new TransferHabitacion(Integer.parseInt(numHab),
									Integer.parseInt(precio), true),
							Evento.ALTA_HABITACION);
				} catch (Exception ex) {
					update(ex.getMessage());
				}
			}
		});

		panelFondo.add(panelDer, BorderLayout.CENTER);

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

		JButton altaHabitacion = new JButton("Alta Habitación");
		altaHabitacion.setEnabled(false);

		JButton bajaHabitacion = new JButton("Baja Habitacion");
		bajaHabitacion.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameBajaHabitacion.getInstance().initGUI();
			}
		});

		JButton modificarHabitacion = new JButton("Modificar Habitación");
		modificarHabitacion.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameModificarHabitacion.getInstance().initGUI();
			}
		});
		JButton verDetalles = new JButton("Ver detalles de Habitación");
		verDetalles.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameVerDetallesHabitacion.getInstance().initGUI();
			}
		});
		JButton listarHabitaciones = new JButton("Listar Habitaciones");
		listarHabitaciones.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameListarHabitaciones.getInstance().initGUI();
			}
		});

		panelIzq.setLayout(new GridLayout(5, 1, 10, 10));
		panelIzq.add(altaHabitacion);
		panelIzq.add(bajaHabitacion);
		panelIzq.add(modificarHabitacion);
		panelIzq.add(verDetalles);
		panelIzq.add(listarHabitaciones);
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
