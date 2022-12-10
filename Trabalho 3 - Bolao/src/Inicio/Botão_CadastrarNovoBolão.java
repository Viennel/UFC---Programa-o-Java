package Inicio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import DadosDoBolão.Dados;
import Ocorrencia_Cadastrar.Janela_InserirNome;

public class Botão_CadastrarNovoBolão extends JButton implements ActionListener
{
	public Janela_InserirNome IN;
	public Dados InfoDoBolao;
	
	public Botão_CadastrarNovoBolão()
	{
		setText("Cadastrar Novo Bolão");		
		setBackground(Color.gray);
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{	
		InfoDoBolao = new Dados();
		IN = new Janela_InserirNome(InfoDoBolao);
	}
}
