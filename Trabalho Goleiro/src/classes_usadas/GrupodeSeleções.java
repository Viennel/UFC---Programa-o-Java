package classes_usadas;

import java.util.ArrayList;

public class GrupodeSeleções 
{
	private ArrayList<Seleção> ListadeSeleções = new ArrayList<Seleção>();
	
	public void setGrupodeSeleções(Seleção S)
	{
		ListadeSeleções.add(S);
	}
	public ArrayList<Seleção> getListadeSeleções()
	{
		return ListadeSeleções;
	}
}
