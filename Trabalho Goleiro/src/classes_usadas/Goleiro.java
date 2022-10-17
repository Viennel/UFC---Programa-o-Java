package classes_usadas;

public class Goleiro 
{
	private int ID;
	private String Nome;
	private int AAG;
	private int Velocidade;
	private int Flexibilidade;
	private int Agilidade;
	private int Coordenação;
	private int Força;
	private int Equilibrio;
	
	public Goleiro(int id, String nome, int Vel, int Fle, int Agi, int Coor, int For, int Equi)
	{
		ID = id;
		Nome = nome;
		Velocidade = Vel;
		Flexibilidade = Fle;
		Agilidade = Agi;
		Coordenação = Coor;
		Força = For;
		Equilibrio = Equi;
		AAG = (Velocidade*3 + Flexibilidade*2 + Agilidade*3 + Coordenação*2 + Força + Equilibrio*2)/8;
	}
	public int getAAG()
	{
		return AAG;
	}
	public int getID()
	{
		return ID;
	}
	public String getNome()
	{
		return Nome;
	}
	
	public int getVelocidade()
	{
		return Velocidade;
	}
	public int getFlexibilidade()
	{
		return Flexibilidade;
	}
	public int getAgilidade()
	{
		return Agilidade;
	}
	public int getCoordenação()
	{
		return Coordenação;
	}
	public int getForça()
	{
		return Força;
	}
	public int getEquilibrio()
	{
		return Equilibrio;
	}
}
