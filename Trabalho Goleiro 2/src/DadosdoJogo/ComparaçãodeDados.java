package DadosdoJogo;

import java.util.ArrayList;

import Aba_do_Jogo.Botão_CeluladoJogo;
import Aba_do_Jogo.PresençadeDefesa;
import Aba_do_Jogo.RegiõesdoGol;

public class ComparaçãodeDados 
{
	public DadosdoGoleiro DG;
	public DadosdoJogador DJ;
	public ArrayList<Boolean> GolouDefesa;
	public ArrayList<Botão_CeluladoJogo> OcorrenciadeChutes;
	
	public ComparaçãodeDados()
	{
		DG = new DadosdoGoleiro();
		DJ = new DadosdoJogador();
		GolouDefesa = new ArrayList<Boolean>();
		OcorrenciadeChutes = new ArrayList<Botão_CeluladoJogo>();
		
	}
	
	public void CompararDados(Botão_CeluladoJogo BC)
	{
		if (BC.Região == RegiõesdoGol.REDE && BC.Defesa == PresençadeDefesa.SEMDEFESA)
		{
			DJ.Pontuação++;
			GolouDefesa.add(true);
		}
		else
		{
			if(BC.Defesa == PresençadeDefesa.AREADEDEFESA)
			{
				DG.DefesasnaAreadeDefesa++;
			}
			else if(BC.Defesa == PresençadeDefesa.CORPODOGOLEIRO)
			{
				DG.DefesasnoCorpodoGoleiro++;
			}
			else if(BC.Defesa == PresençadeDefesa.MAODIREITA)
			{
				DG.DefesasnaMãoDireita++;
			}
			else if(BC.Defesa == PresençadeDefesa.MAOESQUERDA)
			{
				DG.DefesasnaMãoEsquerda++;
			}
			DG.PontuaçãoGeral++;
			GolouDefesa.add(false);
		}
		OcorrenciadeChutes.add(BC);
	}
}
