package respostas;

import java.util.Scanner;

public class Q6 
{
	public static void main(String[] args) 
	{
		int MeiaVida = 0;
		int Segundos, Minutos, Horas;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Massa do Material Radioativo (g) -> ");
		float MassaInicial = input.nextFloat();
		float MassaFinal = MassaInicial;
		input.close();
		
		for (; MassaFinal >= 0.5 ; MassaFinal/=2) 
		{
			MeiaVida++;
		}
		
		Segundos = 50*MeiaVida;
		Minutos = Segundos/60;
		Horas = Minutos/60;
		Segundos-= (60*Minutos);
		Minutos-= (60*Horas);

		System.out.println("Massa Inicial do Material -> " + MassaInicial);
		System.out.println("Massa Final do Material -> " + MassaFinal);
		System.out.println("Tempo em Horas/Minutos/Segundos até ficar menor que 0,5g -> " + Horas + ":" + Minutos + ":" + Segundos);
	}
}
