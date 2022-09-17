package Respostas;

import java.util.Scanner;

public class Questão_4 
{
	public static void main(String[] args) 
	{
		/* 4) Verifique se A é maior que 10 ou se A mais B é igual a 20, 
		se verdade imprima: "número válido". Caso as afirmações 
		não sejam verdadeiras, Verificar se A é igual B, caso verdade
		imprima: (A é igual B; A e B são diferentes de 10; A é menor que 10)
		caso não seja verdade imprima: "número não válido". */
			
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
		else if (A == B)
		{
			System.out.print("(A é igual B; A e B são diferentes de 10; A é menor que 10)");
		}
		else
		{
			System.out.print("número não válido");
		}
	}
}