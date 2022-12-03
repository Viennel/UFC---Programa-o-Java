package Q4;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Painel_Mostrar extends JPanel
{
	public JLabel MSG;
	public JTextArea Numero;
	
	public Painel_Mostrar(String Str)
	{
		setLayout(new FlowLayout());
		
		MSG = new JLabel(Str + " >>> ");
		add(MSG);
		
		Numero = new JTextArea("");
		add(Numero);
	}
}
