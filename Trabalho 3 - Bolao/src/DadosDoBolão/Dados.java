package DadosDoBolão;

import java.util.ArrayList;

public class Dados 
{
	public int id;
	public String Nome;
	
	public ArrayList<Selecoes> SelNasQuartas;
	public ArrayList<Selecoes> SelNasSemiFinais;
	public ArrayList<Selecoes> SelNasFinais;

	public String SelCamp;
	
	public Dados()
	{
		Nome = new String();
		
		SelNasQuartas = new ArrayList<Selecoes>();
		SelNasSemiFinais = new ArrayList<Selecoes>();
		SelNasFinais = new ArrayList<Selecoes>();
		
		SelCamp = new String();
	}
}
