package respostas;

import java.util.Scanner;

public class Q18 
{
	public static void Organiza(int vetor[], int indice, int valor)
	{
		int contador = 0;
		int Cont[] = new int[vetor.length];

		for (int i = 0 ; i <= indice ; i++)
		{
			if (vetor[i] == valor)
			{
				Cont[indice] = contador++;
			}
		}
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if (vetor[i] == valor && Cont[indice] == 0)
			{
				System.out.print(valor + " ");	
			}
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
		
		System.out.println("\nOrganização:");
		for (int i = 0 ; i < vetor.length ; i++)
		{
			Organiza(vetor, i, vetor[i]);
		}
	}
}
