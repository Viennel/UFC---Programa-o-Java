package respostas;

import java.util.Scanner;

public class Q4 
{
	public static int Somatorio(int vetor[], int quantidade)
	{
		int Soma = 0;
		for (int i = 0 ; i < vetor.length ; i++)
		{
			Soma+=vetor[i];
		}
		return Soma;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos valores receberá o vetor? -> ");
		int quantidade = input.nextInt();
		int vetor[] = new int[quantidade];
		
		for (int i = 0 ; i < quantidade ; i++)
		{
			System.out.print("Valor " + i + " -> ");
			vetor[i] = input.nextInt();
		}
		input.close();
		
		System.out.print("\nSoma = " + Somatorio(vetor, quantidade));
	}
}