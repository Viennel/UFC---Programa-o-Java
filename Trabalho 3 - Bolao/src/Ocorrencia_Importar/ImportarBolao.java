package Ocorrencia_Importar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import DadosDoBolão.Dados;
import DadosDoBolão.Selecoes;
import Persistencia_BancodeDadosdoBolao.DadosdoBolaoDAO;

public class ImportarBolao 
{
	private FileReader FR;
	private String LinhaLida;
	private BufferedReader BR;
	private Dados D;
	private DadosdoBolaoDAO DDAO;
	
	public ImportarBolao(File Arq)
	{
		try 
		{
			FR = new FileReader(Arq);
			BR = new BufferedReader(FR);
					
			while((LinhaLida = BR.readLine()) != null)
			{
				EnviarProBolao(LinhaLida);
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void EnviarProBolao(String STR)
	{
		String[] DadosEmString = STR.split(";");
		
		D = new Dados();
		int aux = 0;
		
		D.Nome = DadosEmString[aux];
	
		for (int i = 0; i < 8; i++) 
		{
			D.SelNasQuartas.add(new Selecoes());
			
			aux++;
			D.SelNasQuartas.get(i).NomedaSel = DadosEmString[aux];
			aux++;
			D.SelNasQuartas.get(i).PlacardaSel = Integer.parseInt(DadosEmString[aux]);
		}
		
		for (int i = 0; i < 4; i++) 
		{
			D.SelNasSemiFinais.add(new Selecoes());
			
			aux++;
			D.SelNasSemiFinais.get(i).NomedaSel = DadosEmString[aux];
			aux++;
			D.SelNasSemiFinais.get(i).PlacardaSel = Integer.parseInt(DadosEmString[aux]);
		}
		
		for (int i = 0; i < 2; i++) 
		{
			D.SelNasFinais.add(new Selecoes());
			
			aux++;
			D.SelNasFinais.get(i).NomedaSel = DadosEmString[aux];
			aux++;
			D.SelNasFinais.get(i).PlacardaSel = Integer.parseInt(DadosEmString[aux]);
		}
		
		D.SelCamp = DadosEmString[aux+1];
		
		DDAO = new DadosdoBolaoDAO();
		DDAO.AdicionarBolaoNoBancodeDados(D);
	}
}
