package respostas;

import java.util.Scanner;

public class Q12 
{
	public static String[] Criptografa(String texto)
	{
		String Criptografado[] = new String[texto.length()];
		
		for (int i = 0 ; i < texto.length() ; i++)
		{
			if (texto.charAt(i) == 'a')
			{
				Criptografado[i] = "%";
			}
			else if (texto.charAt(i) == 'b')
			{
				Criptografado[i] = "*";
			}
			else if (texto.charAt(i) == 'c')
			{
				Criptografado[i] = "(";
			}
			else if (texto.charAt(i) == 'd')
			{
				Criptografado[i] = "-";
			}
			else if (texto.charAt(i) == 'e')
			{
				Criptografado[i] = "+";
			}
			else if (texto.charAt(i) == 'f')
			{
				Criptografado[i] = "@";
			}
			else if (texto.charAt(i) == 'g')
			{
				Criptografado[i] = "#";
			}
			else if (texto.charAt(i) == 'h')
			{
				Criptografado[i] = "1";
			}
			else if (texto.charAt(i) == 'i')
			{
				Criptografado[i] = "2";
			}
			else if (texto.charAt(i) == 'j')
			{
				Criptografado[i] = "3";
			}
			else if (texto.charAt(i) == 'l')
			{
				Criptografado[i] = "4";
			}
			else if (texto.charAt(i) == 'm')
			{
				Criptografado[i] = "5";
			}
			else if (texto.charAt(i) == 'n')
			{
				Criptografado[i] = "6";
			}
			else if (texto.charAt(i) == 'o')
			{
				Criptografado[i] = "7";
			}
			else if (texto.charAt(i) == 'p')
			{
				Criptografado[i] = "8";
			}
			else if (texto.charAt(i) == 'q')
			{
				Criptografado[i] = "9";
			}
			else if (texto.charAt(i) == 'r')
			{
				Criptografado[i] = "{";
			}
			else if (texto.charAt(i) == 's')
			{
				Criptografado[i] = "}";
			}
			else if (texto.charAt(i) == 't')
			{
				Criptografado[i] = "!";
			}
			else if (texto.charAt(i) == 'u')
			{
				Criptografado[i] = "&";
			}
			else if (texto.charAt(i) == 'v')
			{
				Criptografado[i] = "$";
			}
			else if (texto.charAt(i) == 'x')
			{
				Criptografado[i] = "?";
			}
			else if (texto.charAt(i) == 'z')
			{
				Criptografado[i] = ":";
			}
			else if (texto.charAt(i) == ' ')
			{
				Criptografado[i] = " ";
			}
		}
		return Criptografado;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva sua frase abaixo:");
		String texto = input.nextLine();
		input.close();
		
		System.out.println("Frase criptografada:");
		String Cript[] = Criptografa(texto);
		for (int i = 0 ; i < texto.length() ; i++)
		{
			System.out.print(Cript[i]);
		}
	}
}

