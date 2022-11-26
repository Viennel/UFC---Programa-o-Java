package Aba_do_Jogo;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botão_CeluladoJogo extends JButton implements ActionListener
{
	public RegiõesdoGol Região;
	public PresençadeDefesa Defesa;
	public Painel_CelulasdoJogo PC;
	public int Posição_I;
	public int Posição_J;
	
	public Botão_CeluladoJogo(RegiõesdoGol R, int I, int J, Painel_CelulasdoJogo PCUsado)
	{
		Região = R;
		Defesa = PresençadeDefesa.SEMDEFESA;
		PC = PCUsado;
		Posição_I = I;
		Posição_J = J;
		
		setBackground(Color.GRAY);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (PC.Permissão == true)
		{
			setIcon(new ImageIcon(new ImageIcon("imagens/bola.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
			PC.FormarDefesadoGoleiro();
			
			PC.Comparação.CompararDados((Botão_CeluladoJogo) e.getSource());
			
			PC.Permissão = false;
		}
	}	
}
