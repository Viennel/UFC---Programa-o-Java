package Q5;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel_EscreverNumero extends JPanel
{
	public JTextField BarradeEscrita;
	public JLabel Mensagem;
	
	public Painel_EscreverNumero()
	{	
		setLayout(new FlowLayout());
		
		Mensagem = new JLabel("Valores:");
		add(Mensagem);
		
		BarradeEscrita = new JTextField(30);
		BarradeEscrita.setSize(getPreferredSize());
		add(BarradeEscrita);	
	}
}
