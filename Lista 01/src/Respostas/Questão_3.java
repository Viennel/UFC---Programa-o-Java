package Respostas;

import java.util.Scanner;

public class Questão_3 
{
	public static void main(String[] args) 
	{
		/* 3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e 
		verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20". 
		verifique se o B é igual a 10, se verdade imprima: "B == 10", 
		(obs: todas as três impressões são permitidas na saída do programa). */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A == 10)
		{
			System.out.print("A == 10\n");
		}
		
		if (A + B == 20)
		{
			System.out.print("A + B == 20\n");
		}
		
		if (B == 10)
		{
			System.out.print("B == 10\n");
		}
	}
}