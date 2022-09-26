package respostas;

import java.util.Scanner;

public class Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Valor do Salário Minimo -> R$");
		double SalarioMinimo = input.nextInt();
		
		System.out.print("\nQuantidade de Dependentes -> ");
		int NumerodeDependentes = input.nextInt();
		
		System.out.print("\nSalário do Funcionario -> R$");
		double SalariodoFuncionario = input.nextInt();
			
		System.out.print("\nTaxa de Imposto Normal -> R$");
		double TaxadeImpostoNormal = input.nextInt();
		
		input.close();
		
		if (SalariodoFuncionario <= 5*SalarioMinimo)
		{
			System.out.println("\nO Salário do funcionário é menor que 5 Salários\nMinimos, portanto o Imposto de Renda não é cobrado");
			return;
		}

		double ImpostoBruto = 0;
		if (SalariodoFuncionario > 12*SalarioMinimo)
		{
			ImpostoBruto = SalariodoFuncionario * 1/5;
		}
		else if (SalariodoFuncionario > 5*SalarioMinimo && SalariodoFuncionario <= 12*SalarioMinimo)
		{
			ImpostoBruto = SalariodoFuncionario * 2/25;
		}
		
		double TaxaAdicional = ImpostoBruto * 1/25;
		
		double ImpostodeRenda = ImpostoBruto + TaxadeImpostoNormal + TaxaAdicional;
		ImpostodeRenda-=(NumerodeDependentes * ImpostodeRenda * 1/50);
		
		System.out.println("\nImposto de Renda = " + ImpostodeRenda);
	}
}
