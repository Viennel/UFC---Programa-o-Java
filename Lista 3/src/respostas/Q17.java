package respostas;

import java.util.Scanner;

public class Q17
{
	public static void explode(int vetor[])
	{
		int NovoTamanho, Tamanho = 0, aux1 = 0, aux2 = 0;
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			NovoTamanho = vetor[i];
			Tamanho+=NovoTamanho;
		}
		
		int Explosão[] = new int[Tamanho];
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			while (aux1 < vetor[i])
			{
				Explosão[aux2] = vetor[i];
				aux1++;
				aux2++;
			}
			aux1 = 0;
		}
		
		System.out.println("\nVetor Explosão:");
		for (int i = 0 ; i < Explosão.length ; i++)
		{
			System.out.print(Explosão[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberá o vetor? -> ");
		int vetor[] = new int[input.nextInt()];
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vetor[i] = input.nextInt();
		}
		input.close();
		
		explode(vetor);
	}
}
