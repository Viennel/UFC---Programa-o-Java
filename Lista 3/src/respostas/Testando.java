package respostas;

import java.util.Scanner;

public class Testando 
{
	public static void ZeroUm(String vetor[])
	{
		int indice = 0, aux1 = 0, aux2 = 0, cont;
		int ZEU[] = new int [vetor.length];
			
		for (int i = 0 ; i < vetor.length ; i++)
		{
			if (aux2 != vetor.length )
			{
				if (vetor[aux2].equals(vetor[aux1]))
				{
					cont = 0;
					while (aux2 != vetor.length && vetor[aux2].equals(vetor[aux1]))
					{
						cont++;
						aux2++;
					}
					
					if (cont != 0)
					{
						ZEU[indice] = cont;
						System.out.print(vetor[aux1] + "" + ZEU[indice] + " ");
						indice++;
					}
				}
				aux1++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos valores receberá o vetor? -> ");
		int quantidade = input.nextInt();
		String vetor[] = new String[quantidade];
		
		for (int i = 0 ; i < quantidade ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vetor[i] = input.next();
		}
		input.close();
		
		System.out.println("\nXY [X = Valor, Y = Compactações]");
		System.out.print("Valores compactados: ");
		ZeroUm(vetor);
	}
}