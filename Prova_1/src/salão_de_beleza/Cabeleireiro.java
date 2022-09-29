package salão_de_beleza;

public class Cabeleireiro 
{
	private int Id;
	private String Nome;
	private String CPF;
	
	public int setId(int IdRecebido)
	{
		if (IdRecebido > 0)
		{
			Id = IdRecebido;
		}
		return Id;
	}
	public int getId() 
	{
		return Id;
	}
	
	public Cabeleireiro (String CPFAnalisado, String NomeAnalisado)
	{
		setCPF(CPFAnalisado);
		setNome(NomeAnalisado);
	}
	public String setCPF(String CPFRecebido)
	{
		CPF = CPFRecebido;
		return CPF;
	}
	public String getCPF() 
	{
		return CPF;
	}
	public String setNome(String NomeRecebido)
	{
		if (NomeRecebido.length() >= 3 )
		{
			Nome = NomeRecebido;
		}
		return Nome;
	}
	public String getNome() 
	{
		return Nome;
	}
}
