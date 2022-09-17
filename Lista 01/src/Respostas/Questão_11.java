package Respostas;

import java.util.Scanner;

public class Questão_11 
{
	public static void main(String[] args) 
	{
		/* 11)Verifique se A é maior que 10 se não for verifique se
		A mais B é igual a 20, imprima: "A + B == 20''. Caso A não seja 
		maior que 10 e A mais B for diferente de 20, imprima:
		"número não válido". */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A <= 10)
		{
			if (A + B == 20)
			{
				System.out.println("A + B == 20");
			}
			else
			{
				System.out.println("número não válido");
			}
		}
	}
}
