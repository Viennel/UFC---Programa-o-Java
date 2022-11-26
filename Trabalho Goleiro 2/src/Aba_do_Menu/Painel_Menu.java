package Aba_do_Menu;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import Aba_do_Jogo.Painel_CelulasdoJogo;

public class Painel_Menu extends JPanel
{
	public Painel_CelulasdoJogo PC;
	
	public Painel_Menu(Painel_CelulasdoJogo PCUsado)
	{
		PC = PCUsado;
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		Botão_Play_Next BP = new Botão_Play_Next(PC, this);
		add(BP);
		Botão_Stop BS = new Botão_Stop(PC, BP);
		add(BS);
	}
}
