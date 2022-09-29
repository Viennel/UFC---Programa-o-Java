package salão_de_beleza;

public class Serviço 
{
	private int Id;
	private String Nome;
	private float Valor;
	private String Descrição;
	
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
	
	public String setNome(String NomeRecebido)
	{
		if (NomeRecebido.length() >= 5 )
		{
			Nome = NomeRecebido;
		}
		return Nome;
	}
	public String getNome() 
	{
		return Nome;
	}
	
	public float setValor(float ValorRecebido)
	{
		if (ValorRecebido >= 0)
		{
			Valor = ValorRecebido;
		}
		return Valor;
	}
	public float getValor() 
	{
		return Valor;
	}
	
	public String setDescrição(String DescriçãoRecebida)
	{
		if (DescriçãoRecebida.length() >= 10 )
		{
			Descrição = DescriçãoRecebida;
		}
		return Descrição;
	}
	public String getDescrição() 
	{
		return Descrição;
	}
	
}
