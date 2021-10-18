import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números:  ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int maior = max(A, B, C);

		showResult(maior);

		sc.close();
	}

	public static int max(int X, int Y, int Z) {
		int aux;
		if (X > Y && X > Z) {
			aux = X;
		}

		else if (Y > Z) {
			aux = Y;
		}

		else {
			aux = Z;
		}

		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Maior = " + value);

	}

}
