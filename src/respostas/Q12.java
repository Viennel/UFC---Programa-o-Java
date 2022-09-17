package respostas;

import java.util.Scanner;

public class Q12 
{
	public static void main(String[] args)
	{
		int i = 0, j = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de Linhas - ");
		int linha = input.nextInt();
		System.out.print("Quantidade de Colunas - ");
		int coluna = input.nextInt();
		
		input.close();
		
		System.out.print("\n- Opção a) -\n\n");
		for	(i = 0 ; i < linha ; i++)
		{
			for	(j = 0 ; j < coluna ; j++)
			{
				if (j <= i)
				{
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n- Opção b) -\n\n");
		for	(i = 0 ; i < linha ; i++)
		{
			for	(j = 0 ; j < coluna ; j++)
			{
				if (i == j || i == coluna - j - 1)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n- Opção c) -\n\n");
		for	(i = 0 ; i < linha ; i++)
		{
			for	(j = 0 ; j < coluna ; j++)
			{
				if (i%2==0)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n- Opção d) -\n\n");
		for	(i = 0 ; i < linha ; i++)
		{
			for	(j = 0 ; j < coluna ; j++)
			{
				if (i == 0 || i == linha - 1 || j == 0 || j == coluna - 1)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n- Opção e) -\n\n");
		for	(i = 0 ; i < linha ; i++)
		{
			for	(j = 0 ; j < coluna ; j++)
			{
				if (i >= linha/2)
				{
					if (j%2==0)
					{
						System.out.print(" # ");
					}
					else
					{
						System.out.print(" $ ");
					}
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
	}
}
