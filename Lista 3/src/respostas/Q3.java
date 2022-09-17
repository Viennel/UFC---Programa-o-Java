package respostas;

import java.util.Scanner;

public class Q3 
{
	public static int[] Separa(int vetor[], int quantidade) 
	{
		int i, cn = 0, cp = 0;
		
		for (i = 0 ; i < quantidade ; i++)
		{
			if (vetor[i] < 0)
			{
				cn++;
			}
			if (vetor[i] >= 0)
			{
				cp++;
			}		
		}
		
		int Neg[] = new int[cn];
		int Pos[] = new int[cp];
		cn = cp = 0;

		for (i = 0 ; i < quantidade ; i++)
		{
			if (vetor[i] < 0)
			{
				Neg[cn] = vetor[i];
				cn++;
			}
			if (vetor[i] >= 0)
			{
				Pos[cp] = vetor[i];
				cp++;
			}
		}
		
		System.arraycopy(Neg, 0, vetor, 0, cn);
		System.arraycopy(Pos, 0, vetor, cn, cp);
		
		return vetor;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberá o vetor? -> ");
		int quantidade = input.nextInt();
		int vetor[] = new int[quantidade];
		
		for (int i = 0 ; i < quantidade ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vetor[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("\nVetor indo dos Negativos para os Positivos");
		int Pos_Neg[] = Separa(vetor, quantidade);
		for (int i = 0 ; i < quantidade ; i++)
		{
			System.out.print(Pos_Neg[i] + " ");
		}
	}
}
