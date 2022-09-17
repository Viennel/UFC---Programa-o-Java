package Respostas;

import java.util.Scanner;

public class Questão_9 
{
	public static void main(String[] args)
	{
		/*9) Verifique se A é maior que 10 e verifique se A mais B é igual
		a 20, se verdadeiro, imprima: "A + B == 20''. Caso as afirmações 
		não forem verdadeiras imprima: "número não válido".*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor da variavel A");
		int A = input.nextInt();
		System.out.println("Insira valor da variavel B");
		int B = input.nextInt();
		
		input.close();
		
		if ((A > 10 && A + B == 20) || (A <= 10 && A + B == 20))
		{
			System.out.println("A + B == 20");
		}
		else
		{
			System.out.println("número não válido");
		}
	}
}
