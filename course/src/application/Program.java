package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome do produto: ");
		product.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		product.preco = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		product.qtd = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos que serão adicionados no estoque: ");
		int qtd = sc.nextInt();
		product.addProducts(qtd);
		
		System.out.println();
		System.out.println("Dados atulizados: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos que serão removidos: ");
		qtd = sc.nextInt();
		product.removeProducts(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		sc.close();
	}
}