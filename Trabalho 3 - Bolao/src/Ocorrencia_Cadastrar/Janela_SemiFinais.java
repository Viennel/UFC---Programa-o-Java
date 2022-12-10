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

public class Janela_SemiFinais extends JFrame implements ActionListener
{
	private Painel_AddInfo PainelDasSemiFinais;
	private JButton EnviarInfo;	
	public Janela_Finais JF;
	private boolean Prosseguir;
	
	public Dados InfoDoBolao;
	
	public Janela_SemiFinais(Dados D)
	{
		InfoDoBolao = D;
		
		setSize(850, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("SemiFinais");
		
		setLayout(new BorderLayout());
		
		PainelDasSemiFinais = new Painel_AddInfo(4, 2, 2);
		add(PainelDasSemiFinais, BorderLayout.CENTER);
		
		int auxContagem = 0;
		for (int i = 0; i < PainelDasSemiFinais.InfoDasSels.size(); i++) 
		{
			if(InfoDoBolao.SelNasQuartas.get(auxContagem).PlacardaSel > InfoDoBolao.SelNasQuartas.get(auxContagem+1).PlacardaSel)
			{
				PainelDasSemiFinais.InfoDasSels.get(i).Sel.setText(InfoDoBolao.SelNasQuartas.get(auxContagem).NomedaSel);
			}
			else
			{
				PainelDasSemiFinais.InfoDasSels.get(i).Sel.setText(InfoDoBolao.SelNasQuartas.get(auxContagem+1).NomedaSel);
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
		
		for (int i = 0; i < PainelDasSemiFinais.InfoDasSels.size(); i++) 
		{
			if (PainelDasSemiFinais.InfoDasSels.get(i).Sel.getText().equals("") || PainelDasSemiFinais.InfoDasSels.get(i).Pontos.getText().equals(""))
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
			for (int i = 0; i < PainelDasSemiFinais.InfoDasSels.size(); i++) 
			{
				Selecoes S = new Selecoes();
				S.NomedaSel = PainelDasSemiFinais.InfoDasSels.get(i).Sel.getText();
				S.PlacardaSel = Integer.parseInt(PainelDasSemiFinais.InfoDasSels.get(i).Pontos.getText());
				InfoDoBolao.SelNasSemiFinais.add(S);
			}
			JF = new Janela_Finais(InfoDoBolao);
			this.dispose();
		}
	}
}
