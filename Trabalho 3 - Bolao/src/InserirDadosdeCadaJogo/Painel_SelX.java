package InserirDadosdeCadaJogo;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel_SelX extends JPanel
{
	public JLabel InserirSel;
	public JTextField Sel;
	public JLabel InserirPontos;
	public JTextField Pontos;
	
	public Painel_SelX()
	{
		setLayout(new FlowLayout());
		
		InserirSel = new JLabel(" Seleção: ");
		Sel = new JTextField(10);
		
		InserirPontos = new JLabel("Placar");
		Pontos = new JTextField(3);
		
		add(InserirSel);
		add(Sel);
		add(InserirPontos);
		add(Pontos);
	}
}
