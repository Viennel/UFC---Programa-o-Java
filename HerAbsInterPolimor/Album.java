package HerAbsInterPolimor;

import java.util.ArrayList;

public class Album 
{
	private String Artista;
	private ArrayList<Musica> ListadeMusicas;
	
	public Album(Musica M)
	{
		ListadeMusicas = new ArrayList<Musica>();
		ListadeMusicas.add(M);
	}
	
	public void addMusica(Musica m)
	{
		if (m.getDuracao()!= 0)
		{
			ListadeMusicas.add(m);
		}
	}
	
	public ArrayList<Musica> getListadeMusicas()
	{
		return ListadeMusicas;
	}
	
	public void setArtista(String Art)
	{
		Artista = Art;
	}
	
	public String getArtista()
	{
		return Artista;
	}
}

