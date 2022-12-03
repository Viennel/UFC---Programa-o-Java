package Q5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Painel_SomaOuMultiplicação extends JPanel implements ActionListener
{
	public JComboBox<String> SouM;
	public JButton EnviarComando;
	public Painel_EscreverNumero PEUtilizado;
	public Operações OperaçãoASerRealizada;
	
	public Painel_SomaOuMultiplicação(Operações O, Painel_EscreverNumero PE)
	{
		OperaçãoASerRealizada = O;
		PEUtilizado = PE;
		
		setLayout(new FlowLayout());
		
		SouM = new JComboBox<String>();
		SouM.addItem("Soma");
		SouM.addItem("Multiplicação");
		add(SouM);
		
		EnviarComando = new JButton("Enviar");
		EnviarComando.addActionListener(this);
		add(EnviarComando);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		OperaçãoASerRealizada.DefinirNumeros(Integer.parseInt(PEUtilizado.BarradeEscrita.getText()));
		
		if(SouM.getSelectedItem().equals("Soma"))
		{
			JOptionPane.showMessageDialog(null, OperaçãoASerRealizada.PrimeiroNumero + " + " + OperaçãoASerRealizada.SegundoNumero + " = " + OperaçãoASerRealizada.SOMA());
		}
		else if (SouM.getSelectedItem().equals("Multiplicação"))
		{
			JOptionPane.showMessageDialog(null, OperaçãoASerRealizada.PrimeiroNumero + " * " + OperaçãoASerRealizada.SegundoNumero + " = " + OperaçãoASerRealizada.MULTIPLICAÇÃO());
		}
	}
}
