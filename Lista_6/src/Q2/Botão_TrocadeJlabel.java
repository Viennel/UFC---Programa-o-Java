package Q2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Botão_TrocadeJlabel extends JButton implements ActionListener
{
	public JLabel LabelUsado;
	
	public Botão_TrocadeJlabel(String Str, JLabel L)
	{
		LabelUsado = L;
		setText(Str);
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		LabelUsado.setText(this.getText());
	}
}
