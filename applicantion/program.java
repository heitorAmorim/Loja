package applicantion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Produtos;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Produtos> list = new ArrayList<>();
		
		System.out.println("Cadastro de produtos:");
		System.out.print("Quantos produtos serão cadastrados?");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++ ) {
			System.out.println("\nProduto"+i+":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produtos produto = new Produtos(nome, preco, quantidade);
			list.add(produto);			
		}
		
		System.out.println("\nProdutos no estoque:");
		for(Produtos produto : list) {
			System.out.println(produto.toString());
		}
		
		
		sc.close();
	}

}
