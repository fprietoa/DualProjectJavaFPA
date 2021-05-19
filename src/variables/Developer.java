package variables;

/**
 * Formación Java
 * 
 * @author fprietoa
 *
 */
public class Developer {

	/** Instanciar el nombre */
	private String nombre;

	/** Instanciar el nombre de la empresa final para que no se pueda modificar */
	public final static String empresa = "Everis";

	/** Instanciar el los dias de vacaciones */
	private int diasVacaciones = 21;

	/** Instanciar el id de los empleados */
	private int idEmpleado = 0;

	/** Instanciar el numero total de desarolladores */
	private static byte numTotalDesarrolladores = 0;

	/** Constructor con el nombre */
	public Developer(String nombre) {

		this.nombre = nombre;

		// Por cada Developer que se crea el número total de desarrolladores aumenta en uno.
		this.numTotalDesarrolladores += 1;

		// El idEmpleado es igual al número total de desarrolladores en ese momento.
		this.idEmpleado = numTotalDesarrolladores;

	}

	/**
	 * Método que devuelve el nombre
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para modificar el nombre
	 * 
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		if (nombre != null)
			throw new RuntimeException("El nombre no puede ser null");
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el numero total de desarrolladores
	 * 
	 * @return the numTotalDesarrolladores
	 */
	public static byte getNumTotalDesarrolladores() {
		return numTotalDesarrolladores;
	}

	/**
	 * @param numTotalDesarrolladores
	 *            the numTotalDesarrolladores to set
	 */
	public static void setNumTotalDesarrolladores(byte numTotalDesarrolladores) {
		if (numTotalDesarrolladores < 0)
			throw new RuntimeException("El numero total de desarrolladores no puede ser menor de 0");
		Developer.numTotalDesarrolladores = numTotalDesarrolladores;
	}

	/**
	 * Método que devuelve los días de vacaciones
	 * 
	 * @return the diasVacaciones
	 */
	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	/**
	 * Método para modificar los días de vacaciones
	 * 
	 * @param diasVacaciones
	 *            the diasVacaciones to set
	 */
	public void setDiasVacaciones(int diasVacaciones) {
		if (diasVacaciones < 0)
			throw new RuntimeException("No puedes restar mas dias de los que tiene.");
		this.diasVacaciones = diasVacaciones;
	}

	/**
	 * Método que devuelve el Id de empleado
	 * 
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * Método para modificar el Id de empleado
	 * 
	 * @param idEmpleado
	 *            the idEmpleado to set
	 */
	public void setIdEmpleado(int idEmpleado) {
		if (idEmpleado < 0)
			throw new RuntimeException("El numero de empleado no puede ser menor de 0");
		this.idEmpleado = idEmpleado;
	}

	/**
	 * Método que devuelve el nombre de empresa
	 * 
	 * @return the empresa
	 */
	public static String getEmpresa() {
		return empresa;
	}

	/**
	 * Método para modificar el número de vacaciones
	 * 
	 * @return the empresa
	 * 
	 *         public void numVacaciones(int diasMenos) { if(diasMenos > diasVacaciones) throw new RuntimeException("No puedes restar mas dias de vacaciones de
	 *         las que tiene"); this.diasVacaciones -= diasMenos; }
	 */

}
