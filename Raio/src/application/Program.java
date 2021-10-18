package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.print("Digite o raio:  ");
		
		double raio = sc.nextDouble();
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf(" Circunferencia: %.2f\n ", c );
		System.out.printf(" Volume: %.2f\n ", v );
		System.out.printf(" Valor de PI: %.2f\n ", calc.PI );
		
		sc.close();
	}
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
