package classes_usadas;

import java.util.Random;

public class SistemadeAvaliação
{
	private GrupodeSeleções GS;
	private Bola B;
	private Gol G;
	private String auxBola[][];
	private String auxGoleiro[][];
	
	public SistemadeAvaliação(Gol g)
	{
		G = g;
	}
	public void setListadeSeleçõesproSistema(GrupodeSeleções grupo)
	{
		GS = grupo;
	}
	public void setBolaproSistema(Bola b)
	{
		B = b;
	}
	
	public void GolBola(int X)
	{
		auxBola = new String[G.getGolTotal().length][G.getGolTotal()[0].length];
		setarAreas(auxBola, G.getGolTotal());
		auxBola[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()] = "*";
	}
	
	public void GoleiroBola(int X, int Y, int Z)
	{
		int AuxPi = 0, AuxPj = 0;
		Random R = new Random();
		auxGoleiro = new String[G.getGolTotal().length][G.getGolTotal()[0].length];
		setarAreas(auxGoleiro, G.getGolTotal());
		
		if (B.getChutes().get(X).getQuadrante() == 1)
		{
			AuxPi = R.nextInt((auxGoleiro.length)/2);
			AuxPj = R.nextInt((auxGoleiro[0].length)/2);
		}
		else if (B.getChutes().get(X).getQuadrante() == 2)
		{
			AuxPi = R.nextInt((auxGoleiro.length)/2);
			AuxPj = auxGoleiro[0].length - R.nextInt(auxGoleiro[0].length/2) - 1;
		}
		else if (B.getChutes().get(X).getQuadrante() == 3)
		{
			AuxPi = auxGoleiro.length - R.nextInt(auxGoleiro.length/2) - 1;
			AuxPj = R.nextInt((auxGoleiro[0].length)/2);
		}
		else if (B.getChutes().get(X).getQuadrante() == 4)
		{
			AuxPi = auxGoleiro.length - R.nextInt(auxGoleiro.length/2) - 1;
			AuxPj = auxGoleiro[0].length - R.nextInt(auxGoleiro[0].length/2) - 1;
		}
		
		int ContadordaArea = 0;
		int auxi = AuxPi, auxj = AuxPj;
		do
		{
			if (AuxPi >= 0 && AuxPj < auxGoleiro[0].length)
			{
				if((AuxPi == auxi || AuxPi == auxi-3) || (AuxPj == auxj || AuxPj == auxj+3))
				{
					auxGoleiro[AuxPi][AuxPj] = "M";
				}
				else
				{
					auxGoleiro[AuxPi][AuxPj] = "D";
				}
			}
			ContadordaArea++;
			AuxPi--;
			if (AuxPi == auxi-4)
			{
				AuxPi = auxi;
				AuxPj++;
			}
		}
		while (ContadordaArea < GS.getListadeSeleções().get(Y).getSeleção().get(Z).getAAG());
		
	}
	
	public String Comparação(int X, int Y, int Z)
	{
		String Aux = "Gol! - O Goleiro não pegou a Bola";
	
		if (auxGoleiro[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("D"))			
		{
				Aux = "Defesa! - O Goleiro conseguiu pegar a Bola";
		}
		else if (auxGoleiro[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("M"))		
		{
			if (B.getChutes().get(X).getForça() > GS.getListadeSeleções().get(Y).getSeleção().get(Z).getForça())
			{
				Aux = "Margem! - A força do chute foi maior, ocorreu um gol";
			}
			else
			{
				Aux = "Margem! - A força do goleiro foi maior, o gol foi defendido";
			}
		}
		return Aux;
	}
	
	public String DesenharGolBola()
	{
		String Aux = "";
		for (int i = 0; i < auxBola.length; i++) 
		{
			for (int j = 0; j < auxBola[0].length; j++) 
			{
				Aux+= auxBola[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
	
	public String DesenharGoleiroBola()
	{
		String Aux = "";
		for (int i = 0; i < auxGoleiro.length; i++) 
		{
			for (int j = 0; j < auxGoleiro[0].length; j++) 
			{
				Aux+= auxGoleiro[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
	
	public void setarAreas(String Area[][], String Referencia[][])
	{
		for (int i = 0; i < Referencia.length; i++)
		{
			for (int j = 0; j < Referencia[0].length; j++) 
			{
				Area[i][j] = Referencia[i][j];
			}
		}
	}
}
