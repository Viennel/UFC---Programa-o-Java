package q1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Controle Cont = new Controle();
		System.out.println("Escolha uma opção abaixo:\nVolume - 1\nCanal - 2\nConsultar V/C - 3\nSair - Digite ''sair''");
		String OPControle = "";
		do
		{
			System.out.print("\nOpção: ");
			OPControle = input.next();
			if (OPControle.equals("1"))
			{
				System.out.println("\nControle - VOLUME");
				String aux1;
				do
				{
					aux1 = input.next();
					Cont.AlterarVolume(aux1);
					if(aux1.equals("+") || aux1.equals("-"))
					{
						System.out.println(Cont.getVolume() + "%");
					}
				}
				while(aux1.equals("+") || aux1.equals("-"));
			}
			else if (OPControle.equals("2"))
			{
				System.out.print("\nControle - Canal\nMudar de Canal - 1\nIr para Canal - 2\n\nOpção -> ");
				int OPCanal = input.nextInt();
		
				if (OPCanal == 1)
				{
					System.out.println("\nCanal Atual: " + Cont.getCanal());
					String aux2;
					do
					{
						aux2 = input.next();
						Cont.AlterarCanal(aux2);
						if(aux2.equals("+") || aux2.equals("-"))
						{
							System.out.println("Canal " + Cont.getCanal());
						}
					}
					while(aux2.equals("+") || aux2.equals("-"));
				}
				else if (OPCanal == 2)
				{
					System.out.print("Para qual canal deseja ir? -> Canal ");
					Cont.setCanal(input.nextInt());
				}
			}
			else if(OPControle.equals("3"))
			{
				System.out.println("\nControle - Consultar Volume/Canal");
				System.out.println("Volume: " + Cont.getVolume() + "\nCanal: " + Cont.getCanal());
			}
		}
		while (!OPControle.equals("sair"));
		
		input.close();
		
		
	}
}
