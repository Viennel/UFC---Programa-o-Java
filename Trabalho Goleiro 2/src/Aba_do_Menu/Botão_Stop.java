package Aba_do_Menu;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Aba_do_Jogo.Painel_CelulasdoJogo;
import Aba_do_Jogo.PresençadeDefesa;
import Aba_do_Jogo.RegiõesdoGol;

public class Botão_Stop extends JButton implements ActionListener
{
	public Painel_CelulasdoJogo PC;
	public Botão_Play_Next BP;
	public Janela_ResultadoFinal J;
	
	public Botão_Stop(Painel_CelulasdoJogo PCUsado, Botão_Play_Next BPUsado)
	{
		setText("Stop");
		addActionListener(this);
		PC = PCUsado;
		BP = BPUsado;
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (BP.Play_Next == false)
		{
			BP.setText("Play");
			BP.Play_Next = true;
			PC.Permissão = false;
			PC.SetarCores(Color.GREEN.darker(), Color.WHITE, Color.GREEN);
			for (int i = 0; i < PC.BotõesdoJogo.size(); i++)
			{	
				for (int j = 0; j < PC.Comparação.GolouDefesa.size(); j++) 
				{
					if (PC.BotõesdoJogo.get(i).getIcon() != null)
					{
						PC.BotõesdoJogo.get(i).setIcon(null);
					}
					
					if (PC.BotõesdoJogo.get(i).Posição_I == PC.Comparação.OcorrenciadeChutes.get(j).Posição_I && PC.BotõesdoJogo.get(i).Posição_J == PC.Comparação.OcorrenciadeChutes.get(j).Posição_J)
					{	
						if (PC.Comparação.GolouDefesa.get(j) == true)
						{
							PC.BotõesdoJogo.get(i).setBackground(Color.BLUE);
						}
						else
						{
							PC.BotõesdoJogo.get(i).setBackground(Color.RED);
						}
					}
						
				}
			}
			J = new Janela_ResultadoFinal(PC.Comparação);
		}
	}
	
}
