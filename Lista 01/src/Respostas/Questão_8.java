package Respostas;

import java.util.Scanner;

public class Questão_8
{
	public static void main(String[] args) 
	{
		/* 8) Verifique se A é maior que 10, se verdade imprima: 
		"A > 10" e verifique se o A mais B é igual a 20, se verdadeiro 
		imprima: "A + B == 20", se não for verdade: imprima 
		"número não válido". */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A > 10)
		{
			System.out.println("A > 10");
		}
		
		if (A + B == 20)
		{
			System.out.println("A + B == 20");
		}
		else 
		{
			System.out.print("número não válido");
		}
	}
}