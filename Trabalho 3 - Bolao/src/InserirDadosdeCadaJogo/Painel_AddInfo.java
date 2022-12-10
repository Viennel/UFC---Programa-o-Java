package InserirDadosdeCadaJogo;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Painel_AddInfo extends JPanel
{
	public ArrayList<Painel_SelX> InfoDasSels;
	
	public Painel_AddInfo(int Quant, int I, int J)
	{
		InfoDasSels = new  ArrayList<Painel_SelX>();
		
		setLayout(new GridLayout(I, J));
		
		for (int i = 0; i < Quant; i++) 
		{
			Painel_SelX S = new Painel_SelX();
			InfoDasSels.add(S);
			add(InfoDasSels.get(i));
			if (i%2 == 0)
			{
				JButton B = new JButton("X");
				B.setBackground(new Color(240, 240, 240));
				B.setBorder(null);
				add(B);
			}
		}
	}
}
