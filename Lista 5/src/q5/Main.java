package q5;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner Dados = new Scanner(System.in);
		
		System.out.print("Insira o Nome, o Sobrenome e o ID do Empregado\nNome -> ");
		String Nome = Dados.next();
		
		System.out.print("\nSobrenome -> ");
		String Sobrenome = Dados.next();
		
		System.out.print("\nID -> ");
		int ID = Dados.nextInt();
		
		Empregado EM = new Empregado(Nome, Sobrenome, ID);
		
		System.out.print("\nInsira o Salário Mensal do Empregado -> ");
		EM.setSalário(Dados.nextDouble());
		
		System.out.print("\nInsira a quantidade de Dias Trabalhados -> ");
		EM.setDiasTrabalhados(Dados.nextInt());
		
		System.out.print("\nO Salário de |" + EM.getNomeCompleto() + " / ID - " + EM.getID() + "| é de: " + EM.CalculoDoSalário() + "R$");
	
		Dados.close();
	}
}
