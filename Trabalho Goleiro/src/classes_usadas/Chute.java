package classes_usadas;

public class Chute 
{
	private int Força;
	private int Quadrante;
	private int Pi;
	private int Pj;
	
	public Chute (int For, int Quad, int PosI, int PosJ)
	{
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
	 
	
}
