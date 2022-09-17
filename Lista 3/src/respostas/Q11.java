package respostas;

import java.util.Scanner;

public class Q11 
{
	public static void ZeroUm(String vetor[])
	{
		int NovoTamanho, Tamanho = 0, aux, cont, auxCont = 0;
		
		for (int i = 0 ; i < vetor.length ; i++)
		{
			NovoTamanho = Integer.parseInt(vetor[i].substring(1));
			Tamanho+=NovoTamanho;
		}
		
		char ZEU[] = new char [Tamanho];
		char Caracter;
				
		for (int i = 0 ; i < Tamanho ; i++)
		{
			if (auxCont != Tamanho) 
			{	
				cont = 0;
				Caracter = vetor[i].charAt(0);
				aux = Integer.parseInt(vetor[i].substring(1));
				while(auxCont != Tamanho && cont < aux )
				{
					ZEU[auxCont] = Caracter;
					System.out.print(ZEU[auxCont]);
					cont++;
					auxCont++;
				}
				System.out.print(" ");		
			}
		}
	}
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas descompactações receberá o vetor? -> ");
		int quantidade = input.nextInt();
		String vetor[] = new String[quantidade];
		
		System.out.println("XY [X = Caracter, Y = Quantidade de descompactações]");
		for (int i = 0 ; i < quantidade ; i++)
		{
			System.out.print("Posição " + i + " - ");
			vetor[i] = input.next();
		}
		input.close();
		
		System.out.println("\nCaracteres Descompactados:");
		ZeroUm(vetor);
	}
}