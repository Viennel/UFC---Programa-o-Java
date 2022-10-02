package lab1;

import java.util.ArrayList;

public class Balanço 
{
	private ArrayList<Atendimento> Balanço = new ArrayList<Atendimento>();
	
	public void setBalanço(ArrayList<Atendimento> balanco) {
		Balanço = balanco;
	}
	public void addAtendimento(Atendimento At) {
		Balanço.add(At);
	}
	public ArrayList<Atendimento> getBalanço()
	{
		return Balanço;
	}
}
