package variables;

public class Developer {
	
	// Instanciar el nombre	
	private String nombre;
	
	// Instanciar el nombre	de la empresa final para que no se pueda modificar
	public final static String empresa = "Everis";
	
	// Instanciar el los dias de vacaciones
	private int diasVacaciones = 21;
	
	// Instanciar el id de los empleados
	private int idEmpleado = 0;
	
	// Instanciar el numero total de desarolladores
	private static byte numTotalDesarrolladores = 0;
	
	// Constructor con el nombre
	public Developer(String nombre) {
		this.nombre = nombre;
		this.numTotalDesarrolladores += 1;
		this.idEmpleado = numTotalDesarrolladores;
		
	}

	/**
	 * M�todo que devuelve el nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo para modificar el nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	/**
	 * M�todo que devuelve el numero total de desarrolladores
	 * @return the numTotalDesarrolladores
	 */
	public static byte getNumTotalDesarrolladores() {
		return numTotalDesarrolladores;
	}

	/**
	 * @param numTotalDesarrolladores the numTotalDesarrolladores to set
	 */
	public static void setNumTotalDesarrolladores(byte numTotalDesarrolladores) {
		Developer.numTotalDesarrolladores = numTotalDesarrolladores;
	}

	/**
	 * M�todo que devuelve los d�as de vacaciones
	 * @return the diasVacaciones
	 */
	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	/**
	 * M�todo para modificar los d�as de vacaciones
	 * @param diasVacaciones the diasVacaciones to set
	 */
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}

	/**
	 * M�todo que devuelve el Id de empleado
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * M�todo para modificar el Id de empleado
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	/**
	 * M�todo que devuelve el nombre de empresa
	 * @return the empresa
	 */
	public static String getEmpresa() {
		return empresa;
	}
	
	/**
	 * M�todo para modificar el n�mero de vacaciones
	 * @return the empresa
	 */
	public void numVacaciones(int diasMenos) {
		this.diasVacaciones -= diasMenos;
	}
	

}
