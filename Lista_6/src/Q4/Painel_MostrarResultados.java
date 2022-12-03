package Q4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Painel_MostrarResultados extends JPanel implements ActionListener
{
	public CalculandoNumeros Resultados;
	public Painel_Mostrar Maior;
	public Painel_Mostrar Menor;
	public Painel_Mostrar Media;
	public JButton MostrarResultados;
	
	public Painel_MostrarResultados(CalculandoNumeros C)
	{
		Resultados = C;
		
		MostrarResultados = new JButton("Mostrar");
		MostrarResultados.addActionListener(this);
		
		Maior = new Painel_Mostrar("Maior");
		Menor = new Painel_Mostrar("Menor");
		Media = new Painel_Mostrar("Media");
		
		setLayout(new GridLayout(4, 1, 0, 50));	
		
		add(MostrarResultados);
		add(Maior);
		add(Menor);
		add(Media);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		Maior.Numero.setText("" + Resultados.CalcularMaior());
		Menor.Numero.setText("" + Resultados.CalcularMenor());
		Media.Numero.setText("" + Resultados.CalcularMédia());
	}
}
