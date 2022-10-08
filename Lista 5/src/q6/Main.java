package q6;

import java.util.Scanner;

public class Main
{	
	public static void main(String[] args) 
	{
		Scanner OP = new Scanner(System.in);
		
		Elevador E = new Elevador();
		E.Inicializa();
		
		System.out.print("Insira o Total de Andares do Elevador (Além do Terreo - 0) -> ");
		E.setTotaldeAndares(OP.nextInt());
		System.out.print("Insira a Capacidade do Elevador -> ");
		E.setCapacidadedoElevador(OP.nextInt());
		
		System.out.println("Escolha uma Ação abaixo:\nSubir um Andar - 1\nDescer um Andar - 2\nAcrescentar Pessoa V/C - 3\nRemover Pessoa - 4\nSair - Digite ''sair''");
		String OPElevador = "";
		
		do
		{
			System.out.print("\nOpção: ");
			OPElevador = OP.next();
			if (OPElevador.equals("1"))
			{
				FunçãodeRepetição(E, OP, OPElevador, "^", "\nPara Subir, digite ''^''");
			}
			else if (OPElevador.equals("2"))
			{
				FunçãodeRepetição(E, OP, OPElevador, "v", "\nPara Descer, digite ''v''");
			}
			else if (OPElevador.equals("3"))
			{
				FunçãodeRepetição(E, OP, OPElevador, "+", "\nPara Acrescentar uma pessoa, digite ''+''");
			}
			else if (OPElevador.equals("4"))
			{
				FunçãodeRepetição(E, OP, OPElevador, "-", "\nPara Remover uma pessoa, digite ''-''");
			}
		}
		while (!OPElevador.equals("sair"));
		
		OP.close();
	}

	public static void FunçãodeRepetição(Elevador Ele, Scanner input, String Opção, String Ação, String Frase)
	{
		String Aux = "";
		int AçãonoElevador = 0;
		System.out.println(Frase);
		do
		{
			Aux = input.next();
			if (Opção.equals("1"))
			{
				Ele.Sobe(Aux);
				AçãonoElevador = Ele.getAndarAtual();
			}
			else if (Opção.equals("2"))
			{
				Ele.Desce(Aux);
				AçãonoElevador = Ele.getAndarAtual();
			}
			else if (Opção.equals("3"))
			{
				Ele.Entra(Aux);
				AçãonoElevador = Ele.getQuantidadedePessoasnoElevador();
			}
			else if (Opção.equals("4"))
			{
				Ele.Sai(Aux);
				AçãonoElevador = Ele.getQuantidadedePessoasnoElevador();
			}
			
			if(Aux.equals(Ação))
			{
				System.out.println(AçãonoElevador);
			}
		}
		while(Aux.equals(Ação));
	}
}
