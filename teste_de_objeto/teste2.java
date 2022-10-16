package teste_de_objeto;

public class teste2 
{
	private String test2[][];
	private teste1 t1;
	
	public void setTeste2(int X)
	{
		test2 = t1.gettest1();
		
		test2[X][X] = "X";
	}
	public void setTeste1(teste1 t)
	{
		t1 = t;
	}
	
	public String impressãotest2()
	{
		String Aux = "";
		for (int i = 0; i < test2.length; i++) 
		{
			for (int j = 0; j < test2[0].length; j++) 
			{
				Aux+= test2[i][j] + " ";
			}
			Aux+= "\n";
		}
		return Aux;
	}
}
