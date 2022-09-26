package respostas;

import java.util.Scanner;

public class Q4
{
	public static String VogaleConsoante(String Nome)
	{
		int QuantidadeDeVogais = 0, QuantidadeDeConsoantes = 0;
		
		for (int i = 0; i < Nome.length(); i++) 
		{
			if (Nome.charAt(i) == 'a' || Nome.charAt(i) == 'e' || Nome.charAt(i) == 'i' || Nome.charAt(i) == 'o' || Nome.charAt(i) == 'u')
			{
				QuantidadeDeVogais++;
			}
			else if (Nome.charAt(i) == 'A' || Nome.charAt(i) == 'E' || Nome.charAt(i) == 'I' || Nome.charAt(i) == 'O' || Nome.charAt(i) == 'U')
			{
				QuantidadeDeVogais++;
			}
			else
			{
				QuantidadeDeConsoantes++;
			}
		}
		
		String Vogais = String.valueOf(QuantidadeDeVogais);
		String Consoantes = String.valueOf(QuantidadeDeConsoantes);
		String QuantidadeTotal = (Nome + " -> Vogais = " + Vogais + " | Consoantes = " + Consoantes);
		
		return QuantidadeTotal;
	} 
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de nomes a serem recebidos -> ");
		String Frase[] = new String[input.nextInt()];
		
		System.out.println();
		for (int i = 0; i < Frase.length; i++) 
		{
			System.out.print("Escreva o " + (i+1) + "º nome: "); 
			Frase[i] = input.next();
		}
		input.close();
		
		for (int i = 0; i < Frase.length; i++)
		{
			System.out.println(VogaleConsoante(Frase[i]));
		}
	}
}
