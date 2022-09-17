package respostas;

import java.util.Scanner;

public class Q5 
	{
		public static int[] Separa(int vet1[], int vet2[]) 
		{
			int Uniao[] = new int[vet1.length + vet2.length];
			
			System.arraycopy(vet1, 0, Uniao, 0, vet1.length);
			System.arraycopy(vet2, 0, Uniao, vet1.length, vet2.length);
			
			return Uniao;
		}
		
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Quantos itens receberá o 1º vetor? -> ");
			int vet1[] = new int[input.nextInt()];
			
			for (int i = 0 ; i < vet1.length ; i++)
			{
				System.out.print("Posição " + i + " - ");
				vet1[i] = input.nextInt();
			}
			
			System.out.print("\nQuantos itens receberá o 2º vetor? -> ");
			int vet2[] = new int[input.nextInt()];
			
			for (int i = 0 ; i < vet2.length ; i++)
			{
				System.out.print("Posição " + i + " - ");
				vet2[i] = input.nextInt();
			}
			input.close();
			
			System.out.println("\nVetores 1 e 2 concatenados:");
			int Uniao[] = Separa(vet1, vet2);
			for (int i = 0 ; i < (vet1.length + vet2.length) ; i++)
			{
				System.out.print(Uniao[i] + " ");
			}
		}
	}