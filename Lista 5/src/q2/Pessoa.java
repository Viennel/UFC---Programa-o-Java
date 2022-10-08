package q2;

public class Pessoa 
{
	private String Idade;
	private int DiadeNascimento;
	private int MesdeNascimento;
	private int AnodeNascimento;
	private String Nome;
	
	public void CalculaIdade(int DIAatual, int MESatual, int ANOatual)
	{
		int MesesdoAno[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (DiadeNascimento > DIAatual)
		{
			DIAatual+=MesesdoAno[MESatual-1];
			MESatual--;
		}
		
		if (MesdeNascimento > MESatual)
		{
			ANOatual--;
			MESatual+=12;
		}
		
		Idade = Integer.toString(ANOatual - AnodeNascimento) + " Anos, " + Integer.toString(MESatual - MesdeNascimento) + " Meses e " + Integer.toString(DIAatual - DiadeNascimento) + " Dias";
	}
	public String informaIdade()
	{
		return Idade;
	}
	
	public void ajustaDataDeNascimento(int Dia, int Mes, int Ano)
	{
		DiadeNascimento = Dia;
		MesdeNascimento = Mes;
		AnodeNascimento = Ano;
	}
	
	public void NomedaPessoa(String NomeRecebido)
	{
		Nome = NomeRecebido;
	}
	public String informaNome()
	{
		return Nome;
	}
	
}
