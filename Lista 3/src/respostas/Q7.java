package respostas;

import java.util.Scanner;

public class Q7 
{
	public static void Troca(int vet1[], int vet2[])
	{
		int aux[] = new int[vet1.length];
		
		System.out.println("Antes da troca");
		for (int i = 0 ; i < vet1.length ; i++)
		{
			System.out.print(vet1[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0 ; i < vet2.length ; i++)
		{
			System.out.print(vet2[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0 ; i < vet1.length ; i++)
		{
			aux[i] = vet1[i];
			vet1[i] = vet2[i];
			vet2[i] = aux[i];				
		}
		
		System.out.println("Após a troca");
		for (int i = 0 ; i < vet1.length ; i++)
		{
			System.out.print(vet1[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0 ; i < vet2.length ; i++)
		{
			System.out.print(vet2[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("A troca apenas funciona 100% para vetores de tamanhos iguais");
		System.out.print("Quantos itens receberão os vetores? -> ");
		int vet1[] = new int[input.nextInt()];
		
		System.out.println("Primeiro vetor");
		for (int i = 0 ; i < vet1.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vet1[i] = input.nextInt();
		}
			
		int vet2[] = new int[vet1.length];
		System.out.println("Segundo vetor");
		for (int i = 0 ; i < vet2.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vet2[i] = input.nextInt();
		}
		input.close();
		
		Troca(vet1, vet2);
	}
}