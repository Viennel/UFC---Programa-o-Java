package Q1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela_MudançadeCor extends JFrame
{
	public JPanel Painel;
	
	public Janela_MudançadeCor()
	{
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Painel = new JPanel();
		Painel.add(new Botão_Mudançadecor("Azul", Color.BLUE, Painel));
		Painel.add(new Botão_Mudançadecor("Amarelo", Color.YELLOW, Painel));
		Painel.add(new Botão_Mudançadecor("Verde", Color.GREEN, Painel));
		
		add(Painel);
		
		setVisible(true);
	}
}
