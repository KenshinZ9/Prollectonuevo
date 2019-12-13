package prollectonuevo;

import java.util.Scanner;

public class pruevaGitHub {
	public static int numero1=2;
	public static int numero2=9;
	
	
	public static void suma(int numero1, int numero2) {
		int total =0;
		total=numero1+numero2;
		System.out.println("la suma es "+total);
	}
	
	public static void resta(int numero1, int numero2) {
		int total =0;
		total=numero1-numero2;
		System.out.println("la resta es "+total);
	}
	
	public static void main(String[] args) {
		//Scanner teclado = new Scanner(System.in);
		suma(numero1, numero2);
		resta(numero1, numero2);
	}

}
