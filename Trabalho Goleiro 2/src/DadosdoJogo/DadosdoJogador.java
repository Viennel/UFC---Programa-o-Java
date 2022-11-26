package DadosdoJogo;

public class DadosdoJogador 
{
	public int Pontuação;
	public String Nome;
	
	public DadosdoJogador()
	{
		Dadosbase_ResetarJogador();
	}
	
	public void Dadosbase_ResetarJogador()
	{
		Pontuação = 0;
		Nome = "";
	}
}
