package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println(" Entre os dados do produto:  ");
		System.out.print(" Nome:  ");
		product.nome = sc.nextLine();

		System.out.print(" Preço:  ");
		product.preco = sc.nextDouble();

		System.out.print(" Quantidade no estoque:  ");
		product.qtd = sc.nextInt();

		System.out.println(product);

		sc.close();
	}

}
