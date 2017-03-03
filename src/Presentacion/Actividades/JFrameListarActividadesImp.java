/**
 * 
 */
package Presentacion.Actividades;

import java.awt.BorderLayout;
import java.awt.Color;
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
import Negocio.Actividades.TransferActividad;
import Presentacion.Clientes.JFrameAltaCliente;
import Presentacion.Controlador.Controlador;
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
public class JFrameListarActividadesImp extends JFrameListarActividades {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -4708842285978656384L;

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
		panelCentral = new JPanel(new BorderLayout());
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new String[] { "ID", "Nombre", "Lugar",
				"Fecha Inicio", "Duracion", "Horario", "Activo" });
		tabla = new JTable(modelo);
		tabla.setEnabled(false);
		JScrollPane scrollPanel = new JScrollPane(tabla);
		tabla.setPreferredScrollableViewportSize(new Dimension(0, 162));
		panelCentral.add(scrollPanel);
		tabla.setBackground(Color.white);
		panelFondo.add(panelCentral, BorderLayout.CENTER);
		Controlador.getInstance().accion(null, Evento.LISTAR_ACTIVIDADES);
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
		asignarEmpleado.addActionListener(new ActionListenerActividades() {
			public void actionPerformed(ActionEvent e) {
				framePrinc.dispose();
				JFrameAsignarEmpleado.getInstance().initGUI();
			}
		});

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
		listarActividades.setEnabled(false);

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
	 * @param ltc
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void updateTable(List<TransferActividad> ltc) {
		// begin-user-code
		modelo.setRowCount(ltc.size());
		for (int i = 0; i < ltc.size(); i++) {
			modelo.setValueAt(ltc.get(i).getID(), i, 0);
			modelo.setValueAt(ltc.get(i).getNombre(), i, 1);
			modelo.setValueAt(ltc.get(i).getLugar(), i, 2);
			modelo.setValueAt(ltc.get(i).getFecha(), i, 3);
			modelo.setValueAt(ltc.get(i).getDuracion(), i, 4);
			modelo.setValueAt(ltc.get(i).getHora(), i, 5);
			if (ltc.get(i).getEstado()) {
				modelo.setValueAt("Si", i, 6);
			} else {
				modelo.setValueAt("No", i, 6);
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