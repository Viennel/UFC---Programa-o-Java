package Ocorrencia_Exportar;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import DadosDoBolão.Dados;
import Persistencia_BancodeDadosdoBolao.DadosdoBolaoDAO;

public class ExportarBolao 
{
	private DadosdoBolaoDAO DDAO;
	private FileWriter FW;
	private File Arq;
	
	public ExportarBolao()
	{
		try
		{
			Arq = new File("ArqEXP");
			FW = new FileWriter(Arq);
			FW.write(EscreverProArquivo());
			FW.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public String EscreverProArquivo()
	{
		String Texto = "";
		DDAO = new DadosdoBolaoDAO();
		
		ArrayList<Dados> BoloesExportados = DDAO.ListarBoloes();
		
		for (int i = 0; i < BoloesExportados.size(); i++) 
		{
			Texto += BoloesExportados.get(i).Nome + ";";
			
			for (int j = 0; j < 8; j++) 
			{
				Texto += BoloesExportados.get(i).SelNasQuartas.get(j).NomedaSel + ";";
				Texto += BoloesExportados.get(i).SelNasQuartas.get(j).PlacardaSel + ";";
			}
			
			for (int j = 0; j < 4; j++) 
			{
				Texto += BoloesExportados.get(i).SelNasSemiFinais.get(j).NomedaSel + ";";
				Texto += BoloesExportados.get(i).SelNasSemiFinais.get(j).PlacardaSel + ";";
			}
			
			for (int j = 0; j < 2; j++) 
			{
				Texto += BoloesExportados.get(i).SelNasFinais.get(j).NomedaSel + ";";
				Texto += BoloesExportados.get(i).SelNasFinais.get(j).PlacardaSel + ";";
			}
			
			Texto += BoloesExportados.get(i).SelCamp + "\n";	
		}

		return Texto;
	}
}
