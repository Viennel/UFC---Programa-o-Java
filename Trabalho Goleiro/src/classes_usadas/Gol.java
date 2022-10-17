package classes_usadas;

public class Gol 
{
	private String[][] MapeamentodoGol;
	private String[][] QuadrantesdoGol;
	
	public Gol (int I, int J)
	{
		MapeamentodoGol = new String[I][J];
		QuadrantesdoGol = new String[I][J];
		
		for (int i = 0; i < I; i++) 
		{
			for (int j = 0; j < J; j++) 
			{
				if (i == 0 || j == 0 || j == J-1)
				{
					MapeamentodoGol[i][j] = "F";
				}
				else if (i == 1 || j == 1 || j == J-2)
				{
					MapeamentodoGol[i][j] = "T";
				}
				else if (i == 2 && (j == 2 || j == J-3))
				{
					MapeamentodoGol[i][j] = "G";
				}
				else
				{
					MapeamentodoGol[i][j] = "#";
				}
						
				if (i >= 0 && i < I/2 && j >= 0 && j < J/2)
				{
					QuadrantesdoGol[i][j] = "1";
				}
				else if (i >= 0 && i < I/2 && j >= J/2 && j < J)
				{
					QuadrantesdoGol[i][j] = "2";
				}
				else if (i >= I/2 && i < I && j >= 0 && j < J/2)
				{
					QuadrantesdoGol[i][j] = "3";
				}
				else if (i >= I/2 && i < I && j >= J/2 && j < J)
				{
					QuadrantesdoGol[i][j] = "4";
				}
			}
		}
	}
	
	public String DesenharGol()
	{
		String Aux = "";
		for (int i = 0; i < MapeamentodoGol.length; i++) 
		{
			for (int j = 0; j < MapeamentodoGol[0].length; j++) 
			{
				Aux+= MapeamentodoGol[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
	
	public String DesenharQuadrantesdoGol()
	{
		String Aux = "";
		for (int i = 0; i < QuadrantesdoGol.length; i++) 
		{
			for (int j = 0; j < QuadrantesdoGol[0].length; j++) 
			{
				Aux+= QuadrantesdoGol[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
	
	public String[][] getGolTotal()
	{
		return MapeamentodoGol;
	}
//	public String[][] getQuadrantes()
//	{
//		return QuadrantesdoGol;
//	}
	
	public void setCelula(int I, int J, String X)
	{
		MapeamentodoGol[I][J] = X; 
	}
	public String getCelula(int I, int J)
	{
		return MapeamentodoGol[I][J]; 
	}
}
