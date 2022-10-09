package br.com.erickfreire.aritmetica;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Programa Java que calcula las cuatro operaciones básicas: ");
		System.out.print("Introduzca el primer valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.printf("La suma de valores: %d + %d = %d %n", numero1, numero2, numero1 + numero2);
		System.out.printf("Restando os valores: %d - %d = %d %n", numero1, numero2, numero1 - numero2);
		System.out.printf("La multiplicacion de valores: %d * %d = %d %n", numero1, numero2, numero1 * numero2);
		System.out.printf("La division de valores: %d / %d = %d %n", numero1, numero2, numero1 / numero2);

	}

}
