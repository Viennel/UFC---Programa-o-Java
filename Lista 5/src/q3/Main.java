package q3;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		Circulo C = new Circulo();
		
		System.out.print("Informe o raio do circulo -> ");
		C.setRaio(entrada.nextDouble());
		
		System.out.println("Área do Circulo: " + C.Area() + "\nCircunferencia do Circulo:" + C.Circunferência());
		
		System.out.print("\nVocê gostaria de aumentar o Raio em quantos %? -> ");
		C.AumentarCírculo(entrada.nextDouble());
		
		System.out.println("Nova Área do Circulo: " + C.Area() + "\nNova Circunferencia do Circulo:" + C.Circunferência());
		
		entrada.close();
	}
}
