package teste_de_objeto;

public class teste1 
{
	private String test[][];
	
	public teste1(int x, int y)
	{
		test = new String[x][y];
		
		for (int i = 0; i < test.length; i++) 
		{
			for (int j = 0; j < test[0].length; j++) 
			{
				if (i == j)
				{
					test[i][j] = "+";
				}
				else
				{
					test[i][j] = "-";
				}
			}
		}
	}
	
	public String[][] gettest1()
	{
		return test;
	}
	
	public String impressãoteste1()
	{
		String Aux = "";
		for (int i = 0; i < test.length; i++) 
		{
			for (int j = 0; j < test[0].length; j++) 
			{
				Aux+= test[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
}
