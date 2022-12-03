package Q4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel_InserirNumeros extends JPanel implements ActionListener
{
	public JTextField BarradeEscrita;
	public JButton Enviar;
	public CalculandoNumeros GuardarNoArrayList;
	
	public Painel_InserirNumeros(CalculandoNumeros C)
	{
		GuardarNoArrayList = C;
		
		setLayout(new FlowLayout());
		
		BarradeEscrita = new JTextField(30);
		BarradeEscrita.setSize(getPreferredSize());
		add(BarradeEscrita);
		
		Enviar = new JButton("Enviar");
		Enviar.addActionListener(this);
		add(Enviar);
	}

	public void actionPerformed(ActionEvent e) 
	{
		GuardarNoArrayList.Numeros.add(Integer.parseInt(BarradeEscrita.getText()));
		System.out.println(BarradeEscrita.getText());
		BarradeEscrita.setText("");
	}
}
