package Aba_do_Jogo;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import DadosdoJogo.ComparaçãodeDados;

public class Painel_CelulasdoJogo extends JPanel
{
	public ArrayList<Botão_CeluladoJogo> BotõesdoJogo;
	public boolean Permissão;
	
	public int AlturadoGol;
	public int LarguradoGol;
	
	public ComparaçãodeDados Comparação;
	
	public Painel_CelulasdoJogo(int QuantdeLinhas, int QuantColunas)
	{
		AlturadoGol = QuantdeLinhas;
		LarguradoGol = QuantColunas;
		Permissão = false;
		
		BotõesdoJogo = new ArrayList<Botão_CeluladoJogo>();
		FormarGol();	
		
		setLayout(new GridLayout(QuantdeLinhas, QuantColunas));
		for (Botão_CeluladoJogo BC : BotõesdoJogo)
		{
			add(BC);
		}
		 
	}
	
	public void FormarGol()
	{
		for (int i = 0; i < AlturadoGol; i++) 
		{
			for (int j = 0; j < LarguradoGol; j++) 
			{
				if (i == 0 || j == 0 || j == LarguradoGol-1) 
				{
					BotõesdoJogo.add(new Botão_CeluladoJogo(RegiõesdoGol.FORA, i, j, this));
				}
				else if (i == 1 || j == 1 || j == LarguradoGol-2)
				{
					BotõesdoJogo.add(new Botão_CeluladoJogo(RegiõesdoGol.TRAVE, i, j, this));
				}
				else
				{
					BotõesdoJogo.add(new Botão_CeluladoJogo(RegiõesdoGol.REDE, i, j, this));
				}	
			}
		}
	}

	public void SetarCores(Color FORA, Color TRAVE, Color REDE) 
	{
		for (int i = 0; i < BotõesdoJogo.size(); i++)
		{	
			if (BotõesdoJogo.get(i).Região == RegiõesdoGol.FORA)
			{
				BotõesdoJogo.get(i).setBackground(FORA);
			}
			else if (BotõesdoJogo.get(i).Região == RegiõesdoGol.TRAVE)
			{
				BotõesdoJogo.get(i).setBackground(TRAVE);
			}
			else if (BotõesdoJogo.get(i).Região == RegiõesdoGol.REDE)
			{
				BotõesdoJogo.get(i).setBackground(REDE);
			}
		}	
	}
	
	public void FormarDefesadoGoleiro()
	{
		Random R = new Random();
		
		Botão_CeluladoJogo Goleiro = BotõesdoJogo.get((BotõesdoJogo.size()-1) - R.nextInt(LarguradoGol));
		
		FormarMãos(Goleiro, PresençadeDefesa.MAODIREITA, R);
		FormarMãos(Goleiro, PresençadeDefesa.MAOESQUERDA, R);
		
		Goleiro.Defesa = PresençadeDefesa.CORPODOGOLEIRO;
		Goleiro.setBackground(Color.RED);
		Goleiro.setIcon(new ImageIcon(new ImageIcon("imagens/Goleiro_Corpo.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		
	}
	
	public void FormarMãos(Botão_CeluladoJogo Goleiro, PresençadeDefesa TipodeMão, Random R)
	{
		boolean Confirmação = false;
		int AuxdePosicionamento;
		
		Botão_CeluladoJogo Mão;
		
		do
		{
			AuxdePosicionamento = R.nextInt(BotõesdoJogo.size());
			Mão = BotõesdoJogo.get(AuxdePosicionamento);
			
			if (TipodeMão == PresençadeDefesa.MAODIREITA)
			{
				if(Mão.Posição_J <= Goleiro.Posição_J && Mão.Posição_I != Goleiro.Posição_I)
				{
					Confirmação = true;
				}
			}
			else if (TipodeMão == PresençadeDefesa.MAOESQUERDA)
			{
				if(Mão.Posição_J >= Goleiro.Posição_J && Mão.Posição_I != Goleiro.Posição_I)
				{
					Confirmação = true;
				}
			}
		}
		while(Confirmação == false);
		
		Botão_CeluladoJogo RegiãodeDefesa;
		int I = 0;
		int Contador = 0;
		
		do
		{		
			if (TipodeMão == PresençadeDefesa.MAODIREITA)
			{
				Contador = Goleiro.Posição_J - BotõesdoJogo.get(AuxdePosicionamento+I).Posição_J;
			}
			else if (TipodeMão == PresençadeDefesa.MAOESQUERDA)
			{
				Contador = BotõesdoJogo.get(AuxdePosicionamento+I).Posição_J - Goleiro.Posição_J;
			}
			
			do
			{
				RegiãodeDefesa = BotõesdoJogo.get(AuxdePosicionamento+I);
				RegiãodeDefesa.Defesa = PresençadeDefesa.AREADEDEFESA;
				RegiãodeDefesa.setBackground(Color.RED);
				
				if (TipodeMão == PresençadeDefesa.MAODIREITA)
				{
					I++;
				}
				else if (TipodeMão == PresençadeDefesa.MAOESQUERDA)
				{
					I--;
				}	
				
			}
			while (RegiãodeDefesa.Posição_J != Goleiro.Posição_J);
			
			I = 0;
			
			if (Contador != 0)
			{
				if (TipodeMão == PresençadeDefesa.MAODIREITA)
				{
					AuxdePosicionamento += LarguradoGol + 1;
				}
				else if (TipodeMão == PresençadeDefesa.MAOESQUERDA)
				{
					AuxdePosicionamento += LarguradoGol - 1;
				}	
			}
			else
			{
				AuxdePosicionamento += LarguradoGol;
			}
		}
		while(RegiãodeDefesa.Posição_I != Goleiro.Posição_I);
	
	
		if (TipodeMão == PresençadeDefesa.MAODIREITA)
		{
			Mão.Defesa = PresençadeDefesa.MAODIREITA;
			Mão.setIcon(new ImageIcon(new ImageIcon("imagens/Mão_Direita.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		
		}
		else if (TipodeMão == PresençadeDefesa.MAOESQUERDA)
		{
			Mão.Defesa = PresençadeDefesa.MAOESQUERDA;
			Mão.setIcon(new ImageIcon(new ImageIcon("imagens/Mão_Esquerda.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
			
		}
		Mão.setBackground(Color.RED);
	}
}
