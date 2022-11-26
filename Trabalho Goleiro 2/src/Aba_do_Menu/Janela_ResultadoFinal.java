package Aba_do_Menu;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import DadosdoJogo.ComparaçãodeDados;

public class Janela_ResultadoFinal extends JFrame
{	
	public String TextoFinal;
	
	public Janela_ResultadoFinal(ComparaçãodeDados C)
	{
		
		setSize(300, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		TextoFinal = "\tResultado Final: \n" +
				"\nPontuação do Jogador " + C.DJ.Nome + " -> " + C.DJ.Pontuação +
				"\nPontuação do Goleiro -> " + C.DG.PontuaçãoGeral + "\n" +
				"\n\tDefesas do Goleiro:\n" +
				"\nDefesas no Corpo: " + C.DG.DefesasnoCorpodoGoleiro +
				"\nDefesas na Mão Direita -> " + C.DG.DefesasnaMãoDireita +
				"\nDefesas na Mão Esquerda -> " + C.DG.DefesasnaMãoEsquerda +
				"\nDefesas na Área de Defesa -> " + C.DG.DefesasnaAreadeDefesa;
		
		add(new JTextArea(TextoFinal));
		
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
