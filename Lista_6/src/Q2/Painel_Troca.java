package Q2;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel_Troca extends JPanel
{
	public JLabel Label;
	
	public Painel_Troca()
	{
		Label = new JLabel("Default");
		
		add(Label);
		add(new Botão_TrocadeJlabel("Java", Label));
		add(new Botão_TrocadeJlabel("JavaScript", Label));
		add(new Botão_TrocadeJlabel("Python", Label));
		add(new Botão_TrocadeJlabel("C++", Label));
		add(new Botão_TrocadeJlabel("C#", Label));
		add(new Botão_TrocadeJlabel("C", Label));		
	}	
}
