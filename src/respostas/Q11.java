package respostas;

import java.util.Scanner;

public class Q11
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos termos na direita?");
		int i = input.nextInt();
		
		int Termo[] = new int[i];
		int aux = 0;

		do
		{
			System.out.print("Termo " + (aux + 1) + " -> ");
			Termo[aux] = input.nextInt();
			aux++;
		}
		while (aux < i);
			
		System.out.println("Quantas repetições na esquerda?");
		int j = input.nextInt();
		
		input.close();
		
		for (int y = 0; y <= j ; y++)
		{
			for (int x = 0 ; x < i ; x++)
			{
				System.out.println(y + " - " + Termo[x]);
			}
		}
	}
}