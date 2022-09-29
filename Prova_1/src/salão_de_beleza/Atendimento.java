package salão_de_beleza;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento 
{
	private Cliente Pessoa;
	private Calendar Data;
	private ArrayList<String> ListadeServiços = new ArrayList<String>();
	private String Cabeleireiro;
	
	public Atendimento(Cliente PessoaAnalisada)
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
	
	public Calendar setData(Calendar DataRecebida)
	{
		Data = DataRecebida;
		return Data;
	}
	public Calendar getData() 
	{
		return Data;
	}
	
	public String setCabeleireiro(String CabeleireiroRecebida)
	{
		Cabeleireiro = CabeleireiroRecebida;
		return Cabeleireiro;
	}
	public String getCabeleireiro() 
	{
		return Cabeleireiro;
	}
	
	public ArrayList<String> setListadeServiços(String Serviço)
	{
		ListadeServiços.add(Serviço);
		return ListadeServiços;
	}
	public ArrayList<String> getListadeServiços() 
	{
		return ListadeServiços;
	}
}
