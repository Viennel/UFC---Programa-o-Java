package respostas;

import java.lang.StringBuilder;
import java.util.Scanner;

public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreve a String para inverte-la:\n\nString Normal -> ");
		String Frase = input.nextLine();
		char FraseInvertida[] = new char[Frase.length()];
		
		input.close();
		
		for (int i = 0; i < Frase.length(); i++)
		{
			FraseInvertida[i] = Frase.charAt(Frase.length() - (i+1));
		}
		
		StringBuilder NovaFrase = new StringBuilder();
		System.out.print("\nString Invertida -> " + NovaFrase.append(FraseInvertida));
		
	}
}
