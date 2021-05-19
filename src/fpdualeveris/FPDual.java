package fpdualeveris;

import variables.Developer;

/**
 * Formaci�n Java
 * 
 * @author fprietoa
 *
 */
public class FPDual {

	/**
	 * M�todo Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		variablesChallenge();

	}

	/**
	 * M�todo variables
	 * 
	 */
	private static void variablesChallenge() {

		// Creamos los empleados
		Developer emp1 = new Developer("Juan");
		Developer emp2 = new Developer("Maria");
		Developer emp3 = new Developer("Ana");
		Developer emp4 = new Developer("Javier");

		// Mostrar el n�mero total de empleados
		System.out.println("El n�mero de empleados: " + Developer.getNumTotalDesarrolladores());
		System.out.println("El n�mero de empleados: " + Developer.getNumTotalDesarrolladores());

		// Mostrar el numero de desarrolladores
		System.out.println("El numero de empleado de Juan es: " + emp1.getIdEmpleado());
		System.out.println("El numero de empleado de Maria es: " + emp2.getIdEmpleado());
		System.out.println("El numero de empleado de Ana es: " + emp3.getIdEmpleado());
		System.out.println("El numero de empleado de Javier es: " + emp4.getIdEmpleado());

		// Mostrar el nombre de la empresa
		System.out.println("La empresa es: " + Developer.getEmpresa());

		// Cambiar el n�mero de vacaciones del segundo empleado
		emp2.setDiasVacaciones(emp2.getDiasVacaciones() - 2);

		// Mostrar el n�mero de vacaciones de los empleados
		System.out.println("El n�mero de vacaciones para Juan son: " + emp1.getDiasVacaciones());
		System.out.println("El n�mero de vacaciones para Mar�a son: " + emp2.getDiasVacaciones());
		System.out.println("El n�mero de vacaciones para Ana son: " + emp3.getDiasVacaciones());
		System.out.println("El n�mero de vacaciones para Javier son: " + emp4.getDiasVacaciones());

		// Cambiar el n�mero de dias de vacaciones lanzando la excepci�n.
		System.out.println("El empleado 2 tiene " + emp2.getDiasVacaciones() + " d�as de vacaciones.");

		// Al tener 19 d�as de vacaciones no se puede restar 20 d�as.
		emp2.setDiasVacaciones(emp2.getDiasVacaciones() - 20);

	}

}
