package Respostas;

import java.util.Scanner;

public class Questão_2 
{
	public static void main(String[] args) 
	{
		/* 2) Verifique se A é menor que 10, se verdade imprima:
		"A < 10", e verifique se o A mais B é igual a 20, se verdade
		imprima: "A + B == 20". Caso nenhumas das afirmação não seja
		verdadeira, imprima: "número não válido", 
		(obs: apenas uma impressão é permitida na saída do programa). */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A < 10)
		{
			System.out.print("A < 10");
		}
		else if (A + B == 20)
		{
			System.out.print("A + B == 20");
		}
		else
		{
			System.out.print("número não válido");
		}
	}
}
