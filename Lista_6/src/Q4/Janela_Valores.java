package Q4;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela_Valores extends JFrame
{
	public CalculandoNumeros Calculos;
	
	public Janela_Valores()
	{
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Calculos = new CalculandoNumeros();
		
		setLayout(new BorderLayout());
		
		add(new Painel_InserirNumeros(Calculos), BorderLayout.NORTH);
		add(new Painel_MostrarResultados(Calculos), BorderLayout.CENTER);
		
		setVisible(true);
	}
}
