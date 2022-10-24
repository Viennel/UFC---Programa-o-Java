package classes_usadas;

import java.util.Random;

public class SistemadeAvaliação
{
	private GrupodeSeleções GS;
	private Bola B;
	private Gol G;
	
	private String PosiçãodaBola[][];
	private String AreadeAtuaçãodoGoleiro[][];
	private String GolsNosQuadrantes[][];
	private String GolsQueOcorreramNoAngulo;
	
	public SistemadeAvaliação(Gol g, GrupodeSeleções gs, Bola b)
	{
		G = g;
		GS = gs;
		B = b;
	
		GolsQueOcorreramNoAngulo = "-------------------------------------------------------------------------\n\n";
		GolsQueOcorreramNoAngulo += "Gols que Ocorreram no Angulo:\n";
		GolsNosQuadrantes = new String[G.getGolTotal().length][G.getGolTotal()[0].length];
		setarAreas(GolsNosQuadrantes, G.getQuadrantes());
	}
	
	
	public void GolBola(int X)
	{
		PosiçãodaBola = new String[G.getGolTotal().length][G.getGolTotal()[0].length];
		setarAreas(PosiçãodaBola, G.getGolTotal());
		PosiçãodaBola[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()] = "*";
	}
	
	
	public void GoleiroBola(int X, int Y, int Z)
	{
		int AuxPi = 0, AuxPj = 0;
		Random R = new Random();
		AreadeAtuaçãodoGoleiro = new String[G.getGolTotal().length][G.getGolTotal()[0].length];
		setarAreas(AreadeAtuaçãodoGoleiro, G.getGolTotal());
		
		if (B.getChutes().get(X).getQuadrante() == 1)
		{
			AuxPi = R.nextInt((AreadeAtuaçãodoGoleiro.length)/2);
			AuxPj = R.nextInt((AreadeAtuaçãodoGoleiro[0].length)/2);
		}
		else if (B.getChutes().get(X).getQuadrante() == 2)
		{
			AuxPi = R.nextInt((AreadeAtuaçãodoGoleiro.length)/2);
			AuxPj = AreadeAtuaçãodoGoleiro[0].length - R.nextInt(AreadeAtuaçãodoGoleiro[0].length/2) - 1;
		}
		else if (B.getChutes().get(X).getQuadrante() == 3)
		{
			AuxPi = AreadeAtuaçãodoGoleiro.length - R.nextInt(AreadeAtuaçãodoGoleiro.length/2) - 1;
			AuxPj = R.nextInt((AreadeAtuaçãodoGoleiro[0].length)/2);
		}
		else if (B.getChutes().get(X).getQuadrante() == 4)
		{
			AuxPi = AreadeAtuaçãodoGoleiro.length - R.nextInt(AreadeAtuaçãodoGoleiro.length/2) - 1;
			AuxPj = AreadeAtuaçãodoGoleiro[0].length - R.nextInt(AreadeAtuaçãodoGoleiro[0].length/2) - 1;
		}
		
		int ContadordaArea = 0;
		int auxi = AuxPi, auxj = AuxPj;
		do
		{
			if (AuxPi >= 0 && AuxPj < AreadeAtuaçãodoGoleiro[0].length)
			{
				if((AuxPi == auxi || AuxPi == auxi-3) || (AuxPj == auxj || AuxPj == auxj+3))
				{
					AreadeAtuaçãodoGoleiro[AuxPi][AuxPj] = "M";
				}
				else
				{
					AreadeAtuaçãodoGoleiro[AuxPi][AuxPj] = "D";
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
		String Aux1 = "";
		String Aux2 = "Chute " + (X+1) + " -> ";
		
		if (G.getGolTotal()[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("F"))
		{
			Aux1 = "Fora!\n";
			GS.getListadeSeleções().get(Y).getSeleção().get(Z).AumentarPontuaçãoMaxima();
		}
		else if (G.getGolTotal()[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("T"))
		{
			Aux1 = "Trave!\n";
			GS.getListadeSeleções().get(Y).getSeleção().get(Z).AumentarPontuaçãoMaxima();
		}
		else
		{
			if (AreadeAtuaçãodoGoleiro[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("D"))			
			{
					Aux1 = "Defesa!\n";
					GS.getListadeSeleções().get(Y).getSeleção().get(Z).AumentarPontuaçãoMaxima();
			}
			else if (AreadeAtuaçãodoGoleiro[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("M"))		
			{
				if (B.getChutes().get(X).getForça() > GS.getListadeSeleções().get(Y).getSeleção().get(Z).getForça())
				{
					Aux1 = "Margem! - Força do Chute > Força do Goleiro - Gol!\n";
					setGolsEmCadaQuadrante(X, Y, Z);
				}
				else
				{
					Aux1 = "Margem! - Força do Chute <= Força do Goleiro - Defesa!\n";	
					GS.getListadeSeleções().get(Y).getSeleção().get(Z).AumentarPontuaçãoMaxima();
				}
			}
			else
			{
				Aux1 = "Gol!\n";
				setGolsEmCadaQuadrante(X, Y, Z);
			}
		}
		
		if ((Aux1.equals("Margem! - Força do Chute > Força do Goleiro - Gol!\n") || Aux1.equals("Gol!\n")) && AreadeAtuaçãodoGoleiro[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("A"))
		{
			GolsQueOcorreramNoAngulo += "Chute - " + B.getChutes().get(X).getID() + " // Goleiro: " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getNome() + "\n";
		}
		
		Aux2 += Aux1;
		 
		return Aux2;
	}
	
	
	public String LocalizaçãodosChutes()
	{
		int ChutespraFora = 0;
		int ChutesnaTraveEsquerda = 0;
		int ChutesnaTraveDireita = 0;
		int ChutesnaTraveSuperior = 0;
		int ChutesnoAngulo = 0;
		int ChutesnaDireçãodoGol = 0;
		String Chutes = "";
		
		for (int i = 0; i < B.getChutes().size(); i++) 
		{
			if (G.getGolTotal()[B.getChutes().get(i).getPi()][B.getChutes().get(i).getPj()].equals("F"))
			{
				ChutespraFora++;
			}
			else if (G.getGolTotal()[B.getChutes().get(i).getPi()][B.getChutes().get(i).getPj()].equals("T"))
			{
				if (B.getChutes().get(i).getPj() == 1)
				{
					ChutesnaTraveEsquerda++;
				}
				else if (B.getChutes().get(i).getPj() ==  G.getGolTotal()[0].length - 2)
				{
					ChutesnaTraveDireita++;
				}
				else
				{
					ChutesnaTraveSuperior++;
				}
			}
			else if (G.getGolTotal()[B.getChutes().get(i).getPi()][B.getChutes().get(i).getPj()].equals("A"))
			{
				ChutesnoAngulo++;
			}
			else
			{
				ChutesnaDireçãodoGol++;
			}		
		}
		
		Chutes += "Quantidade de Chutes:\n";
		Chutes += "Chutes pra Fora - " + ChutespraFora + "\n";
		Chutes += "Chutes na Trave Esquerda - " + ChutesnaTraveEsquerda + "\n";
		Chutes += "Chutes na Trave Direita - " + ChutesnaTraveDireita + "\n";
		Chutes += "Chutes na Trave Superior - " + ChutesnaTraveSuperior + "\n";
		Chutes += "Chutes no Angulo do Gol - " + ChutesnoAngulo + "\n";
		Chutes += "Chutes na Direção do Gol - " + ChutesnaDireçãodoGol + "\n";

		return Chutes;
	}
	
	
	public String GolsNoAngulo()
	{
		return GolsQueOcorreramNoAngulo;
	}
	
	
	public void setGolsEmCadaQuadrante(int X, int Y, int Z)
	{
		if (GolsNosQuadrantes[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("1"))
		{
			GS.getListadeSeleções().get(Y).getSeleção().get(Z).getGolsMaisTomados()[0]++;
		}
		else if (GolsNosQuadrantes[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("2"))
		{
			GS.getListadeSeleções().get(Y).getSeleção().get(Z).getGolsMaisTomados()[1]++;
		}
		else if (GolsNosQuadrantes[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("3"))
		{
			GS.getListadeSeleções().get(Y).getSeleção().get(Z).getGolsMaisTomados()[2]++;
		}
		else if (GolsNosQuadrantes[B.getChutes().get(X).getPi()][B.getChutes().get(X).getPj()].equals("4"))
		{
			GS.getListadeSeleções().get(Y).getSeleção().get(Z).getGolsMaisTomados()[3]++;
		}
	}
	
	
	public String QuadranteQueOGoleiroMaisLevouGol(int id)
	{
		int auxi = 0, auxj = 0;
		String Aux1 = "O Goleiro ";
		
		for (int i = 0; i < GS.getListadeSeleções().size(); i++) 
		{
			for (int j = 0; j < GS.getListadeSeleções().get(i).getSeleção().size(); j++) 
			{
				if (GS.getListadeSeleções().get(i).getSeleção().get(j).getID() == id)
				{
					auxi = i;
					auxj = j;
					Aux1 += GS.getListadeSeleções().get(i).getSeleção().get(j).getNome();
				}
			}
		}
		
		int AuxiliardeQuadrante = 0;
		String Aux2 = "";
		for (int k = 0; k < 4; k++) 
		{
			if (AuxiliardeQuadrante < GS.getListadeSeleções().get(auxi).getSeleção().get(auxj).getGolsMaisTomados()[k])
			{
				Aux2 = " Tomou mais gols no Quadrante " + (k+1) + " - " + GS.getListadeSeleções().get(auxi).getSeleção().get(auxj).getGolsMaisTomados()[k];
			}
		}
		
		Aux1 += Aux2;
		
		return Aux1;
	}
	
	
	public String getInformaçõesdoGoleiro(int Y, int Z)
	{
		String Aux = "";
		
		Aux+= "-------------------------------------------------------------------------\n\n";
		Aux+= "Nome: " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getNome();
		Aux+= "\nAAG - " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getAAG();
		Aux+= "\nQualidades:\n";
		Aux+= "\nVelocidade -> " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getVelocidade();
		Aux+= "\nFlexibilidade -> " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getFlexibilidade();
		Aux+= "\nAgilidade -> " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getAgilidade();
		Aux+= "\nCoordenação -> " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getCoordenação();
		Aux+= "\nForça -> " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getForça();
		Aux+= "\nEquilibrio -> " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getEquilibrio() + "\n";
		
		return Aux;
	}
	
	
	public String ResultadoDosChutes(int Y, int Z)
	{
		float Media = GS.getListadeSeleções().get(Y).getSeleção().get(Z).getPontuação();
		String Aux = "";
		Aux += "Dados obtidos com o Goleiro " + GS.getListadeSeleções().get(Y).getSeleção().get(Z).getNome() + "\n";
		Aux += "Pontuação do Goleiro = " +  GS.getListadeSeleções().get(Y).getSeleção().get(Z).getPontuação() + "\n";
		Aux += "Porcentagem de bolas pegas pelo Goleiro = " + (Media/30*100) + "%\n";
		Aux += "Porcentagem de gols ocorridos = " + ((30 - Media)/30*100) + "%\n";
		
		return Aux;
	}
	
	
	public String GoleiroTitulardaSeleção(int Y)
	{
		String Aux = "";
		int GoleiroTitular = 0;
		int MaiorPontuação = GS.getListadeSeleções().get(Y).getSeleção().get(0).getPontuação();
		
		for (int i = 0; i < GS.getListadeSeleções().get(Y).getSeleção().size(); i++) 
		{
			if (MaiorPontuação < GS.getListadeSeleções().get(Y).getSeleção().get(i).getPontuação())
			{
				MaiorPontuação = GS.getListadeSeleções().get(Y).getSeleção().get(i).getPontuação();
				GoleiroTitular = i;
			}
		}
		Aux = "O Titular da Seleção " + (Y+1) + " será o Goleiro " + GS.getListadeSeleções().get(Y).getSeleção().get(GoleiroTitular).getNome() + "\n";
		
		return Aux;
	}
	
	
	
	
	
	
	public String DesenharGolBola()
	{
		String Aux = "";
		for (int i = 0; i < PosiçãodaBola.length; i++) 
		{
			for (int j = 0; j < PosiçãodaBola[0].length; j++) 
			{
				Aux+= PosiçãodaBola[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
	
	public String DesenharGoleiroBola()
	{
		String Aux = "";
		for (int i = 0; i < AreadeAtuaçãodoGoleiro.length; i++) 
		{
			for (int j = 0; j < AreadeAtuaçãodoGoleiro[0].length; j++) 
			{
				Aux+= AreadeAtuaçãodoGoleiro[i][j] + " ";
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
