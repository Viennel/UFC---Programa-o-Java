package respostas;

import java.util.Scanner;

public class Q8 
{
	public static float[] AdcMedia(float vetor[])
	{
		float soma = 0;
		int aux = 0;
		float MediaCrescente[] = new float[vetor.length];
		
		MediaCrescente[0] = vetor[0];
		System.out.println("Media:");
		for (int i = 0 ; i < vetor.length ; i++)
		{
			soma+=vetor[i];
			vetor[i] = soma/(i + 1);
			
			if (MediaCrescente[aux] < vetor[i])
			{
				aux++;
				MediaCrescente[aux] = vetor[i];
			}
			System.out.print(vetor[i] + "  ");
		}
		
		float MediasCrescidas[] = new float[aux+1];
		for (int i = 0 ; i < MediasCrescidas.length ; i++)
		{
			MediasCrescidas[i] = MediaCrescente[i];
		}
		return MediasCrescidas;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos itens receberá o vetor? -> ");
		float vetor[] = new float[input.nextInt()];
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vetor[i] = input.nextInt();
		}
		input.close();
		
		float Vetmedia[] = AdcMedia(vetor);
		System.out.println("\nVetor com as medias aumentando:");
		for (int i = 0 ; i < Vetmedia.length ; i++)
		{
			System.out.print(Vetmedia[i] + "  ");
		}
	}
}