package Q4;

import java.util.ArrayList;

public class CalculandoNumeros 
{
	public ArrayList<Integer> Numeros;
	
	public CalculandoNumeros()
	{
		Numeros = new ArrayList<Integer>();
	}
	
	public int CalcularMaior()
	{	
		int Maior = Numeros.get(0);
		for (int i = 0; i < Numeros.size(); i++) 
		{
			if (Maior < Numeros.get(i))
			{
				Maior = Numeros.get(i);
			}
		}
		return Maior;
	}
	
	public int CalcularMenor()
	{
		int Menor = Numeros.get(0);
		for (int i = 0; i < Numeros.size(); i++) 
		{
			if (Menor > Numeros.get(i))
			{
				Menor = Numeros.get(i);
			}
		}
		return Menor;
	}
	
	public float CalcularMédia()
	{
		float Media = 0;
		for (int i = 0; i < Numeros.size(); i++) 
		{
			Media += Numeros.get(i);
		}
		Media = Media/Numeros.size();
		
		return Media;
	}
}
