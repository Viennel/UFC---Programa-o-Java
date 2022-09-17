package Respostas;

import java.util.Scanner;

public class Questão_10
{
	public static void main(String[] args)
	{
		/* 10)Verifique se A é maior que 10 se não for imprima: 
		"número menor que 10". Verifique se A mais B é igual a 20 
		se não for verdade imprima "número diferente de 20". */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A <= 10)
		{
			System.out.println("número menor que 10");
		}
		
		if (A + B != 20)
		{
			System.out.println("número diferente de 20");
		}
	}
}
