/**
 * 
 */
package Presentacion.Habitaciones;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Main.Main.Evento;
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
public class JFrameListarHabitacionesImp extends JFrameListarHabitaciones {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -7188122590083625695L;
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
	private JTable tabla;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DefaultTableModel modelo;
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
		framePrinc = new JFrame("Listar Habitaciones");
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
		panelDer = new JPanel(new BorderLayout());
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "ID Hab", "NºHab", "Precio",
				"Disponibilidad" });
		tabla = new JTable(modelo);
		tabla.setEnabled(false);
		JScrollPane scrollPanel = new JScrollPane(tabla);
		tabla.setPreferredScrollableViewportSize(new Dimension(0, 162));
		panelDer.add(scrollPanel);
		panelDer.setOpaque(false);
		panelFondo.add(panelDer, BorderLayout.CENTER);
		Controlador.getInstance().accion(null, Evento.LISTAR_HABITACIONES);
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

		panelIzq.setLayout(new GridLayout(5, 1, 10, 10));
		panelIzq.add(altaHabitacion);
		panelIzq.add(bajaHabitacion);
		panelIzq.add(modificarHabitacion);
		panelIzq.add(verDetalles);
		panelIzq.add(listarHabitaciones);
		listarHabitaciones.setEnabled(false);
		panelIzq.setOpaque(false);
		panelFondo.add(panelIzq, BorderLayout.WEST);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param lth
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void updateTable(List<TransferHabitacion> lth) {
		// begin-user-code
		modelo.setRowCount(lth.size());
		for (int i = 0; i < lth.size(); i++) {
			modelo.setValueAt(lth.get(i).getID(), i, 0);
			modelo.setValueAt(lth.get(i).getNumHab(), i, 1);
			modelo.setValueAt(lth.get(i).getPrecio(), i, 2);
			if (lth.get(i).getEstado()) {
				modelo.setValueAt("Si", i, 3);
			} else {
				modelo.setValueAt("No", i, 3);
			}
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param msg
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public void update(String msg) {
		// begin-user-code
		JOptionPane.showMessageDialog(framePrinc, msg, "Error",
				JOptionPane.ERROR_MESSAGE);

		// end-user-code
	}
}