package q1;

public class Controle 
{
	private int Volume = 0;
	public void AlterarVolume(String MaisouMenos)
	{
		if (MaisouMenos.equals("+") && Volume <= 100)
		{
			Volume++;
		}
		if (MaisouMenos.equals("-") && Volume > 0)
		{
			Volume--;
		}
	}
	public int getVolume()
	{
		return Volume;
	}
	
	private int Canal = 0;
	public void AlterarCanal(String MaisouMenos)
	{
		if (MaisouMenos.equals("+") && Canal <= 100)
		{
			Canal++;
		}
		if (MaisouMenos.equals("-") && Canal > 0)
		{
			Canal--;
		}
	}
	public void setCanal(int Canalescolhido)
	{
		Canal = Canalescolhido;
	}
	public int getCanal()
	{
		return Canal;
	}
}

