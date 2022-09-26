package respostas;

import java.util.Scanner;

public class Q5 
{
	public static void CriarVetor(double Vetor[], Scanner input)
	{
		System.out.println();
		for (int i = 0; i < Vetor.length; i++) 
		{
			System.out.print((i+1) + "º Item -> ");
			Vetor[i] = input.nextInt();
		}	
	}
	
	public static void Print(double Vetor[])
	{
		System.out.println();
		for (int i = 0; i < Vetor.length; i++) 
		{
			System.out.print(Vetor[i] + " ");
		}
		System.out.println();
	}
	
	public static double Soma (double Vetor[])
	{
		int Soma = 0;
		
		for (int i = 0; i < Vetor.length; i++)
		{
			Soma+=Vetor[i];
		}
		
		return Soma;
	}
	
	public static double Produto (double Vetor[])
	{
		int Produto = 1;
		
		for (int i = 0; i < Vetor.length; i++)
		{
			Produto*=Vetor[i];
		}
		
		return Produto;
	}
	
	public static double Media (double Vetor[])
	{
		double Media = Soma(Vetor)/Vetor.length;
		
		return Media;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens terão os 3 vetores? -> ");
		int Tamanho = input.nextInt();
		
		double Vetor1[] = new double[Tamanho]; 
		double Vetor2[] = new double[Tamanho]; 
		double Vetor3[] = new double[Tamanho]; 
		
		System.out.print("Primeiro Vetor:");
		CriarVetor(Vetor1, input);
		
		System.out.print("Segundo Vetor:");
		CriarVetor(Vetor2, input);
		
		System.out.print("Terceiro Vetor:");
		CriarVetor(Vetor3, input);
		
		input.close();
			
		System.out.print("\nSomas dos itens dos 3 vetores");
		double VetorSomas[] = {Soma(Vetor1), Soma(Vetor2), Soma(Vetor3)};
		Print(VetorSomas);
		
		System.out.print("\nProduto dos itens dos 3 vetores");
		double VetorProduto[] = {Produto(Vetor1), Produto(Vetor2), Produto(Vetor3)};
		Print(VetorProduto);
			
		System.out.print("\nMedia dos itens dos 3 vetores");
		double VetorMedia[] = {Media(Vetor1), Media(Vetor2), Media(Vetor3)};
		Print(VetorMedia);
		
		System.out.print("\nSoma das somas");
		double SomadasSomas[] = {Soma(VetorSomas)};
		Print(SomadasSomas);
		
		System.out.print("\nProduto dos Produtos");
		double ProdutodosProdutos[] = {Produto(VetorProduto)};
		Print(ProdutodosProdutos);
		
		System.out.print("\nMedia das Medias");
		double MediadasMedias[] = {Media(VetorMedia)};
		Print(MediadasMedias);	
	}
}
