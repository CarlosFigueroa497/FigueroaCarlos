package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		num = entrada.nextInt();
		//System.out.println("el numero es: "+num);
		if (num % 2 == 0)
			System.out.println(num*3);
		else
			System.out.println(num*2);

	}

}
