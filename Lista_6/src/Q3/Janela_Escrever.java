package Q3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Janela_Escrever extends JFrame implements ActionListener
{
	public JTextField BarradeEscrita;
	public JLabel Comando;
	public JButton Enviar;
	
	public Janela_Escrever()
	{
		setSize(500, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Janela com JOptionPane");
		
		setLayout(new FlowLayout());
		
		BarradeEscrita = new JTextField(30);
		BarradeEscrita.setSize(getPreferredSize());
		add(BarradeEscrita);
		
		Enviar = new JButton("Enviar");
		Enviar.addActionListener(this);
		add(Enviar);
			
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, BarradeEscrita.getText());
	}
}
