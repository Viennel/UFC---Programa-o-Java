package classes_usadas;
 
public class Main 
{
	public static void main(String[] args) 
	{
		//teste
		
		Gol gol = new Gol(9, 17);
//		System.out.println(gol.DesenharGol());
//		System.out.println(gol.DesenharQuadrantesdoGol());
	
		Goleiro Teste1 = new Goleiro(1, "Teste1", 10, 10, 10, 10, 10, 10);
		Goleiro Teste2 = new Goleiro(2, "Teste2", 5, 4, 10, 10, 6, 7);
		Goleiro Teste3 = new Goleiro(3, "Teste3", 7, 2, 8, 7, 10, 10);
		Goleiro Teste4 = new Goleiro(4, "Teste4", 2, 9, 4, 7, 4, 5);
		Goleiro Teste5 = new Goleiro(5, "Teste5", 3, 9, 2, 7, 6, 1);
		
		Seleção STeste = new Seleção(Teste1, Teste2, Teste3, Teste4, Teste5);
						
		GrupodeSeleções GS = new GrupodeSeleções();
		GS.setGrupodeSeleções(STeste);
		
		Bola B = new Bola();
		B.addChutes(new Chute(8, 4, 6, 11));
		B.addChutes(new Chute(10, 1, 3, 4));
		B.addChutes(new Chute(4, 2, 2, 14));
		B.addChutes(new Chute(6, 3, 7, 8));
		
		SistemadeAvaliação Sis = new SistemadeAvaliação(gol);
		Sis.setListadeSeleçõesproSistema(GS);
		Sis.setBolaproSistema(B);
		
		Sis.GolBola(0);
		System.out.println(Sis.DesenharGolBola());
		
		Sis.GoleiroBola(0, 0, 1);
		System.out.println(Sis.DesenharGoleiroBola());
		System.out.println(Sis.Comparação(0, 0, 0));
	}
}
