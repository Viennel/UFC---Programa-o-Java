package respostas;

import java.util.Random;
import java.util.Scanner;

public class Q3 
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Até onde irá a aleatóriedade do Vetor[100]? -> ");
		int Aleatoriedade = input.nextInt();
		input.close();
		
		int aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0;
		int Vet[] = new int[100];
		int PosMult3[] = new int[100];
		int PosNaoMult3[] = new int[100];
		int NegMult3[] = new int[100];
		int NegNaoMult3[] = new int[100];
		
		System.out.println("\n\t\t     Vetor[100]:");
		Random r = new Random();
		for	(int i = 0 ; i < 100 ; i++)
		{
			Vet[i] = r.nextInt(Aleatoriedade) - r.nextInt(Aleatoriedade) ;
			System.out.println("\t\t" + i + "\t-\t" + Vet[i]);
			
			if (Vet[i] >= 0 && Vet[i]%3==0)
			{
				PosMult3[aux1] = Vet[i];
				aux1++;
			}
			else if (Vet[i] >= 0 && Vet[i]%3!=0)
			{
				PosNaoMult3[aux2] = Vet[i];
				aux2++;
			}
			else if (Vet[i] < 0 && Vet[i]%3==0)
			{
				NegMult3[aux3] = Vet[i];
				aux3++;
			}
			else if (Vet[i] < 0 && Vet[i]%3!=0)
			{
				NegNaoMult3[aux4] = Vet[i];
				aux4++;
			}
		}
		System.out.println();
		
		System.out.println("Quantidade de Números positivos múltiplos de 3: " + aux1);
		for	(int i = 0 ; i < aux1 ; i++)
		{
			System.out.print(PosMult3[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("Quantidade de Números positivos não múltiplos de 3: " + aux2);
		for	(int i = 0 ; i < aux2 ; i++)
		{
			System.out.print(PosNaoMult3[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("Quantidade de Números negativos múltiplos de 3: " + aux3);
		for	(int i = 0 ; i < aux3 ; i++)
		{
			System.out.print(NegMult3[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("Quantidade de Números negativos não múltiplos de 3: " + aux4);
		for	(int i = 0 ; i < aux4 ; i++)
		{
			System.out.print(NegNaoMult3[i] + " ");
		}
	}
}
