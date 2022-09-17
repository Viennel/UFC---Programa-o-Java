package respostas;

import java.util.Scanner;

public class Q6 
{

	public static int[] Inversao(int vetor[])
	{
		int inverso[] = new int[vetor.length];
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			inverso[i] = vetor[(vetor.length - 1) - i];
		}
		return inverso;
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
		input.close();
		
		int Inverso[] = Inversao(vetor);
		System.out.print("Vetor invertido: ");
		for (int i = 0 ; i < vetor.length ; i++)
		{
			System.out.print(Inverso[i] + " ");
		}
	}
}