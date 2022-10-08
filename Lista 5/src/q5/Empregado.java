package q5;

public class Empregado 
{
	private int ID;
	private String PrimeiroNome;
	private String Sobrenome;
	private double SalárioMensal;
	private boolean[] DiasTrabalhados;
	
	public Empregado(String Nome1, String Nome2)
	{
		PrimeiroNome = Nome1;
		Sobrenome = Nome2;
		DiasTrabalhados = new boolean[29];
	}
	
	public Empregado(String Nome1, String Nome2, int Id)
	{
		PrimeiroNome = Nome1;
		Sobrenome = Nome2;
		ID = Id;
		DiasTrabalhados = new boolean[30];
	}
	
	public String getNomeCompleto()
	{
		String NomeCompleto = PrimeiroNome + " " + Sobrenome;
		return NomeCompleto;
	}
	public int getID()
	{
		return ID;
	}
	
	public void setSalário(double S)
	{
		SalárioMensal = S;
	}

	public void setDiasTrabalhados(int Quant)
	{
		for (int i = 0; i < DiasTrabalhados.length; i++) 
		{
			if (i < Quant)
			{
				DiasTrabalhados[i] = true;
			}
			else if (i >= Quant)
			{
				DiasTrabalhados[i] = false;
			}
		}
	}
	
	public double CalculoDoSalário()
	{
		int QuantdeDiasTrabalhados = 0;
		for (int i = 0; i < DiasTrabalhados.length; i++) 
		{
			if (DiasTrabalhados[i] == true)
			{
				QuantdeDiasTrabalhados++;
			}
		}
		
		if (QuantdeDiasTrabalhados == 30)
		{
			SalárioMensal+= (SalárioMensal * 1/100);
		}
		else if (QuantdeDiasTrabalhados >= 25 && QuantdeDiasTrabalhados <= 27)
		{
			SalárioMensal-= (SalárioMensal * (30 - QuantdeDiasTrabalhados)*2/100);
		}
		else if (QuantdeDiasTrabalhados >= 20 && QuantdeDiasTrabalhados <= 24)
		{
			SalárioMensal-= (SalárioMensal * (30 - QuantdeDiasTrabalhados)*3/100);
		}
		else if (QuantdeDiasTrabalhados < 20)
		{
			SalárioMensal = SalárioMensal * 1/5;
		}
		
		return SalárioMensal;
	}
}
