package Ocorrencia_Cadastrar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DadosDoBolão.Dados;

public class Janela_InserirNome extends JFrame implements ActionListener
{
	private JTextField BarradeNome;
	private JLabel Comando;
	private JButton Enviar;
	public Janela_Quartas JQ;

	public Dados InfoDoBolao;
	
	public Janela_InserirNome(Dados D)
	{
		InfoDoBolao = D;
		
		setSize(500, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setLayout(new FlowLayout());
		Comando = new JLabel("Insira seu Nome para continuar");
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
		if (BarradeNome.getText().equals(""))
		{
			Comando.setText("Você deve inserir um Nome para prosseguir!");
		}
		else
		{
			InfoDoBolao.Nome = BarradeNome.getText();
			JQ = new Janela_Quartas(InfoDoBolao);
			this.dispose();
		}
	}
}
