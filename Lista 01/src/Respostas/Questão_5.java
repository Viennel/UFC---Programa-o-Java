package Respostas;

import java.util.Scanner;

public class Questão_5
{
	public static void main(String[] args) 
	{
		/* 5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se 
		verdade imprima: "número válido". Caso as afirmações não 
		sejam verdadeiras, imprima: "número não válido". */
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A > 10 || A + B == 20)
		{
			System.out.print("número válido");
		}
		else
		{
			System.out.print("número não válido");
		}
	}
}