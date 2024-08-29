package aula_1;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		Retangulo x = new Retangulo();

		System.out.print("Informe a altura e a base: \n");
		
		x.altura = leitura.nextDouble();
		x.base = leitura.nextDouble();
		
		System.out.println("area : " + x.area());

		leitura.close();
	}

}
