package respostas;

import java.util.Scanner;

public class Q10
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Até que número deve ir na esquerda? [0 - x]");
		int i = input.nextInt();
		System.out.println("Até que número deve ir na direita? [0 - y]");
		int j = input.nextInt();
		
		input.close();
		
		for (int x = 0 ; x <= i ; x++)
		{
			for (int y = 0; y <= j ; y++)
			{
				System.out.println(x + " - " + y);
			}
		}
	}
}