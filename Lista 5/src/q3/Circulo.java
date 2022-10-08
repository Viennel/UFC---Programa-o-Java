package q3;

public class Circulo 
{
	private double Raio;
	private double pi = 3.14;
	
	public double Area()
	{
		double Area = pi*Math.pow(Raio, 2);
		return Area;
	}
	public double Circunferência()
	{
		double Circunferencia = 2*pi*Raio;
		return Circunferencia;
	}
	public double AumentarCírculo(double Porcentagem)
	{
		Raio = Raio*(100 + Porcentagem)/100;
		return Raio;
	}
	
	public void setRaio(double rRecebido)
	{
		Raio = rRecebido;
	}
}
