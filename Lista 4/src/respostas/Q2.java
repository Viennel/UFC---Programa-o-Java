package respostas;

import java.util.Scanner;

public class Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Preço Normal do Aluguel de Ferramentas -> R$");
		double Preco = input.nextInt();
		
		System.out.print("\nTipo de Ferramenta a ser alugada [ Comum / Nova ]\nEscreva -> ");
		String Tipo = input.next();
		
		System.out.print("\nPor quantos dias as ferramentas serão alugadas? -> ");
		int QuantidadedeDias = input.nextInt();
		System.out.println("Quais dias da Semana? [ Segunda / Terça / Quarta / Quinta / Sexta / Sabado / Domingo ]\nEscreva:");
		
		String Dia[] = new String[QuantidadedeDias];
		for (int i = 0; i < QuantidadedeDias; i++) 
		{
			System.out.print((i+1) + "º Dia -> ");
			Dia[i] = input.next();
		}

		input.close();
		
		if (Tipo.equals("Nova"))
		{
			Preco+=(Preco*3/20);
		}
		
		double CustodoAluguel = 0;
		for (int i = 0; i < QuantidadedeDias; i++) 
		{
			if (Dia[i].equals("Segunda") || Dia[i].equals("Terça") || Dia[i].equals("Quinta"))
			{
				CustodoAluguel+=(Preco - (Preco*2/5));
			}
			else if (Dia[i].equals("Quarta") || Dia[i].equals("Sexta") || Dia[i].equals("Sabado") || Dia[i].equals("Domingo"))
			{
				CustodoAluguel+=Preco;
			}
		}
		
		System.out.print("\nO Custo total de Aluguel será de: R$" + CustodoAluguel);
	}
}