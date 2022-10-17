package classes_usadas;

import java.util.ArrayList;

public class Bola 
{
	private ArrayList<Chute> Chutes = new ArrayList<Chute>();
	
	public void addChutes(Chute C)
	{
		Chutes.add(C);
	}
	public ArrayList<Chute> getChutes()
	{
		return Chutes;
	}
}
