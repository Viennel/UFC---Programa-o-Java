package classes_usadas;
 
public class Main 
{
	public static void main(String[] args) 
	{
		Gol gol = new Gol(9, 17);
		
		Goleiro G1 = new Goleiro(1, "Pratik Skaggs", 5, 7, 8, 9, 6, 6);
		Goleiro G2 = new Goleiro(2, "Uehudah Hack", 9, 6, 8, 8, 7, 10);
		Goleiro G3 = new Goleiro(3, "Edison Drye", 5, 8, 5, 8, 10, 7);
		Goleiro G4 = new Goleiro(4, "Ajani Harding", 6, 6, 5, 8, 7, 6);
		Goleiro G5 = new Goleiro(5, "Orazio Hart", 5, 8, 7, 9, 9, 10);
		
		Seleção S1 = new Seleção(G1, G2, G3, G4, G5);
		
		Goleiro G6 = new Goleiro(6, "Tristan Karns", 9, 7, 10, 7, 7, 6);
		Goleiro G7 = new Goleiro(7, "Niven Glaser", 10, 9, 7, 6, 5, 8);
		Goleiro G8 = new Goleiro(8, "Derwyn Devers", 10, 7, 9, 5, 9, 5);
		Goleiro G9 = new Goleiro(9, "Tod Phan", 10, 7, 7, 5, 5, 6);
		Goleiro G10 = new Goleiro(10, "Eddie Hulse", 7, 6, 5, 9, 7, 5);
		
		Seleção S2 = new Seleção(G6, G7, G8, G9, G10);
		
		Goleiro G11 = new Goleiro(11, "Welford Yepez", 5, 8, 8, 7, 7, 8);
		Goleiro G12 = new Goleiro(12, "Rishley Snyder", 6, 5, 6, 5, 7, 6);
		Goleiro G13 = new Goleiro(13, "Milo Mccurdy", 10, 9, 8, 6, 10, 9);
		Goleiro G14 = new Goleiro(14, "Carden Justus", 8, 5, 8, 5, 10, 7);
		Goleiro G15 = new Goleiro(15, "Carlyon Gorby", 8, 5, 8, 8, 8, 6);
		
		Seleção S3 = new Seleção(G11, G12, G13, G14, G15);
		
		Goleiro G16 = new Goleiro(16, "Mungo Spangler", 8, 10, 9, 8, 9, 5);
		Goleiro G17 = new Goleiro(17, "Whitmore Squires", 9, 10, 7, 9, 9, 10);
		Goleiro G18 = new Goleiro(18, "Pedrog Mccurdy", 8, 5, 10, 5, 7, 7);
		Goleiro G19 = new Goleiro(19, "Ridgley Leo", 8, 8, 8, 9, 9, 9);
		Goleiro G20 = new Goleiro(20, "Bolton Tarin", 9, 8, 7, 6, 9, 10);
		
		Seleção S4 = new Seleção(G16, G17, G18, G19, G20);
		
		Goleiro G21 = new Goleiro(21, "Edison Loy", 7, 7, 5, 10, 10, 7);
		Goleiro G22 = new Goleiro(22, "Delling Herndon", 7, 5, 5, 8, 9, 9);
		Goleiro G23 = new Goleiro(23, "Senichi Iorio", 7, 7, 5, 8, 10, 5);
		Goleiro G24 = new Goleiro(24, "Albin Kerner", 6, 7, 8, 8, 9, 9);
		Goleiro G25 = new Goleiro(25, "Jivin Justus", 9, 10, 8, 7, 7, 5);
		
		Seleção S5 = new Seleção(G21, G22, G23, G24, G25);
		
		GrupodeSeleções GS = new GrupodeSeleções();
		GS.setGrupodeSeleções(S1);
		GS.setGrupodeSeleções(S2);
		GS.setGrupodeSeleções(S3);
		GS.setGrupodeSeleções(S4);
		GS.setGrupodeSeleções(S5);
		
		Bola B = new Bola();
		B.addChutes(new Chute(1, 2, 1, 4, 7));
		B.addChutes(new Chute(2, 6, 1, 3, 6));
		B.addChutes(new Chute(3, 9, 2, 4, 15));
		B.addChutes(new Chute(4, 5, 4, 6, 11));
		B.addChutes(new Chute(5, 3, 4, 8, 13));

		B.addChutes(new Chute(6, 3, 3, 6, 4));
		B.addChutes(new Chute(7, 4, 4, 5, 8));
		B.addChutes(new Chute(8, 7, 4, 7, 14));
		B.addChutes(new Chute(9, 8, 4, 7, 14));
		B.addChutes(new Chute(10, 4, 4, 6, 12));
		
		B.addChutes(new Chute(11, 2, 4, 5, 15));
		B.addChutes(new Chute(12, 7, 3, 6, 4));
		B.addChutes(new Chute(13, 3, 3, 8, 2));
		B.addChutes(new Chute(14, 9, 4, 7, 10));
		B.addChutes(new Chute(15, 10, 4, 7, 12));
		
		B.addChutes(new Chute(16, 5, 1, 4, 2));
		B.addChutes(new Chute(17, 3, 4, 5, 13));
		B.addChutes(new Chute(18, 10, 2, 4, 16));
		B.addChutes(new Chute(19, 10, 4, 5, 16));
		B.addChutes(new Chute(20, 10, 2, 3, 14));
		
		B.addChutes(new Chute(21, 9, 2, 1, 8));
		B.addChutes(new Chute(22, 4, 4, 8, 16));
		B.addChutes(new Chute(23, 8, 4, 6, 14));
		B.addChutes(new Chute(24, 7, 4, 7, 11));
		B.addChutes(new Chute(25, 6, 1, 0, 3));
		
		B.addChutes(new Chute(26, 5, 3, 6, 7));
		B.addChutes(new Chute(27, 3, 3, 8, 4));
		B.addChutes(new Chute(28, 4, 3, 6, 7));
		B.addChutes(new Chute(29, 10, 2, 2, 13));
		B.addChutes(new Chute(30, 7, 3, 5, 3));
			
		SistemadeAvaliação Sis = new SistemadeAvaliação(gol, GS, B);
		System.out.println(Sis.LocalizaçãodosChutes());
		
		for (int Seleção = 0; Seleção < GS.getListadeSeleções().size(); Seleção++) 
		{
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("--- SELEÇÃO " + (Seleção+1) + " ---");
			for (int Goleiro = 0; Goleiro < 5; Goleiro++) 
			{
				System.out.println(Sis.getInformaçõesdoGoleiro(Seleção, Goleiro));
				for (int Chute = 0; Chute < B.getChutes().size(); Chute++) 
				{
					Sis.GoleiroBola(Chute, Seleção, Goleiro);
					System.out.println(Sis.Comparação(Chute, Seleção, Goleiro));
				}
				System.out.println(Sis.ResultadoDosChutes(Seleção, Goleiro));
			}
			System.out.println(Sis.GoleiroTitulardaSeleção(Seleção));
		}
		System.out.println(Sis.GolsNoAngulo());
		System.out.println(Sis.QuadranteQueOGoleiroMaisLevouGol(21));		
	}
}
