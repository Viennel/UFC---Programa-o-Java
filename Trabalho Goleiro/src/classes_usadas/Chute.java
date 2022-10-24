package classes_usadas;

public class Chute 
{
	private int ID;
	private int Força;
	private int Quadrante;
	private int Pi;
	private int Pj;

	public Chute (int id, int For, int Quad, int PosI, int PosJ)
	{
		ID = id;
		Força = For;
		Pi = PosI;
		Pj = PosJ;
		Quadrante = Quad;
	}
	
	public int getPi()
	{
		return Pi;
	}
	public int getPj()
	{
		return Pj;
	}
	public int getQuadrante()
	{
		return Quadrante;
	}
	public int getForça()
	{
		return Força;
	}
	public int getID()
	{
		return ID;
	}
	
}
