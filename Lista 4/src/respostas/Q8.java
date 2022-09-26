package respostas;

import java.util.Scanner;

public class Q8 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva o numero de telefone (numeros ou simbolos) -> ");
		String TelefoneComCaracteres = input.next();
		char TelefoneComNumeros[] = new char[TelefoneComCaracteres.length()];
		
		input.close();
			
		System.out.print("\nNumero de Telefone completo: ");
		for (int i = 0; i < TelefoneComCaracteres.length(); i++)
		{
			if (TelefoneComCaracteres.charAt(i) == '#')
			{
				TelefoneComNumeros[i] = '1';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'A' || TelefoneComCaracteres.charAt(i) == 'B' || TelefoneComCaracteres.charAt(i) == 'C' )
			{
				TelefoneComNumeros[i] = '2';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'D' || TelefoneComCaracteres.charAt(i) == 'E' || TelefoneComCaracteres.charAt(i) == 'F' )
			{
				TelefoneComNumeros[i] = '3';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'G' || TelefoneComCaracteres.charAt(i) == 'H' || TelefoneComCaracteres.charAt(i) == 'I' )
			{
				TelefoneComNumeros[i] = '4';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'J' || TelefoneComCaracteres.charAt(i) == 'K' || TelefoneComCaracteres.charAt(i) == 'L')
			{
				TelefoneComNumeros[i] = '5';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'M' || TelefoneComCaracteres.charAt(i) == 'N' || TelefoneComCaracteres.charAt(i) == 'O')
			{
				TelefoneComNumeros[i] = '6';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'P' || TelefoneComCaracteres.charAt(i) == 'Q' || TelefoneComCaracteres.charAt(i) == 'R' || TelefoneComCaracteres.charAt(i) == 'S')
			{
				TelefoneComNumeros[i] = '7';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'T' || TelefoneComCaracteres.charAt(i) == 'U' || TelefoneComCaracteres.charAt(i) == 'V')
			{
				TelefoneComNumeros[i] = '8';
			}
			else if (TelefoneComCaracteres.charAt(i) == 'W' || TelefoneComCaracteres.charAt(i) == 'X' || TelefoneComCaracteres.charAt(i) == 'Y' || TelefoneComCaracteres.charAt(i) == 'Z')
			{
				TelefoneComNumeros[i] = '9';
			}
			else if (TelefoneComCaracteres.charAt(i) == '+')
			{
				TelefoneComNumeros[i] = '0';
			}
			else
			{
				TelefoneComNumeros[i] = TelefoneComCaracteres.charAt(i);
			}
			
			if (i == 0)
			{
				System.out.print("(");
			}
			else if (i == 3)
			{
				System.out.print(")");
			}
			
			System.out.print(TelefoneComNumeros[i]);
		}
	}
}
