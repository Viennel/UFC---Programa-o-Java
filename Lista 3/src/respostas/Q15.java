package respostas;

import java.util.Scanner;

public class Q15 
{
	public static void Resultante10(int vet1[], int vet2[])
	{
		int resultante[] = new int[vet1.length];
		int Soma;
		
		System.out.println("\nVetor resultante:");
		for (int i = 0 ; i < resultante.length ; i++)
		{
			Soma = vet1[i] + vet2[i];
			resultante[i] = 10 - Soma;	
			System.out.print(resultante[i] + " ");
		}	
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberão os vetores? -> ");
		int vet1[] = new int[input.nextInt()];
		
		System.out.println("\nPrimeiro vetor");
		for (int i = 0 ; i < vet1.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vet1[i] = input.nextInt();
		}
			
		int vet2[] = new int[vet1.length];
		System.out.println("\nSegundo vetor");
		for (int i = 0 ; i < vet2.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vet2[i] = input.nextInt();
		}
		input.close();
		
		Resultante10(vet1, vet2);
	}
}
