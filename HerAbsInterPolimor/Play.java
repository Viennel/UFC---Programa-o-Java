package HerAbsInterPolimor;

import java.util.ArrayList;

public class Play implements IPlay
{
	public ArrayList<Album> ListadeAlbum;
	
	public Play()
	{
		ListadeAlbum = new ArrayList<Album>();
	}
	
	public void addAlbum(Album A)
	{
		ListadeAlbum.add(A);
	}
	
	public ArrayList<Album> getListadeAlbum()
	{
		return ListadeAlbum;
	}

	@Override
	public String start() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String stop() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int next(int quantidade) {
		return quantidade;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int back(int quantidade) {
		return quantidade;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pause() {
		return null;
		// TODO Auto-generated method stub
		
	}
}
