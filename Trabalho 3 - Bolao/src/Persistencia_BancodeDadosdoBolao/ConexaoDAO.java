package Persistencia_BancodeDadosdoBolao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDAO 
{
	private String host;
	private String usuario;
	private String senha;
	private String banco;
	
	public ConexaoDAO()
	{
		this.host = "127.0.0.1";
		this.banco = "bolaoufc";
		this.usuario = "root";
		this.senha = "";
	}
	
	public Connection Conectar()
	{
		String url= "jdbc:mysql://" + this.host + "/" + this.banco + "?verifyServerCertificate=false&useSSL=true";
		
		try
		{
			return DriverManager.getConnection(url, usuario, senha);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}