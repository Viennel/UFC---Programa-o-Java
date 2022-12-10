package Ocorrencia_MostrarBoloes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import DadosDoBolão.Dados;
import Persistencia_BancodeDadosdoBolao.DadosdoBolaoDAO;

public class Janela_TabeladeBoloes extends JFrame
{
	private DadosdoBolaoDAO DDAO;
	private JTable Tabela;
	private JPanel Informações;
	private JPanel TabelasDosBoloes;
	
	public Janela_TabeladeBoloes()
	{
		DDAO = new DadosdoBolaoDAO();
		Informações = new JPanel();
		TabelasDosBoloes = new JPanel();
		
		setSize(700, DDAO.ListarBoloes().size()*130);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		String[] Colunas = {"ID", "Participante", "Quartas de Final", "Semi Finais", "Final", "Campeão"};
		Object[][] Texto = {{"ID", "Participante", "Quartas de Final", "Semi Finais", "Final", "Campeão"}};
		
		Informações.setLayout(new GridLayout());
		Informações.add(new JTable(Texto, Colunas));
		
		TabelasDosBoloes.setLayout(new GridLayout(DDAO.ListarBoloes().size(), 0));
				
		for (Dados D : DDAO.ListarBoloes()) 
		{
			String AuxQuartas = "<html>";
			for (int iQ = 0 ; iQ < D.SelNasQuartas.size() ; iQ+=2)
			{
				AuxQuartas += D.SelNasQuartas.get(iQ).NomedaSel + " - " + D.SelNasQuartas.get(iQ).PlacardaSel + " X " + D.SelNasQuartas.get(iQ+1).NomedaSel + " - " + D.SelNasQuartas.get(iQ+1).PlacardaSel + "<br>";
			}
			AuxQuartas += "</html>";
			
			String AuxSemifinais = "<html>";
			for (int iS = 0 ; iS < D.SelNasSemiFinais.size() ; iS+=2)
			{
				AuxSemifinais += D.SelNasSemiFinais.get(iS).NomedaSel + " - " + D.SelNasSemiFinais.get(iS).PlacardaSel + " X " + D.SelNasSemiFinais.get(iS+1).NomedaSel + " - " + D.SelNasSemiFinais.get(iS+1).PlacardaSel + "<br>";
			}
			AuxSemifinais += "</html>";
			
			String AuxFinais = "<html>";
			for (int iF = 0 ; iF < D.SelNasFinais.size() ; iF+=2)
			{
				AuxFinais += D.SelNasFinais.get(iF).NomedaSel + " - " + D.SelNasFinais.get(iF).PlacardaSel + " X " + D.SelNasFinais.get(iF+1).NomedaSel + " - " + D.SelNasFinais.get(iF+1).PlacardaSel + "<br>";
			}
			AuxFinais += "</html>";
			
			Object[][] DadosdasTabelas = {{D.id, D.Nome, AuxQuartas, AuxSemifinais, AuxFinais, D.SelCamp}};
			
			Tabela = new JTable(DadosdasTabelas, Colunas);
			Tabela.setRowHeight(100);
			TabelasDosBoloes.add(Tabela);
		}
		
		add(Informações, BorderLayout.NORTH);
		add(TabelasDosBoloes, BorderLayout.CENTER);
	
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
