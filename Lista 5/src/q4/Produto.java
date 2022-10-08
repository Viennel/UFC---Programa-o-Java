package q4;

public class Produto 
{
	private String NomedoProduto;
	private float PreçodeCusto;
	private float PreçodeVenda;
	private float MargemdeLucro;
	private float DespesasdaEmpresa;
	
	public Produto(String NovoNome)
	{
		NomedoProduto = NovoNome;
	}
	public String getNomedoProduto()
	{
		return NomedoProduto;
	}
	
	public float CalculodaMargemdeLucros()
	{
		MargemdeLucro = ((PreçodeVenda - (PreçodeCusto + DespesasdaEmpresa))/PreçodeVenda)*100;
		return MargemdeLucro; 
	}
	
	public void setCusto(float C)
	{
		PreçodeCusto = C;
	}
	
	public void setVenda(float V)
	{
		PreçodeVenda = V;
	}
	
	public void setDespesas(float D)
	{
		DespesasdaEmpresa = D;
	}
}
