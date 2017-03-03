package Negocio.Comprobador;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ComprobadorImp extends Comprobador {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tDato
	 * @param data
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void comprueba(TipoDato tDato, Object data) throws Exception {
		// begin-user-code
		switch (tDato) {
		case DNI:
			if ((String.valueOf(data).length() == 9)) {
				char[] dni = String.valueOf(data).toCharArray();
				if (!Character.isDigit(dni[8])) {
					try {
						Integer.parseInt(String.valueOf(data).substring(0, 8));
						return;
					} catch (NumberFormatException e) {
					}
				}
			}
			throw new Exception(
					"DNI erroneo, ha de tener 8 numeros y una letra.");

		case NUMERO_TARJETA:
			if ((String.valueOf(data).length() == 16)) {
				char[] numTarjeta = String.valueOf(data).toCharArray();
				for (int i = 0; i < numTarjeta.length; i++) {
					if (!Character.isDigit(numTarjeta[i])) {
						throw new Exception(
								"El numero de tarjeta no puede contener letras.");
					}
				}
				return;
			}
			throw new Exception(
					"El numero de tarjeta tiene una longitud erronea.");

		case CADENA_NO_VACIA:
			if ((String.valueOf(data).length() > 0)) {
				return;
			}
			throw new Exception("No se admiten campos de texto vacios.");
			
		case NUM_NO_NULO:
			try {
				if (Integer.parseInt(String.valueOf(data)) > 0) {
					return;
				}
				throw new Exception("El numero debe ser al menos 1.");
			} catch (NumberFormatException e) {
				throw new Exception("Formato incorrecto de numero.");
			}

		case HORARIO:
			if ((String.valueOf(data).length() == 11)) {
				String[] horas = String.valueOf(data).split("-");
				if (horas[0].length() == 5 && horas[1].length() == 5) {
					String[] horaInicio = horas[0].split(":");
					String[] horaFin = horas[1].split(":");
					if (Integer.parseInt(horaInicio[0]) >= 0
							&& Integer.parseInt(horaInicio[0]) < 24
							&& Integer.parseInt(horaInicio[1]) >= 0
							&& Integer.parseInt(horaInicio[1]) < 60
							&& Integer.parseInt(horaFin[0]) >= 0
							&& Integer.parseInt(horaFin[0]) < 24
							&& Integer.parseInt(horaFin[1]) >= 0
							&& Integer.parseInt(horaFin[1]) < 60) {
						return;
					}
				}
			}
			throw new Exception("El horario no sigue el formato admitido.");

		case TELEFONO:
			if ((String.valueOf(data).length() >= 9)) {
				char[] telef = String.valueOf(data).toCharArray();
				for (int i = 0; i < telef.length; i++) {
					if (!Character.isDigit(telef[i])) {
						throw new Exception(
								"El numero de telefono solo puede contener digitos.");
					}
				}
				return;
			}
			throw new Exception("El numero de telefono es demasiado corto.");

		case FECHA:
			if (String.valueOf(data).length() == 10) {
				String[] fechaDividida = String.valueOf(data).split("/");
				try{
					int dia = Integer.parseInt(fechaDividida[0]);
					int mes = Integer.parseInt(fechaDividida[1]);
					Integer.parseInt(fechaDividida[2]);

					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					Date fechaComp = sdf.parse(String.valueOf(data),
							new ParsePosition(0));
					Date fechaActual = new Date();
	
					if (fechaComp.before(fechaActual)) {
						throw new Exception(
								"La fecha debe ser posterior a la actual.");
					}
	
					ArrayList<Integer> mes30 = new ArrayList<Integer>();
					mes30.add(4);
					mes30.add(6);
					mes30.add(9);
					mes30.add(11);
	
					if (mes > 12 || mes <= 0) {
						throw new Exception("Mes erroneo.");
					}
	
					if (dia < 1 || (mes == 2 && dia > 29)
							|| (mes30.contains(mes) && dia > 30)
							|| (!mes30.contains(mes) && mes != 2 && dia > 31)) {
						throw new Exception("Dia Erroneo");
					}
					return;
				} catch (NumberFormatException e){}
			}
			throw new Exception("Error en la fecha.");

		}
		throw new Exception("Ha ocurrido un error comprobando los datos.");
		// end-user-code
	}
}
