package respostas;

import java.util.Scanner;

public class Q13
{
	public static String[] Descriptografa(String texto)
	{
		String Descriptografado[] = new String[texto.length()];
		
		for (int i = 0 ; i < texto.length() ; i++)
		{
			if (texto.charAt(i) == '%')
			{
				Descriptografado[i] = "a";
			}
			else if (texto.charAt(i) == '*')
			{
				Descriptografado[i] = "b";
			}
			else if (texto.charAt(i) == '(')
			{
				Descriptografado[i] = "c";
			}
			else if (texto.charAt(i) == '-')
			{
				Descriptografado[i] = "d";
			}
			else if (texto.charAt(i) == '+')
			{
				Descriptografado[i] = "e";
			}
			else if (texto.charAt(i) == '@')
			{
				Descriptografado[i] = "f";
			}
			else if (texto.charAt(i) == '#')
			{
				Descriptografado[i] = "g";
			}
			else if (texto.charAt(i) == '1')
			{
				Descriptografado[i] = "h";
			}
			else if (texto.charAt(i) == '2')
			{
				Descriptografado[i] = "i";
			}
			else if (texto.charAt(i) == '3')
			{
				Descriptografado[i] = "j";
			}
			else if (texto.charAt(i) == '4')
			{
				Descriptografado[i] = "l";
			}
			else if (texto.charAt(i) == '5')
			{
				Descriptografado[i] = "m";
			}
			else if (texto.charAt(i) == '6')
			{
				Descriptografado[i] = "n";
			}
			else if (texto.charAt(i) == '7')
			{
				Descriptografado[i] = "o";
			}
			else if (texto.charAt(i) == '8')
			{
				Descriptografado[i] = "p";
			}
			else if (texto.charAt(i) == '9')
			{
				Descriptografado[i] = "q";
			}
			else if (texto.charAt(i) == '{')
			{
				Descriptografado[i] = "r";
			}
			else if (texto.charAt(i) == '}')
			{
				Descriptografado[i] = "s";
			}
			else if (texto.charAt(i) == '!')
			{
				Descriptografado[i] = "t";
			}
			else if (texto.charAt(i) == '&')
			{
				Descriptografado[i] = "u";
			}
			else if (texto.charAt(i) == '$')
			{
				Descriptografado[i] = "v";
			}
			else if (texto.charAt(i) == '?')
			{
				Descriptografado[i] = "x";
			}
			else if (texto.charAt(i) == ':')
			{
				Descriptografado[i] = "z";
			}
			else if (texto.charAt(i) == ' ')
			{
				Descriptografado[i] = " ";
			}
		}
		return Descriptografado;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva sua frase criptografada abaixo:");
		String texto = input.nextLine();
		input.close();
		
		System.out.println("Frase Descriptografada:");
		String Descript[] = Descriptografa(texto);
		for (int i = 0 ; i < texto.length() ; i++)
		{
			System.out.print(Descript[i]);
		}
	}
}

