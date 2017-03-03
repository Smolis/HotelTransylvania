package Negocio.Comprobador;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Pablo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Comprobador {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @author Pablo
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public enum TipoDato {

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		DNI,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		NUMERO_TARJETA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		NUM_NO_NULO,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		CADENA_NO_VACIA,

		/** 
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		HORARIO, /** 
					 * <!-- begin-UML-doc -->
					 * <!-- end-UML-doc -->
					 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
					 */
		TELEFONO, /** 
					 * <!-- begin-UML-doc -->
					 * <!-- end-UML-doc -->
					 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
					 */
		FECHA;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static Comprobador comprobador;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static Comprobador getInstance() {
		// begin-user-code
		if (comprobador == null) {
			comprobador = new ComprobadorImp();
		}
		return comprobador;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param tDato
	 * @param data
	 * @throws Exception
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void comprueba(TipoDato tDato, Object data)
			throws Exception;

}
