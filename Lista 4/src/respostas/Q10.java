package respostas;

import java.util.Scanner;

public class Q10 
{
	public static int Exponencial(int Valor, int Potencia)
	{
		int Exp = (int)Math.round(Math.pow(Valor, Potencia));;
		
		return Exp;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

	    System.out.print("Digite um Numero para saber se ele é um Número de Armstrong -> ");
	    String Numero = input.next();
	    int NumeroCompleto = Integer.parseInt(Numero);
	    int ValordaUnidade = 0;
	    int Unidades[] = new int[Numero.length()];
	    int Somatorio = 0;
	    input.close();
	    
	    for (int i = 0 ; i < Numero.length() ; i++) 
	    {
	    	Unidades[i] = (NumeroCompleto - ValordaUnidade)/Exponencial(10, Numero.length()-(i+1));
	    	ValordaUnidade+=Unidades[i]*Exponencial(10, Numero.length()-(i+1));
	    	Somatorio+=Exponencial(Unidades[i], Numero.length());
		}
	    
	    if (Somatorio == NumeroCompleto)
	    {
	    	System.out.print(NumeroCompleto + " é um Número de Armstrong");
	    }
	    else
	    {
	    	System.out.print(NumeroCompleto + " não é um Número de Armstrong");
	    }
	}
}
