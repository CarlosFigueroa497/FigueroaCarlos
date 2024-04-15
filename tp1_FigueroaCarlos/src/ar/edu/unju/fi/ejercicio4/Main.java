package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero entre 0 y 10 ");
		num = entrada.nextInt();
		int fact = 1;
		int cont = num;

		if (num >= 0 && num <= 10)
		{
			while(cont > 1) {
				fact *= cont;
				cont --;
			}
			System.out.println("el factorial es: "+fact);
		}
		else
			System.out.println("el numero ingresado esta fuera del rango");
	}

}
