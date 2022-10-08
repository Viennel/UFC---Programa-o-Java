package q2;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a data de hoje:");
		System.out.print("Dia -> ");
		int Dia = entrada.nextInt();
		System.out.print("Mes -> ");
		int Mes = entrada.nextInt();
		System.out.print("Ano -> ");
		int Ano = entrada.nextInt();
		
		Pessoa Albert_Einstein = new Pessoa();
		
		Albert_Einstein.NomedaPessoa("Albert Einstein");
		Albert_Einstein.ajustaDataDeNascimento(14, 3, 1879);
		Albert_Einstein.CalculaIdade(Dia, Mes, Ano);
	
		System.out.println(Albert_Einstein.informaNome() + " Teria " + Albert_Einstein.informaIdade() + " de Vida");

		Pessoa Isaac_Newton = new Pessoa();
		
		Isaac_Newton.NomedaPessoa("Isaac Newton");
		Isaac_Newton.ajustaDataDeNascimento(4, 1, 1643);
		Isaac_Newton.CalculaIdade(Dia, Mes, Ano);
	
		System.out.println(Isaac_Newton.informaNome() + " Teria " + Isaac_Newton.informaIdade() + " de Vida");
				
		entrada.close();
	}
}
