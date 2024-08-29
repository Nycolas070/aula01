package aula_1;

import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circulo2 x = new circulo2();
		circulo2 y = new circulo2();
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("digite o raio X: ");
		x.raio = scn.nextDouble();
		System.out.println("digite o raio y: ");
		y.raio = scn.nextDouble();
		
		x.area = x.pi * (x.raio * x.raio);
		y.area = y.pi * (y.raio * y.raio);
		
		System.out.println("area do circulo X: " + x.area);
		System.out.println("area do circulo y: " + y.area);
		
		scn.close();
		
		
		
	}

}
