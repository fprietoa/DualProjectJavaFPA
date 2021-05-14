package fpdualeveris;

import variables.Developer;

/**
 * Formación Java
 * 
 * @author fprietoa
 *
 */
public class FPDual {
	
	/**
	 * Método Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
				
		variablesChallenge();

	}
	
	/**
	 * Método variables
	 *  
	 */
	private static void variablesChallenge(){
		
		// Creamos los empleados
		Developer emp1 = new Developer("Juan");
		Developer emp2 = new Developer("Maria");
		Developer emp3 = new Developer("Ana");
		Developer emp4 = new Developer("Javier");
		
		// Mostrar el número total de empleados
		System.out.println("El número de empleados: " + Developer.getNumTotalDesarrolladores());
		System.out.println("El número de empleados: " + Developer.getNumTotalDesarrolladores());

		// Mostrar el numero de desarrolladores
		System.out.println("El numero de empleado de Juan es: " + emp1.getIdEmpleado());
		System.out.println("El numero de empleado de Maria es: " + emp2.getIdEmpleado());
		System.out.println("El numero de empleado de Ana es: " + emp3.getIdEmpleado());
		System.out.println("El numero de empleado de Javier es: " + emp4.getIdEmpleado());		
		
		// Mostrar el nombre de la empresa
		System.out.println("La empresa es: " + Developer.getEmpresa());
		
		// Cambiar el número de vacaciones del segundo empleado
		emp2.setDiasVacaciones(emp2.getDiasVacaciones()-2);
		
		// Mostrar el número de vacaciones de los empleados
		System.out.println("El número de vacaciones para Juan son: " + emp1.getDiasVacaciones());
		System.out.println("El número de vacaciones para María son: " + emp2.getDiasVacaciones());
		System.out.println("El número de vacaciones para Ana son: " + emp3.getDiasVacaciones());
		System.out.println("El número de vacaciones para Javier son: " + emp4.getDiasVacaciones());	
		
		// Cambiar el número de dias de vacaciones lanzando la excepción.
		System.out.println("El empleado 2 tiene " + emp2.getDiasVacaciones() + " días de vacaciones.");
		
			// Al tener 19 días de vacaciones no se puede restar 20 días.
			emp2.setDiasVacaciones(emp2.getDiasVacaciones()-20);
		
		
	}
	

}
