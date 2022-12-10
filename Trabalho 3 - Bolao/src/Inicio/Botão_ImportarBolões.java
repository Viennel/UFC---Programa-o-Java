package Inicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import Ocorrencia_Importar.ImportarBolao;
import Ocorrencia_MostrarBoloes.Janela_TabeladeBoloes;

public class Botão_ImportarBolões extends JButton implements ActionListener
{
	public JFileChooser JFC;
	public int SELECIONADO;
	public ImportarBolao IB;
	
	public Botão_ImportarBolões()
	{
		setText("Importar Bolões");
		setBackground(Color.gray);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		JFC = new JFileChooser();
		SELECIONADO = JFC.showOpenDialog(null);
		
		if (SELECIONADO == JFileChooser.APPROVE_OPTION)
		{
			IB = new ImportarBolao(JFC.getSelectedFile());
		}
	}
}
