package q4;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner Informação = new Scanner(System.in);
		
		System.out.print("Insira as informações do Produto abaixo:\nNome -> ");
		Produto P = new Produto(Informação.nextLine());
		
		System.out.print("\nPreço de Custo -> ");
		P.setCusto(Informação.nextFloat());
		
		System.out.print("\nPreço de Venda -> ");
		P.setVenda(Informação.nextFloat());
		
		System.out.print("\nValor das Despesas -> ");
		P.setDespesas(Informação.nextFloat());
		
		System.out.print("\nO produto " + P.getNomedoProduto() + " tem uma margem de lucro de " + P.CalculodaMargemdeLucros() + "%");
	
		Informação.close();
	}
}
