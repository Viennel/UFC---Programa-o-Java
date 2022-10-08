package q6;

public class Elevador 
{
	private int AndarAtual = 0;
	private int TotaldeAndares;
	private int CapacidadedoElevador;
	private int QuantidadedePessoasnoElevador = 0;
	
	public void setAndarAtual(int Andar)
	{
		AndarAtual = Andar;
	}
	public void setTotaldeAndares(int Total)
	{
		TotaldeAndares = Total;
	}
	public void setCapacidadedoElevador(int Capacidade)
	{
		CapacidadedoElevador = Capacidade;
	}
	public void setQuantidadedePessoasnoElevador(int Quantidadede)
	{
		QuantidadedePessoasnoElevador = Quantidadede;
	}
	
	public int getAndarAtual()
	{
		return AndarAtual;
	}
	public int getTotaldeAndares()
	{
		return TotaldeAndares;
	}
	public int getCapacidadedoElevador()
	{
		return CapacidadedoElevador;
	}
	public int getQuantidadedePessoasnoElevador()
	{
		return QuantidadedePessoasnoElevador;
	}
	
	public void Inicializa()
	{
		getCapacidadedoElevador();
		getTotaldeAndares();	
	}
	
	public String Entra(String PessoaEntra)
	{
		if (PessoaEntra.equals("+") && QuantidadedePessoasnoElevador < CapacidadedoElevador)
		{
			QuantidadedePessoasnoElevador++;
		}
		return PessoaEntra;
	}
	
	public String Sai(String PessoaSai)
	{
		if (PessoaSai.equals("-") && QuantidadedePessoasnoElevador > 0)
		{
			QuantidadedePessoasnoElevador--;
		}
		return PessoaSai;
	}
	
	public String Sobe(String Subindo)
	{
		if (Subindo.equals("^") && AndarAtual <= TotaldeAndares)
		{
			AndarAtual++;
		}
		return Subindo;
	}
	
	public String Desce(String Descendo)
	{
		if (Descendo.equals("v") && AndarAtual > 0)
		{
			AndarAtual--;
		}
		return Descendo;
	}
	
	
}
