package Gol;

import javax.swing.JFrame;

import Aba_do_Jogo.Painel_CelulasdoJogo;
import Aba_do_Menu.Painel_Menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Janela_Gol extends JFrame 
{
	public Painel_Menu PM;
	public Painel_CelulasdoJogo PC;
	
	public Janela_Gol(int Linhas, int Colunas)
	{
		
		TamanhodaTela();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		PC = new Painel_CelulasdoJogo(Linhas, Colunas);
		add(PC, BorderLayout.CENTER);
		PM = new Painel_Menu(PC);
		add(PM, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	public void TamanhodaTela()
	{
		Dimension S = Toolkit.getDefaultToolkit().getScreenSize();
		double W = S.getWidth();
		double H = S.getHeight();
		
		setSize((int) W, (int) H);
	}
}
