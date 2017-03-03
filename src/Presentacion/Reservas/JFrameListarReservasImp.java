/**
 * 
 */
package Presentacion.Reservas;

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
import Negocio.Reservas.TransferReserva;
import Presentacion.Actividades.JFrameAltaActividad;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Controlador.Controlador;
import Presentacion.Empleados.JFrameContratarEmpleado;
import Presentacion.Habitaciones.JFrameAltaHabitacion;
import Presentacion.Imagenes.PanelFondo;

/** 
 * <!-- begin-UML-doc -->
 * <!--&nbsp;begin-UML-doc&nbsp;--><br><!--&nbsp;end-UML-doc&nbsp;--><br>@author&nbsp;Pablo<br>@!generated&nbsp;"UML&nbsp;a&nbsp;Java&nbsp;(com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JFrameListarReservasImp extends JFrameListarReservas {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -2174677835556070835L;

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
		framePrinc = new JFrame("Listar Reservas");
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
	 * <!--&nbsp;begin-UML-doc&nbsp;--><br><!--&nbsp;end-UML-doc&nbsp;-->
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
		listarReservas.setEnabled(false);

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
		panelCentral = new JPanel(new BorderLayout());
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "ID", "Fecha de entrada",
				"Noches", "Precio Total", "Activa" });
		tabla = new JTable(modelo);
		tabla.setEnabled(false);
		JScrollPane scrollPanel = new JScrollPane(tabla);
		tabla.setPreferredScrollableViewportSize(new Dimension(0, 162));
		panelCentral.add(scrollPanel);
		panelFondo.add(panelCentral, BorderLayout.CENTER);
		Controlador.getInstance().accion(null, Evento.LISTAR_RESERVAS);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ltr
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void updateTable(List<TransferReserva> ltr) {
		// begin-user-code
		modelo.setRowCount(ltr.size());
		for (int i = 0; i < ltr.size(); i++) {
			modelo.setValueAt(ltr.get(i).getIdReserva(), i, 0);
			modelo.setValueAt(ltr.get(i).getFechaEntrada(), i, 1);
			modelo.setValueAt(ltr.get(i).getNoches(), i, 2);
			if (ltr.get(i).getLineaReserva().size() == 0) {
				modelo.setValueAt("Reserva sin cerrar", i, 3);
				modelo.setValueAt("", i, 4);
			} else {
				modelo.setValueAt(ltr.get(i).getPrecioTotal() + " €", i, 3);

			}

			if (ltr.get(i).getEstado()) {
				modelo.setValueAt("Si", i, 4);
			} else {
				modelo.setValueAt("No", i, 4);
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
	public void update(String msg) {
		// begin-user-code
		JOptionPane.showMessageDialog(framePrinc, msg, "Error",
				JOptionPane.ERROR_MESSAGE);
		// end-user-code
	}
}