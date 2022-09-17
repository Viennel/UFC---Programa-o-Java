package Respostas;

import java.util.Scanner;

public class Questão_12 
{
	public static void main(String[] args) 
	{
		/* 12) Verifique se A é maior que 10 imprima: "A > 10" ou 
		verifique se A mais B é igual a 20, imprima: "A + B == 20",
		caso as afirmações não sejam verdadeiras, imprima:
		"números não válidos". Sejam as afirmações anteriores falsas ou
		verdadeiras imprima: “Sejam bem-vindos à disciplina de
		Técnicas de Programação”. */
		
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
		
		if (A <= 10 && A + B != 20)
		{
			System.out.println("números não válidos");
		}
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	}
}
