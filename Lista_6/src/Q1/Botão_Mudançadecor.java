package Q1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Botão_Mudançadecor extends JButton implements ActionListener
{
	public JPanel PainelUsado;
	public Color CorUsada;
	
	public Botão_Mudançadecor(String Str, Color Cor, JPanel J)
	{
		PainelUsado = J;
		CorUsada = Cor;
		
		setText(Str);
		addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		PainelUsado.setBackground(CorUsada);
	}
}
