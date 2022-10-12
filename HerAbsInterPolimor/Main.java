package HerAbsInterPolimor;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//abstração - operações principais, obrigatórias, foco.
		Scanner Toca = new Scanner(System.in);
	
		Musica M1 = new Musica("I like large fries");
		M1.setDuracao(240);
		
		Musica M2 = new Musica("Samba Canção");
		M2.setDuracao(200);
		
		Musica M3 = new Musica("Dame Dame");
		M3.setDuracao(178);
		
		Album A = new Album(M1);
		A.addMusica(M2);
		A.addMusica(M3);
		A.setArtista("Jonatinha");
		
//		Play P = new Play();
//		P.addAlbum(A);
//		
//		for (Album album : P.getListadeAlbum())
//		{
//			System.out.println("Artista: " + album.getArtista());
//			for (Musica musica : A.getListadeMusicas())
//			{
//				System.out.println(musica.getNome() + " - " + musica.getDuracao());
//			}
//		}
		
		
		//Interface - Obriga uma classe a ter Metodos.
		//Herança - Classe filho herda as coisas de uma outra classe.
		//(Filho sempre vai fazer >= que o pai / Filho pode ter prioridade sobre coisas do pai)
//		Tocador T = new Tocador();
//		T.TestedoTocador(P);
//		
//		PlayModerno PM = new PlayModerno();
//		
//		T.TestedoTocador(PM);
		
		PlayVinicius539250 PV = new PlayVinicius539250();
		PV.addAlbum(A);
		
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Tocar Musica do Album");
		System.out.println("2 - Pausar Musica do Album");
		System.out.println("3 - Ir para Proxima Musica");
		System.out.println("4 - Voltar para Musica Anterior");
		System.out.println("5 - Parar Album");
		System.out.println("0 - Sair");
		
		do
		{	System.out.print("\nOP -> ");
			PV.Ação(Toca.next());
			System.out.println("\n" + PV.Opção);
		}
		while (!PV.Opção.equals("0"));
	}
}
