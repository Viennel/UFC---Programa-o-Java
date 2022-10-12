package HerAbsInterPolimor;

public class Tocador 
{
	public void TestedoTocador(IPlay tocador)
	{
		tocador.start();
		tocador.stop();
		tocador.next(2);
		tocador.back(2);
		tocador.pause();
	}
}
