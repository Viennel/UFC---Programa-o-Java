package respostas;

import java.util.Scanner;

public class Q9 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

	    System.out.print("Qual a altura da arvore? (Quantidade de Linhas) -> ");
	    int h = input.nextInt();
	    input.close();
	    
	    for (int i = 0 ; i < h ; i++)
	    {
	        for (int j = 0 ; j < (h - i) ; j++)
	        {
	        	System.out.print(" ");
	        }
	        for (int j = 0 ; j < (2*i - 1) ; j++)
	        {
	        	System.out.print("*");
	        }
	        System.out.println("");
	    }
	}
}
