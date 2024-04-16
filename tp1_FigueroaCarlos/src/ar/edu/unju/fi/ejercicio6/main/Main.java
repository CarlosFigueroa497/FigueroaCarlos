package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;


import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// Objeto utilizando constructor por defecto
		
		Persona persona1 = new Persona();
		System.out.println("Persona 1:");
		persona1.mostrarDatos();
		System.out.println();
		
		// Objeto utilizando constructor parametrizado
		
		Persona persona2 = new Persona("35555752","Maria", LocalDate.of(1990,5,15) , "Salta");
		System.out.println("Persona 2:");
		persona2.mostrarDatos();
		System.out.println();
		
		
		//objeto utilizando constructor que inicializa solo dni, nombre y fecha de nacimiento
		
		Persona persona3 = new Persona("2755484","juan", LocalDate.of(1985,10,20) );
		System.out.println("Persona 3:");
		persona3.mostrarDatos();
		System.out.println();

	}

}
