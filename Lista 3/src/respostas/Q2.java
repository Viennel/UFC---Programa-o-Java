package respostas;

import java.util.Scanner;

public class Q2
{
	public static int Pesquisa(int vetor[], int Posi) 
	{
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if (i == Posi)
			{
				return vetor[i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberá o vetor? -> ");
		
		int vetor[] = new int[input.nextInt()];
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			System.out.print("Posição " + i + " -> ");
			vetor[i] = input.nextInt();
		}
		
		System.out.print("Qual a posição do item que você quer chamar? -> ");
		int Posi = input.nextInt();
		
		while (Posi > vetor.length - 1 || Posi < 0)
		{
			System.out.println("\nO vetor não possui essa posição, tente novamente");
			System.out.print("Qual a posição do Valor que você quer chamar? -> ");
			Posi = input.nextInt();
		}
		input.close();
		
		System.out.println("O valor é " + (Pesquisa(vetor, Posi)));
	}
}