package HerAbsInterPolimor;

public class Musica {

	private String Nome;
	private int Duracao;
	
	public Musica (String nomeRecebido)
	{
		Nome = nomeRecebido;
	}
	
	public String getNome()
	{
		return Nome;
	}
	
	public void setDuracao(int duraçãoRecebida)
	{
		if (duraçãoRecebida >= 0)
		{
			Duracao = duraçãoRecebida;
		}
	}
	public int getDuracao()
	{
		return Duracao;
	}
	
}
