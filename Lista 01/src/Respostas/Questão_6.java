package Respostas;

import java.util.Scanner;

public class Questão_6
{
	public static void main(String[] args) 
	{
		/* 6) Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
		seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
		verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B != 20”. */
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A > 10)
		{
			System.out.print("A > 10\n");
		}
		else
		{
			System.out.print("A <= 10\n");
		}
		
		if (A + B == 20)
		{
			System.out.print("A + B == 20");
		}
		else
		{
			System.out.print("A + B != 20");
		}
	}
}