package HerAbsInterPolimor;

public class PlayVinicius539250 extends Play 
{
	private int M = 0;
	public String Opção = "0";
	public String Ação(String OP)
	{
		if (OP.equals("1"))
		{
			Opção = start();
		}
		else if (OP.equals("2"))
		{
			Opção =pause();
		}
		else if (OP.equals("3"))
		{
			Opção = next();
		}
		else if (OP.equals("4"))
		{
			Opção = back();
		}
		else if (OP.equals("5"))
		{
			Opção = stop();
		}
		else if (OP.equals("0"))
		{
			Opção = "Saindo";
		}
			
		return Opção;
	}
	
	public String start() 
	{
		return "Tocando agora: " + ListadeAlbum.get(0).getListadeMusicas().get(M).getNome();
	}
	
	public String pause() 
	{
		return ListadeAlbum.get(0).getListadeMusicas().get(M).getNome() + " foi Pausado";
	}
	
	public String next() 
	{
		M++;
		if (M >= ListadeAlbum.get(0).getListadeMusicas().size())
		{
			M = 0;
		}
		return "Indo para proxima musica: " + ListadeAlbum.get(0).getListadeMusicas().get(M).getNome();
	}
	
	public String back() 
	{
		M--;
		if (M < 0)
		{
			M = ListadeAlbum.get(0).getListadeMusicas().size()-1;
		}
		return "Indo para a musica anterior: " + ListadeAlbum.get(0).getListadeMusicas().get(M).getNome();
	}
	
	public String stop() 
	{
		return "Album parado";
	}
}
