package Inicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Ocorrencia_Exportar.ExportarBolao;

public class Botão_ExportarBolões extends JButton implements ActionListener
{
	public ExportarBolao Ex;
	
	public Botão_ExportarBolões()
	{
		setText("Exportar Bolões");
		setBackground(Color.gray);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		Ex = new ExportarBolao();
	}
}
