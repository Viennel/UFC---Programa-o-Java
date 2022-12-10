package Inicio;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Painel_Inicio extends JPanel
{
	private Botão_CadastrarNovoBolão Cadastrar;
	private Botão_MostrarBolõesCadastrados MostrarBolões;
	private Botão_ImportarBolões Importar;
	private Botão_ExportarBolões Exportar;
	
	public Painel_Inicio()
	{
		setBackground(Color.DARK_GRAY);
		
		Cadastrar = new Botão_CadastrarNovoBolão();
		MostrarBolões = new Botão_MostrarBolõesCadastrados();
		Importar = new Botão_ImportarBolões();
		Exportar = new Botão_ExportarBolões();
		
		setLayout(new GridLayout(4, 1, 30, 10));
		
		add(Cadastrar);
		add(MostrarBolões);
		add(Importar);
		add(Exportar);
	}
}
