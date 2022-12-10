package Inicio;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Frame_JanelaInicial extends JFrame
{
	private Painel_Inicio SelecionarOpção;
	
	public  Frame_JanelaInicial()
	{
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Trabalho 3 - Bolão");
		
		SelecionarOpção = new Painel_Inicio();
		add(SelecionarOpção);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
