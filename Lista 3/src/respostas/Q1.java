package respostas;

import java.util.Scanner;

public class Q1
{
	public static int Pesquisa(int vetor[], int numero) 
	{
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if (vetor[i] == numero)
			{
				return i;
			}
		}
		return -100;
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
		
		System.out.print("Você quer saber a posição de qual número? -> ");
		int numero = input.nextInt();
		input.close();
		
		System.out.println("Posição " + (Pesquisa(vetor, numero)));
	}
}