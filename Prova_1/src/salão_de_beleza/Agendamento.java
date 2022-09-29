package salão_de_beleza;

import java.util.Calendar;

public class Agendamento 
{
	private int Id;
	private Calendar Data;
	private Cliente Pessoa;
	private int Hora;
	private int Minuto;
	
	public Agendamento(Cliente PessoaAnalisada, Cabeleireiro CabeleireiroAnalisado)
	{
		setCliente(PessoaAnalisada);
	}
	
	public Cliente setCliente(Cliente PessoaRecebida)
	{
		Pessoa = PessoaRecebida;
		return Pessoa;
	}
	public Cliente getCliente()
	{
		return Pessoa;
	}
	
	public int setId(int IdRecebido)
	{
		Id = IdRecebido;
		return Id;
	}
	public int getId() 
	{
		return Id;
	}
	
	public Calendar setData(Calendar DataRecebida)
	{
		Data = DataRecebida;
		return Data;
	}
	public Calendar getData() 
	{
		return Data;
	}
	
	public int setHora(Calendar C, int Tipo)
	{
		Hora = C.get(Tipo);
		return Hora;
	}
	public int getHora()
	{
		return Hora;
	}
	
	public int setMinuto(Calendar C, int Tipo)
	{
		Minuto = C.get(Tipo);
		return Minuto;
	}
	public int getMinuto()
	{
		return Minuto;
	}
}
