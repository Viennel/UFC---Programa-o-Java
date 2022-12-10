package Inicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Ocorrencia_MostrarBoloes.Janela_TabeladeBoloes;


public class Botão_MostrarBolõesCadastrados extends JButton implements ActionListener
{
	public Janela_TabeladeBoloes TB;
	
	public Botão_MostrarBolõesCadastrados()
	{
		setText("Mostrar Bolões Cadastrados");
		setBackground(Color.gray);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		TB = new Janela_TabeladeBoloes();
	}
}
