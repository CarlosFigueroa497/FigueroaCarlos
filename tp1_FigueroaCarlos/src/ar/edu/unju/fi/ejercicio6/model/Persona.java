package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;


	public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	
	//constructores
	
	public Persona() {}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}


	//getter and setter
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	//metodos adicionales
	
	public int calcularEdad() {
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento,ahora);
		return periodo.getYears();
	}
	
	public boolean esMayorEdad() {
		return calcularEdad() >= 18;
		
		
		public void mostrarDatos(){
			
			System.out.println("DNI:  " + dni);
			System.out.println("Nombre:  " + nombre);
			System.out.println("fecha de nacimiento:  " + fechaNacimiento);
			System.out.println("provincia:  " + provincia);
			System.out.println("edad:  " + calcularEdad());
			if (esMayorEdad()) {
				System.out.println("La persona es mayor de edad");
			}else {
				
			}
				
				
		}
		
	}

}
