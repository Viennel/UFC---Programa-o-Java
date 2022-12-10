package Ocorrencia_Cadastrar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import DadosDoBolão.Dados;
import DadosDoBolão.Selecoes;
import InserirDadosdeCadaJogo.Painel_AddInfo;
import InserirDadosdeCadaJogo.Painel_SelX;

public class Janela_Quartas extends JFrame implements ActionListener
{
	private Painel_AddInfo PainelDasQuartas;
	private JButton EnviarInfo;	
	private boolean Prosseguir;
	public Janela_SemiFinais JSF;
	
	public Dados InfoDoBolao;
	
	public Janela_Quartas(Dados D)
	{
		InfoDoBolao = D;
		
		setSize(850, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Quartas de Final");
		
		setLayout(new BorderLayout());
		
		PainelDasQuartas = new Painel_AddInfo(8, 4, 2);
		add(PainelDasQuartas, BorderLayout.CENTER);
				
		EnviarInfo = new JButton("Enviar");
		EnviarInfo.addActionListener(this);
		add(EnviarInfo, BorderLayout.SOUTH);
					
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) 
	{
		Prosseguir = true;
		
		for (int i = 0; i < PainelDasQuartas.InfoDasSels.size(); i++) 
		{
			if (PainelDasQuartas.InfoDasSels.get(i).Sel.getText().equals("") || PainelDasQuartas.InfoDasSels.get(i).Pontos.getText().equals(""))
			{
				Prosseguir = false;
			}
		}
		
		if (Prosseguir == false)
		{
			JOptionPane.showMessageDialog(null, "Algum campo está vazio!");
		}
		else
		{
			for (int i = 0; i < PainelDasQuartas.InfoDasSels.size(); i++) 
			{
				Selecoes S = new Selecoes();
				S.NomedaSel = PainelDasQuartas.InfoDasSels.get(i).Sel.getText();
				S.PlacardaSel = Integer.parseInt(PainelDasQuartas.InfoDasSels.get(i).Pontos.getText());
				InfoDoBolao.SelNasQuartas.add(S);
			}
			JSF = new Janela_SemiFinais(InfoDoBolao);
			this.dispose();
		}
	}
}
