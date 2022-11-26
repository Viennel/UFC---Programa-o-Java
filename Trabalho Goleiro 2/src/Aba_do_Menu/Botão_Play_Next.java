package Aba_do_Menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Aba_do_Jogo.Painel_CelulasdoJogo;
import Aba_do_Jogo.PresençadeDefesa;
import DadosdoJogo.ComparaçãodeDados;
import DadosdoJogo.DadosdoGoleiro;
import DadosdoJogo.DadosdoJogador;

public class Botão_Play_Next extends JButton implements ActionListener
{
	public Painel_CelulasdoJogo PC;
	public Painel_Menu PM;
	public boolean Play_Next;
	public Janela_EscreverNome JE;
	

	public Botão_Play_Next(Painel_CelulasdoJogo PCUsado, Painel_Menu PMUsado)
	{	
		setText("Play");
		addActionListener(this);
		PC = PCUsado;
		PM = PMUsado;
		Play_Next = true;
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		
		PC.SetarCores(Color.GREEN.darker(), Color.WHITE, Color.GREEN);
	
		if (Play_Next == true)
		{
			PC.Comparação = new ComparaçãodeDados();
			JE = new Janela_EscreverNome(PC.Comparação.DJ, this);
		}
		else
		{
			for (int i = 0; i < PC.BotõesdoJogo.size(); i++)
			{
				PC.BotõesdoJogo.get(i).Defesa = PresençadeDefesa.SEMDEFESA;
				if (PC.BotõesdoJogo.get(i).getIcon() != null)
				{
					PC.BotõesdoJogo.get(i).setIcon(null);
				}
			}
			PC.Permissão = true;
		}
	}
}
