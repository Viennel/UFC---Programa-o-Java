package Ocorrencia_Cadastrar;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import DadosDoBolão.Dados;
import Persistencia_BancodeDadosdoBolao.DadosdoBolaoDAO;

public class Janela_Campeão extends JFrame
{
	public Dados InfoDoBolao;
	private DadosdoBolaoDAO DDAO;
	private JButton CAMPEAO;
	
	public Janela_Campeão(Dados D)
	{
		DDAO = new DadosdoBolaoDAO();
		InfoDoBolao = D;
		
		setSize(700, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		if(InfoDoBolao.SelNasFinais.get(0).PlacardaSel > InfoDoBolao.SelNasFinais.get(1).PlacardaSel)
		{
			InfoDoBolao.SelCamp = InfoDoBolao.SelNasFinais.get(0).NomedaSel;
		}
		else
		{
			InfoDoBolao.SelCamp = InfoDoBolao.SelNasFinais.get(1).NomedaSel;
		}
		
		CAMPEAO = new JButton();
		if (InfoDoBolao.SelCamp.equals("BRA"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Brasil.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("ESP"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Espanha.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("HOL"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Holanda.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("ARG"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Argentina.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("ING"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Inglaterra.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("FRA"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/França.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("BEL"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Belgica.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		else if (InfoDoBolao.SelCamp.equals("POR"))
		{
			CAMPEAO.setIcon(new ImageIcon(new ImageIcon("ImagensSelecoes/Portugal.png").getImage().getScaledInstance(getSize().width, getSize().height, Image.SCALE_SMOOTH)));
		}
		
		add(CAMPEAO);
		
		DDAO.AdicionarBolaoNoBancodeDados(InfoDoBolao);
		
		setTitle("Vencedor: " + InfoDoBolao.SelCamp);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
