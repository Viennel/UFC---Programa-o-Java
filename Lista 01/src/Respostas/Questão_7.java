package Respostas;

import java.util.Scanner;

public class Questão_7
{
	public static void main(String[] args) 
	{
		/* 7) Verifique se A é maior que 10 ou se o A mais B é igual
		a 20. Caso sejam verdadeiras as afirmações imprima "números válidos".
		Caso a primeira afirmação não seja verdadeira, imprima
		"número não válido" */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if (A > 10 || A + B == 20)
		{
			System.out.println("Números válidos");
		}
		
		if (A <= 10)
		{
			System.out.println("Número não válido");
		}	
	}
}
