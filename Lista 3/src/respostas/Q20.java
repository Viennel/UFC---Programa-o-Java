package respostas;

import java.util.Scanner;

public class Q20 
{
	public static void AmenosB(int vet1[], int vet2[])
	{
		int Diferença[] = new int[vet1.length];
		int contador, aux;
		
		for (int i = 0; i < Diferença.length ; i++)
		{
			aux = 0;
			contador = 0;
			while (aux != vet1.length && aux != vet2.length)
			{
				if (vet1[i] == vet2[aux])
				{
					contador++;
				}
				aux++;
			}
			
			if (contador == 0)
			{
				Diferença[i] = vet1[i];
				System.out.print(Diferença[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberá o Primeiro vetor? -> ");
		int vet1[] = new int[input.nextInt()];
		for (int i = 0 ; i < vet1.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vet1[i] = input.nextInt();
		}
		
		System.out.print("\nQuantos itens receberá o Segundo vetor? -> ");
		int vet2[] = new int[input.nextInt()];
		for (int i = 0 ; i < vet2.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vet2[i] = input.nextInt();
		}
		input.close();
		
		System.out.print("\nO que há no Vetor1 que não há no Vetor2: ");
		AmenosB(vet1, vet2);
	}
}
