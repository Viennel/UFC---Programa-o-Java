package Aba_do_Menu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DadosdoJogo.DadosdoJogador;

public class Janela_EscreverNome extends JFrame implements ActionListener
{
	public JTextField BarradeNome;
	public JLabel Comando;
	public DadosdoJogador Player;
	public JButton Enviar;
	public Botão_Play_Next Play;
	
	public Janela_EscreverNome(DadosdoJogador Jogador, Botão_Play_Next PlayUsado)
	{
		Player = Jogador;
		Play = PlayUsado;
		
		setSize(500, 100);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		setLayout(new FlowLayout());
		Comando = new JLabel("Insira o Nome do Jogador para Continuar: ");
		add(Comando);
		
		BarradeNome = new JTextField(30);
		BarradeNome.setSize(getPreferredSize());
		add(BarradeNome);
		
		Enviar = new JButton("Enviar");
		Enviar.addActionListener(this);
		add(Enviar);
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		setAlwaysOnTop(true);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		Player.Nome = this.BarradeNome.getText();
		if (Player.Nome.equals(""))
		{
			this.Comando.setText("O jogo não poderá prosseguir enquanto o Jogador não tiver Nome!");
		}
		else
		{
			Play.PC.Permissão = true;
			Play.setText("Proximo Chute");
			Play.Play_Next = false;
			this.dispose();
		}
	}
}
