package Q5;

public class Operações 
{
	public int PrimeiroNumero;
	public int SegundoNumero;
	
	public Operações()
	{
		PrimeiroNumero = 0;
		SegundoNumero = 0;
	}
	
	public void DefinirNumeros(int i)
	{
		PrimeiroNumero = i/10;
		SegundoNumero = i%10;
	}
	
	public int SOMA()
	{
		int SomadosNumeros = PrimeiroNumero + SegundoNumero;
		return SomadosNumeros;
	}
	
	public int MULTIPLICAÇÃO()
	{
		int MultiplicaçãodosNumeros = PrimeiroNumero * SegundoNumero;
		return MultiplicaçãodosNumeros;
	}
}
