package respostas;

import java.util.Scanner;

public class Q11
{
	public static int Exponencial(int Valor, int Potencia)
	{
		int Exp = (int)Math.round(Math.pow(Valor, Potencia));;
		
		return Exp;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

	    System.out.print("Digite sua Matricula -> ");
	    int Matricula = input.nextInt();
	    input.close();
	    
	    int aux = 0;
	    int ValordaUnidade = 0;
	    int Matriz1[][] = new int[3][2];
	    
	    System.out.println("\nMatriz da Matricula");
	    for (int i = 0; i < 3; i++)
	    {
			for (int j = 0; j < 2; j++)
			{
				Matriz1[i][j] = (Matricula - ValordaUnidade)/Exponencial(10, 6-(aux+1));
				ValordaUnidade += Matriz1[i][j]*Exponencial(10, 6-(aux+1));
				aux++;
				System.out.print(Matriz1[i][j] + " ");
			}
			System.out.println();
		}
	    
	    System.out.println("\nMatriz rotacionada no sentido horario");
	    for (int j = 0; j < 2; j++)
	    {
	    	   for (int i = 2; i >= 0; i--)
			{
	    		   System.out.print(Matriz1[i][j] + " ");
			}
	    	System.out.println();
		}
	}
}
