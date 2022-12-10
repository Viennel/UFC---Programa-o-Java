package Persistencia_BancodeDadosdoBolao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import DadosDoBolão.Dados;
import DadosDoBolão.Selecoes;

public class DadosdoBolaoDAO 
{
	public void AdicionarBolaoNoBancodeDados(Dados InfodoBolao)
	{
		try
		{
			Connection conexao = new ConexaoDAO().Conectar();

			PreparedStatement inserir = 
					conexao.prepareStatement("insert into dadosdobolao "
							+ "(Nome,"
							+ " QNomeSel1, QPontosSel1, QNomeSel2, QPontosSel2, QNomeSel3, QPontosSel3, QNomeSel4, QPontosSel4, QNomeSel5, QPontosSel5, QNomeSel6, QPontosSel6, QNomeSel7, QPontosSel7, QNomeSel8, QPontosSel8,"
							+ " SNomeSel1, SPontosSel1, SNomeSel2, SPontosSel2, SNomeSel3, SPontosSel3, SNomeSel4, SPontosSel4,"
							+ " FNomeSel1, FPontosSel1, FNomeSel2, FPontosSel2,"
							+ " SelCamp)"
							+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			int aux = 1;
			
			inserir.setString(aux, InfodoBolao.Nome);
			
			for (int i = 0; i < 8; i++) 
			{
				aux++;
				inserir.setString(aux, InfodoBolao.SelNasQuartas.get(i).NomedaSel);	
				aux++;
				inserir.setInt(aux, InfodoBolao.SelNasQuartas.get(i).PlacardaSel);
			}
			
			for (int i = 0; i < 4; i++) 
			{
				aux++;
				inserir.setString(aux, InfodoBolao.SelNasSemiFinais.get(i).NomedaSel);	
				aux++;
				inserir.setInt(aux, InfodoBolao.SelNasSemiFinais.get(i).PlacardaSel);
			}
			
			for (int i = 0; i < 2; i++) 
			{
				aux++;
				inserir.setString(aux, InfodoBolao.SelNasFinais.get(i).NomedaSel);	
				aux++;
				inserir.setInt(aux, InfodoBolao.SelNasFinais.get(i).PlacardaSel);
			}
			
			inserir.setString((aux+1), InfodoBolao.SelCamp);
			
			inserir.executeUpdate();
			
			conexao.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Dados> ListarBoloes()
	{
		ArrayList<Dados> Lista = new ArrayList<Dados>();
		
		try
		{
			Connection conexao = new ConexaoDAO().Conectar();

			ResultSet resultado = conexao.prepareStatement("select * from dadosdobolao").executeQuery();
			
			Dados ADD;
			
			while (resultado.next())
			{
				ADD = new Dados();
				
				ADD.id = resultado.getInt("id");
				ADD.Nome =  resultado.getString("Nome");
				
				for (int i = 0; i < 8; i++)
				{
					ADD.SelNasQuartas.add(new Selecoes());
					
					ADD.SelNasQuartas.get(i).NomedaSel =  resultado.getString("QNomeSel" + (i+1));
					ADD.SelNasQuartas.get(i).PlacardaSel =  resultado.getInt("QPontosSel" + (i+1));
				}
				
				for (int i = 0; i < 4; i++)
				{
					ADD.SelNasSemiFinais.add(new Selecoes());
					
					ADD.SelNasSemiFinais.get(i).NomedaSel =  resultado.getString("SNomeSel" + (i+1));
					ADD.SelNasSemiFinais.get(i).PlacardaSel =  resultado.getInt("SPontosSel" + (i+1));
				}
				
				for (int i = 0; i < 2; i++)
				{
					ADD.SelNasFinais.add(new Selecoes());
					
					ADD.SelNasFinais.get(i).NomedaSel =  resultado.getString("FNomeSel" + (i+1));
					ADD.SelNasFinais.get(i).PlacardaSel =  resultado.getInt("FPontosSel" + (i+1));
				}
				
				ADD.SelCamp = resultado.getString("SelCamp");
				
				Lista.add(ADD);
			}
			
			conexao.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return Lista;
	}
}
