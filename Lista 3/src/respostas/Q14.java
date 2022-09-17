package respostas;

import java.util.Scanner;

public class Q14 
{
	public static void Contagem(String vetor[], int indice, String valor)
	{
		int contador = 0, repete = 0;
		int Cont[] = new int[vetor.length];

		for (int i = 0 ; i <= indice ; i++)
		{
			if (vetor[i].equals(valor))
			{
				contador++;
				Cont[indice] = contador;
			}
		}
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if (vetor[i].equals(valor))
			{
				repete++;
			}
		}
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if (vetor[i] == valor && Cont[indice] == 1)
			{
				System.out.print(" - " + valor + " = " + repete);	
			}
		}
	}
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos caracteres receberá o vetor? -> ");
		int quantidade = input.nextInt();
		String vetor[] = new String[quantidade];
		
		for (int i = 0 ; i < quantidade ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vetor[i] = input.next();
		}
		input.close();

		System.out.print("Repetições");
		for (int i = 0 ; i < quantidade ; i++)
		{
			Contagem(vetor, i, vetor[i]);
		}
	}
}