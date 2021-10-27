package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println();
		System.out.println("End of program !!!");

	}
	
	public static void method1() {
		
		System.out.println("*** METHOD1 START ***");
		method2();
		System.out.println("*** METHOD1 END ***");
	}

	public static void method2() {
		
		System.out.println("*** METHOD2 START ***");

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Position does not exist !!! ");
			e.printStackTrace();
			sc.next();
		}

		catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Input error !");
		}

		sc.close();
		System.out.println("*** METHOD2 END ***");
	}

}
