package Q2;

import javax.swing.JFrame;

public class Janela_Principal extends JFrame
{
	public Janela_Principal()
	{
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Painel_Troca());
		
		setVisible(true);
	}
}
