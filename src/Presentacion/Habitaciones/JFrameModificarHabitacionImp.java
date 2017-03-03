/**
 * 
 */
package Presentacion.Habitaciones;

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
public class JFrameModificarHabitacionImp extends JFrameModificarHabitacion {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = 9077106528279678066L;
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
	private JTextField introduceID;
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
	private JFrame frameDetalles;
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
		framePrinc = new JFrame("Modificar Habitacion");
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

	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private void initPanelDer() {
		// begin-user-code
		panelDer = new JPanel();
		panelDer.setLayout(new GridLayout(6, 2, 10, 5));

		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());
		panelDer.add(new JLabel());

		JLabel numHab = new JLabel(
				"  Introduce el ID de la habitacion a modificar: ");
		numHab.setForeground(Color.white);
		panelDer.add(numHab);
		introduceID = new JTextField();
		panelDer.add(introduceID);

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

					String id = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							id);

					Controlador.getInstance().accion(Integer.parseInt(id),
							Evento.MOSTRAR_DATOS_A_MODIFICAR_HABITACION);
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
		altaHabitacion.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAltaHabitacion.getInstance().initGUI();
			}
		});

		JButton bajaHabitacion = new JButton("Baja Habitacion");
		bajaHabitacion.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameBajaHabitacion.getInstance().initGUI();
			}
		});

		JButton modificarHabitacion = new JButton("Modificar Habitación");
		modificarHabitacion.setEnabled(false);

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

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param th
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarDetalles(final TransferHabitacion th) {
		// begin-user-code
		frameDetalles = new JFrame("Detalles de la habitacion " + th.getID());
		frameDetalles.setLayout(new GridLayout(4, 2));
		String[] opciones = { "Sí", "No" };

		JLabel mensajeActivo = new JLabel("Está activo: ");
		final JComboBox activo = new JComboBox(opciones);
		if (th.getEstado()) {
			activo.setSelectedIndex(0);
		} else {
			activo.setSelectedIndex(1);
		}
		frameDetalles.add(mensajeActivo);
		frameDetalles.add(activo);

		JLabel mensajeNumHab = new JLabel("Número de la habitación: ");
		frameDetalles.add(mensajeNumHab);
		introduceNumHab = new JTextField(String.valueOf(th.getNumHab()));
		frameDetalles.add(introduceNumHab);

		JLabel mensajePrecioHab = new JLabel("Precio de la habitación: ");
		frameDetalles.add(mensajePrecioHab);
		introducePrecioHab = new JTextField(String.valueOf(th.getPrecio()));
		frameDetalles.add(introducePrecioHab);

		frameDetalles.add(new JPanel());
		JButton okButton = new JButton("Aplicar cambios");
		frameDetalles.add(okButton);
		okButton.addActionListener(new ActionListenerHabitaciones() {
			public void actionPerformed(ActionEvent e) {
				try {

					String numHab = introduceNumHab.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							numHab);

					String precio = introducePrecioHab.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							precio);

					TransferHabitacion th2 = new TransferHabitacion(th.getID(),
							Integer.parseInt(numHab), Integer.parseInt(precio),
							true);
					if (activo.getSelectedIndex() != 0) {
						th2.setEstado(false);
					}
					Controlador.getInstance().accion(th2,
							Evento.MODIFICAR_HABITACION);
					frameDetalles.dispose();
				} catch (Exception ex) {
					update(ex.getMessage());
				}
			}
		});

		frameDetalles.setPreferredSize(new Dimension(350, 150));
		frameDetalles.pack();
		frameDetalles.setVisible(true);

		// end-user-code
	}
}