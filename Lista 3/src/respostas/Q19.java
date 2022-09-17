package respostas;

import java.util.Scanner;

public class Q19 
{
	public static void Vetores(int vetor[], int quantidade)
	{
		int contagem = 0, aux[];
		for (int i = 0 ; i < quantidade ; i++)
		{
			aux = new int[(vetor.length+1)/quantidade];
			System.out.print("Vetor " + (i+1) + " -> ");
			for (int j = 0 ; j < (vetor.length+1)/quantidade ; j++)
			{
				if (contagem != vetor.length)
				{
					aux[j] = vetor[contagem];
					contagem++;
					System.out.print(aux[j] + " ");
				}
			}
			System.out.println();
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
		
		System.out.print("Em quantos vetores os itens serão separados? -> ");
		int quantidade = input.nextInt();
		input.close();
		
		Vetores(vetor, quantidade);
	}
}
