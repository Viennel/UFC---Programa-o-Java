package respostas;

import java.util.Random;
import java.util.Scanner;

public class Q16 
{
	public static void Polariza(int vetor[])
	{
		int i, CP = 0, CI = 0;
		
		for (i = 0 ; i < vetor.length ; i++)
		{
			if (vetor[i]%2 == 0 || vetor[i] == 0)
			{
				CP++;
			}
			else
			{
				CI++;
			}		
		}
		
		int Pares[] = new int[CP];
		int Impares[] = new int[CI];
		CP = CI = 0;
		
		for (i = 0 ; i < vetor.length ; i++)
		{
			if (vetor[i]%2 == 0 || vetor[i] == 0)
			{
				Pares[CP] = vetor[i];
				CP++;
			}
			else
			{
				Impares[CI] = vetor[i];
				CI++;
			}
		}
		
		System.arraycopy(Impares, 0, vetor, 0, CI);
		System.arraycopy(Pares, 0, vetor, CI, CP);
		
		System.out.println("\nImpares no começo, Pares no final:");
		for (i = 0 ; i < vetor.length ; i++)
		{
			System.out.print(vetor[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberá o vetor aleatório? -> ");
		int vetor[] = new int[input.nextInt()];
		
		System.out.print("Até onde irá a aleatoriedade? [0 a (Valor - 1)](Tomando 0 como par) -> ");
		Random aleatorio = new Random();
		int Valor = input.nextInt();
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			vetor[i] = aleatorio.nextInt(Valor);
		}
		input.close();
		
		Polariza(vetor);
	}
}
