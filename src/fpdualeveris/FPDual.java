package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variablesChallenge();

	}
	
	private static void variablesChallenge(){
		
		// Creamos los empleados
		Developer emp1 = new Developer("Juan");
		Developer emp2 = new Developer("Maria");
		Developer emp3 = new Developer("Ana");
		Developer emp4 = new Developer("Javier");
		
		// Nombre Empresa
		System.out.println("Nombre empresa: " + emp1.getEmpresa());
		
		// Mostrar el número total de empleados
		System.out.println("El número de empleados: " + emp1.getNumTotalDesarrolladores());
		System.out.println("El número de empleados: " + emp4.getNumTotalDesarrolladores());

		// Mostrar el numero de desarrolladores
		System.out.println("El numero de empleado de Juan es: " + emp1.getIdEmpleado());
		System.out.println("El numero de empleado de Maria es: " + emp2.getIdEmpleado());
		System.out.println("El numero de empleado de Ana es: " + emp3.getIdEmpleado());
		System.out.println("El numero de empleado de Javier es: " + emp4.getIdEmpleado());		
		
		// Cambiar el número de vacaciones del segundo empleado
		emp2.setDiasVacaciones(emp2.getDiasVacaciones()-2);
		
		// Mostrar el número de vacaciones de los empleados
		System.out.println("El número de vacaciones para Juan son: " + emp1.getDiasVacaciones());
		System.out.println("El número de vacaciones para María son: " + emp2.getDiasVacaciones());
		System.out.println("El número de vacaciones para Ana son: " + emp3.getDiasVacaciones());
		System.out.println("El número de vacaciones para Javier son: " + emp4.getDiasVacaciones());	
		
		
		
	}
	

}
