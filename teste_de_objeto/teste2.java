package teste_de_objeto;

public class teste2 
{
	private String test2[][];
	private teste1 t1;
	
	public void setTeste2(int X)
	{
		test2 = new String[t1.gettest1().length][t1.gettest1()[0].length];
		
//		test2 = t1.gettest1();
		
//		test2 = Arrays.copyOf(t1.gettest1(), t1.gettest1().length);
		
//		System.arraycopy(t1.gettest1(), 0, test2, 0, t1.gettest1().length);
		
//		test2 = t1.gettest1().clone();
		
		for (int i = 0; i < test2.length; i++) 
		{
			for (int j = 0; j < test2.length; j++) 
			{
				test2[i][j] = t1.gettest1()[i][j];
			}
		}
		
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
