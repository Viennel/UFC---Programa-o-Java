package classes_usadas;

import java.util.ArrayList;

public class Seleção 
{
	private ArrayList<Goleiro> Seleção = new ArrayList<Goleiro>();
	
	public Seleção(Goleiro GA, Goleiro GB, Goleiro GC, Goleiro GD, Goleiro GE)
	{
		Seleção.add(GA);
		Seleção.add(GB);
		Seleção.add(GC);
		Seleção.add(GD);
		Seleção.add(GE);
	}
	public ArrayList<Goleiro> getSeleção()
	{
		return Seleção;
	}
}
