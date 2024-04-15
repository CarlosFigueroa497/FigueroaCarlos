package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		int resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero entre 1 y 9 para ver su tabla de multiplicar");
		num = entrada.nextInt();
		if (num < 1 || num > 9)
			System.out.println("el numero ingresado esta fuera del rango permitido");
		else
		{
			System.out.println("tabla de multiplicar del " + num + " num");
			
			for (int i = 1; i <= 10; i ++)
			{
				resultado = num * i;
				System.out.println(num + " x " + i + " = " + resultado);
			}
		}	
		
		

	}

}
