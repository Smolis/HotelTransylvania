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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Main.Main.Evento;
import Negocio.Actividades.TransferActividad;
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
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class JFrameModificarActividadImp extends JFrameModificarActividad {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static final long serialVersionUID = -846320835363876953L;

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
	private JTextField introduceID;

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
	private JTextField nombre;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField lugar;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField fecha;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField duracion;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField hora;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		framePrinc = new JFrame("Alta Actividad");
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
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());

		JLabel id = new JLabel("  Introduce el ID de la actividad: ");
		id.setForeground(Color.white);
		introduceID = new JTextField();
		panelCentral.add(id);
		panelCentral.add(introduceID);
		panelCentral.add(new JLabel());
		panelCentral.add(new JLabel());
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

					String id = introduceID.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							id);

					Controlador.getInstance().accion(Integer.parseInt(id),
							Evento.MOSTRAR_DATOS_A_MODIFICAR_ACTIVIDAD);
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
	 * @param ta
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void mostrarDetalles(final TransferActividad ta) {
		// begin-user-code
		frameDetalles = new JFrame("Detalles de la actividad " + ta.getID());
		frameDetalles.setLayout(new GridLayout(8, 2));
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
		nombre = new JTextField(ta.getNombre());
		frameDetalles.add(mensajeNombre);
		frameDetalles.add(nombre);

		JLabel mensajeLugar = new JLabel("Lugar: ");
		lugar = new JTextField(ta.getLugar());
		frameDetalles.add(mensajeLugar);
		frameDetalles.add(lugar);

		JLabel mensajeFecha = new JLabel("Fecha inicio: ");
		fecha = new JTextField(String.valueOf(ta.getFecha()));
		frameDetalles.add(mensajeFecha);
		frameDetalles.add(fecha);

		JLabel mensajeDuracion = new JLabel("Duración: ");
		duracion = new JTextField(String.valueOf(ta.getDuracion()));
		frameDetalles.add(mensajeDuracion);
		frameDetalles.add(duracion);

		JLabel mensajeHorario = new JLabel("Horario: ");
		hora = new JTextField(ta.getHora());
		frameDetalles.add(mensajeHorario);
		frameDetalles.add(hora);

		frameDetalles.add(new JPanel());
		JButton okButton = new JButton("Aplicar cambios");
		frameDetalles.add(okButton);

		okButton.addActionListener(new ActionListenerEmpleados() {
			public void actionPerformed(ActionEvent e) {
				try {

					String nomb = nombre.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, nomb);

					String lug = lugar.getText();
					Comprobador.getInstance().comprueba(
							TipoDato.CADENA_NO_VACIA, lug);

					String fec = fecha.getText();
					Comprobador.getInstance().comprueba(TipoDato.FECHA, fec);

					String durac = duracion.getText();
					Comprobador.getInstance().comprueba(TipoDato.NUM_NO_NULO,
							durac);

					String hor = hora.getText();
					Comprobador.getInstance().comprueba(TipoDato.HORARIO, hor);

					TransferActividad tn = new TransferActividad(ta.getID(),
							nomb, lug, fec, Integer.parseInt(durac), hor, true);
					if (activo.getSelectedIndex() != 0) {
						tn.setEstado(false);
					}

					Controlador.getInstance().accion(tn,
							Evento.MODIFICAR_ACTIVIDAD);
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
		modificarActividad.setEnabled(false);

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