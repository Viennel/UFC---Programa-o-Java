package Ocorrencia_Cadastrar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DadosDoBolão.Dados;
import DadosDoBolão.Selecoes;
import InserirDadosdeCadaJogo.Painel_AddInfo;

public class Janela_Finais extends JFrame implements ActionListener
{
	private Painel_AddInfo PainelDasFinais;
	private JButton EnviarInfo;	
	public Janela_Campeão JC;
	private boolean Prosseguir;
	
	public Dados InfoDoBolao;
	
	public Janela_Finais(Dados D)
	{
		InfoDoBolao = D;
		
		setSize(850, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Final");
		
		setLayout(new BorderLayout());
		
		PainelDasFinais = new Painel_AddInfo(2, 1, 2);
		add(PainelDasFinais, BorderLayout.CENTER);
		
		int auxContagem = 0;
		for (int i = 0; i < PainelDasFinais.InfoDasSels.size(); i++) 
		{
			if(InfoDoBolao.SelNasSemiFinais.get(auxContagem).PlacardaSel > InfoDoBolao.SelNasSemiFinais.get(auxContagem+1).PlacardaSel)
			{
				PainelDasFinais.InfoDasSels.get(i).Sel.setText(InfoDoBolao.SelNasSemiFinais.get(auxContagem).NomedaSel);
			}
			else
			{
				PainelDasFinais.InfoDasSels.get(i).Sel.setText(InfoDoBolao.SelNasSemiFinais.get(auxContagem+1).NomedaSel);
			}
			auxContagem+=2;
		}
		
		EnviarInfo = new JButton("Enviar");
		EnviarInfo.addActionListener(this);
		add(EnviarInfo, BorderLayout.SOUTH);
					
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent e) 
	{
		Prosseguir = true;
		
		for (int i = 0; i < PainelDasFinais.InfoDasSels.size(); i++) 
		{
			if (PainelDasFinais.InfoDasSels.get(i).Sel.getText().equals("") || PainelDasFinais.InfoDasSels.get(i).Pontos.getText().equals(""))
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
			for (int i = 0; i < PainelDasFinais.InfoDasSels.size(); i++) 
			{
				Selecoes S = new Selecoes();
				S.NomedaSel = PainelDasFinais.InfoDasSels.get(i).Sel.getText();
				S.PlacardaSel = Integer.parseInt(PainelDasFinais.InfoDasSels.get(i).Pontos.getText());
				InfoDoBolao.SelNasFinais.add(S);
			}
			JC = new Janela_Campeão(InfoDoBolao);
			this.dispose();
		}
	}
}