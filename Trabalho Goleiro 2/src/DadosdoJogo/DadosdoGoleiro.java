package DadosdoJogo;

public class DadosdoGoleiro 
{
	public int PontuaçãoGeral;
	public int DefesasnaAreadeDefesa;
	public int DefesasnoCorpodoGoleiro;
	public int DefesasnaMãoDireita;
	public int DefesasnaMãoEsquerda;
	
	public DadosdoGoleiro()
	{
		Dadosbase_ResetarGoleiro();
	}
	
	public void Dadosbase_ResetarGoleiro()
	{
		PontuaçãoGeral = 0;
		DefesasnaAreadeDefesa = 0;
		DefesasnoCorpodoGoleiro = 0;
		DefesasnaMãoDireita = 0;
		DefesasnaMãoEsquerda = 0;
	}
}
