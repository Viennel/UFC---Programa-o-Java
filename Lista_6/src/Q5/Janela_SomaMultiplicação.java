package Q5;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela_SomaMultiplicação extends JFrame
{
	public Painel_EscreverNumero PE;
	public Painel_SomaOuMultiplicação PSM;
	public Operações OP;
	
	public Janela_SomaMultiplicação()
	{
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		OP = new Operações();
		
		setLayout(new BorderLayout());
		
		PE = new Painel_EscreverNumero();
		add(PE, BorderLayout.NORTH);
		PSM = new Painel_SomaOuMultiplicação(OP, PE);
		add(PSM, BorderLayout.SOUTH);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
