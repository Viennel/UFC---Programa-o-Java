package teste_de_objeto;

public class Main {

	public static void main(String[] args)
	{
		teste1 T1 = new teste1(10, 10);
		System.out.println("Matriz t1\n" + T1.impressãoteste1());
		
		teste2 T2 = new teste2();
		T2.setTeste1(T1);
		T2.setTeste2(5);
		System.out.println("Matriz t2\n" + T2.impressãotest2());

		System.out.println("Matriz t2 sobrescreve Matriz t1\n" + T1.impressãoteste1());
	}

}
