package lab1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Apresentacao {

	private Agenda carregarDadosParaTesteAgendamento() {

		// clientes
		Cliente cliente1 = new Cliente("080.388.788-95");
		cliente1.setId(1);
		cliente1.setNome("Pedro");
		
		Cliente cliente2 = new Cliente("543.666.453-57");
		cliente2.setId(2);
		cliente2.setNome("Jordana");
		
		Cliente cliente3 = new Cliente("134.464.134-34");
		cliente3.setId(3);
		cliente3.setNome("Peter");

		Cabeleireiro cabeleireiro1 = new Cabeleireiro("Ana", "033.333.333-13");
		cabeleireiro1.setId(1);
		Cabeleireiro cabeleireiro2 = new Cabeleireiro("Lucas", "248.328.436-24");
		cabeleireiro2.setId(2);
		Cabeleireiro cabeleireiro3 = new Cabeleireiro("Matheus", "244.465.545-25");
		cabeleireiro3.setId(3);

		// agendamento
		Agendamento agendamento1 = new Agendamento(cliente1, cabeleireiro1);
		Calendar data1 = Calendar.getInstance();
		data1.set(2022, 9, 27, 20, 30);
		agendamento1.setData(data1);
		
		Agendamento agendamento2 = new Agendamento(cliente2, cabeleireiro2);
		Calendar data2 = Calendar.getInstance();
		data2.set(2022, 10, 13, 17, 45);
		agendamento2.setData(data2);
		
		Agendamento agendamento3 = new Agendamento(cliente3, cabeleireiro3);
		Calendar data3 = Calendar.getInstance();
		data3.set(2022, 5, 20, 16, 20);
		agendamento3.setData(data3);
		
		Agenda AGENDAMENTOS = new Agenda();
		AGENDAMENTOS.addAgendamentos(agendamento1);
		AGENDAMENTOS.addAgendamentos(agendamento2);
		AGENDAMENTOS.addAgendamentos(agendamento3);

		return AGENDAMENTOS;
	}

	public Atendimento carregarDadosParaTesteAtendimento() {
		// clientes
		Cliente cliente1 = new Cliente("080.388.788-95");
		cliente1.setId(1);
		cliente1.setNome("Pedro");

		// servicos
		Servico servico1 = new Servico();
		servico1.setId(1);
		servico1.setNome("Corte de cabelo");
		servico1.setDescricao("Corte de cabelo legal");
		servico1.setValor(150);

		Servico servico2 = new Servico();
		servico2.setId(2);
		servico2.setNome("Hidrata??????o facial");
		servico2.setDescricao(
				"Hidratante Antissinais para redu??????o de linhas de express???o, suavizando sinais de cansa???o");
		servico2.setValor(100);

		Servico servico3 = new Servico();
		servico3.setId(3);
		servico2.setNome("Massagem relaxante");
		servico3.setDescricao(
				"Trata-se de manobras especializadas empregadas no m???sculo, conferindo ao indiv???duo relaxamento e al???vio muscular. Al???m de produzir efeitos nos sistemas muscular e nervoso, essa massagem age com efic???cia nos sistemas linf???tico, circulat???rio e respirat???rio.");
		servico3.setValor(100);

		// cabeleireiro
		Cabeleireiro cabeleireiro1 = new Cabeleireiro("Antonio", "044.444.444-55");

		// atendimentos
		Atendimento atendimento1 = new Atendimento(cliente1, cabeleireiro1);
		atendimento1.addServico(servico1);
		atendimento1.addServico(servico2);
		atendimento1.addServico(servico3);

		return atendimento1;

	}

	public Cliente carregarCliente(Scanner entrada) {
		System.out.println("Informe o cliente: ");
		System.out.println("cpf do cliente: ");
		Cliente c = new Cliente(entrada.next());
		System.out.println("\nid do cliente: ");
		c.setId(entrada.nextInt());
		System.out.println("\nnome do cliente: ");
		c.setNome(entrada.next());
		System.out.println("\n\n");
		return c;
	}

	public ArrayList<Servico> carregarServico(Scanner entrada) {
		ArrayList<Servico> aux = new ArrayList<Servico>();
		System.out.println("Informe dados sobre os servico(s)");
		String op = "";
		do {
			Servico s = new Servico();
			System.out.println("\nNome do servico:");
			s.setNome(entrada.next());

			System.out.println("\nDescricao do servico:");
			s.setDescricao(entrada.next());

			System.out.println("\nValor do servico:");
			s.setValor(entrada.nextFloat());

			aux.add(s);
			System.out.println("Digite sair ou qualquer tecla para adiocar novo servico:");
			op = entrada.next();

		} while (!(op.equals("sair")));
		
		return aux;
	}

	public Atendimento dadosCarregadosDoTecladoAtendimento() {
		Scanner entrada = new Scanner(System.in);
		Cliente cliente = carregarCliente(entrada);
		Cabeleireiro cabeleireiro = carregarCabeleireiro(entrada);
		Atendimento a = new Atendimento(cliente, cabeleireiro);
		a.setListServico(carregarServico(entrada));
		
		Q1ValorTotaldeServi??os(a);
		Q2NumerodeServi??os(a, cliente);
		Q3NomedoClienteIgualNomedoCabeleireiro(cliente, cabeleireiro);
		
		return a;
	}

	private Cabeleireiro carregarCabeleireiro(Scanner entrada) {

		System.out.println("Informe o cabeleireiro: ");
		System.out.print("\nnome do cabeleireiro: ");
		String nome = entrada.next();
		System.out.print("\ncpf do cabeleireiro: ");
		String cpf = entrada.next();
		Cabeleireiro c = new Cabeleireiro(nome, cpf);

		System.out.print("\nid do cabeleireiro: ");
		c.setId(entrada.nextInt());

		return c;
	}

	public static void main(String[] args) {

		Apresentacao a = new Apresentacao();
		Balan??o B = new Balan??o();
		Scanner Entrada = new Scanner(System.in);
		/* Questao 1 */
		// Atendimento atendimento = a.carregarDadosParaTesteAtendimento();
		// System.out.println(atendimento.imprimir());
		//
		// Agendamento agendamento = a.carregarDadosParaTesteAgendamento();
		// System.out.println(agendamento.imprimir());

		/* Questao 2 */
		
		Atendimento atendimento2 = a.dadosCarregadosDoTecladoAtendimento(); 
		B.addAtendimento(atendimento2);
		System.out.println(atendimento2.imprimir());
		
		Atendimento atendimento3 = a.dadosCarregadosDoTecladoAtendimento(); 
		B.addAtendimento(atendimento3);
		System.out.println(atendimento3.imprimir());
		
		Atendimento atendimento4 = a.dadosCarregadosDoTecladoAtendimento(); 
		B.addAtendimento(atendimento4);
		System.out.println(atendimento4.imprimir());
		
		
			
		Q5CabeleireiroMaisAtivo(B);
		Q6ClienteQueMaisGastou(B);
		Q7QuantidadeServi??osnoTotal(B);
		Q8Servi??oGratuito(B);
		Q9Informa????esdeServi??o(B, Entrada);
		
		
		Agenda AG = a.carregarDadosParaTesteAgendamento();
		
		Q11DatadoAgendamento(AG, Entrada);
		Q12HorarioOcupadodoCabeleireiro(AG, Entrada);
		Q13HorarioMarcadodoCliente(AG, Entrada);
		
	}
	
	//QUEST??ES DA LISTA
	
	public void Q1ValorTotaldeServi??os(Atendimento A)
	{
		float ValorTotal = 0; 
		for (int i = 0; i < A.getListServico().size(); i++) 
		{
			ValorTotal += A.getListServico().get(i).getValor();
		}
		
		A.setValorTotal(ValorTotal);	
		
		System.out.println("\nValor total a ser pago -> " + ValorTotal);
	}
	
	public void Q2NumerodeServi??os(Atendimento A, Cliente C)
	{
		System.out.println("Quantidade de Servi??os -> " + A.getListServico().size() + "\nCPF do cliente -> " + C.getCPF());
	}
	
	public void Q3NomedoClienteIgualNomedoCabeleireiro(Cliente cliente, Cabeleireiro cabeleireiro)
	{
		if (cliente.getNome().equals(cabeleireiro.getNome()))
		{
			System.out.println("O nome do Cliente ?? igual ao do Cabeleireiro");
		}
		else
		{
			System.out.println("O nome do Cliente n??o ?? igual ao do Cabeleireiro");
		}
	}
	
	public static void Q5CabeleireiroMaisAtivo(Balan??o B)
	{
		int Cab = 0, auxi, Apari????es;
		int contador[] = new int[B.getBalan??o().size()];
		
		for (int i = 0; i < B.getBalan??o().size(); i++) 
		{
			auxi = 0;
			Apari????es = 0;
			do
			{
				if (B.getBalan??o().get(auxi).getCabeleireiro().getNome().equals(B.getBalan??o().get(i).getCabeleireiro().getNome()))
				{
					contador[Cab] = (Apari????es + 1);
				}
				auxi++;
			}
			while (auxi < B.getBalan??o().size());
			Cab++;	
		}
		
		int i, j = 0, CabeleireiroComMaisApari????es = 0;
		for (i = 0; i < B.getBalan??o().size(); i++) 
		{
			if (contador[i] < contador[j] && j != (B.getBalan??o().size() + 1))
			{
				CabeleireiroComMaisApari????es = j;
			}
			else
			{
				CabeleireiroComMaisApari????es = i;
			}
			j++;
		}
		
		System.out.println("O Cabeleireiro Com Mais Apari????es ?? o " + B.getBalan??o().get(CabeleireiroComMaisApari????es).getCabeleireiro().getNome());
	}

	public static void Q6ClienteQueMaisGastou(Balan??o B)
	{
		float ValormaisAlto = B.getBalan??o().get(0).getValorTotal();
		int ClienteQueMaisGastou = 0;
		for (int i = 0; i < B.getBalan??o().size(); i++) 
		{
			if (ValormaisAlto < B.getBalan??o().get(i).getValorTotal())
			{
				ValormaisAlto = B.getBalan??o().get(i).getValorTotal();
				ClienteQueMaisGastou = i;
			}		
		}
		
		System.out.println("O Cliente que mais gastou foi o " + B.getBalan??o().get(ClienteQueMaisGastou).getCliente().getNome());
	}
	
	public static void Q7QuantidadeServi??osnoTotal(Balan??o B)
	{
		int QuantdeServi??os = 0;
		for (int i = 0; i < B.getBalan??o().size(); i++) 
		{
			QuantdeServi??os += B.getBalan??o().get(i).getListServico().size();
		}
		System.out.println("A Quantidade total de servi??os ?? de " + QuantdeServi??os + " Servi??os");
	}
	
	public static void Q8Servi??oGratuito(Balan??o B)
	{
		for (int i = 0; i < B.getBalan??o().size(); i++) 
		{
			for (int j = 0; j < B.getBalan??o().get(i).getListServico().size() ; j++)
			{
				if (B.getBalan??o().get(i).getListServico().get(j).getValor() == 0)
				{
					System.out.println("O Servi??o " + B.getBalan??o().get(i).getListServico().get(j).getNome() + " foi gratuito");
				}
			}
		}
	}
	
	public static void Q9Informa????esdeServi??o(Balan??o B, Scanner Q9Entrada)
	{
		System.out.println("\nDigite o nome do Servi??o que voc?? quer para obter informa????es ou ''sair'' para parar");
		String Busca = "";
		do
		{	
			System.out.print("\nServi??o -> ");
			Busca = Q9Entrada.nextLine();
			for (int i = 0; i < B.getBalan??o().size(); i++) 
			{
				for (int j = 0; j < B.getBalan??o().get(i).getListServico().size() ; j++)
				{
					if (Busca.equals(B.getBalan??o().get(i).getListServico().get(j).getNome()))
					{
						System.out.println("\nID - " + B.getBalan??o().get(i).getListServico().get(j).getId());
						System.out.println("Descri????o - " + B.getBalan??o().get(i).getListServico().get(j).getDescricao());
						System.out.println("Valor - " + B.getBalan??o().get(i).getListServico().get(j).getValor());
					}
				}
			}
		}
		while(!Busca.equals("sair"));
		Q9Entrada.close();
	}
	
	public static void Q11DatadoAgendamento(Agenda AG, Scanner Q11Entrada)
	{
		System.out.println("\nDigite a Data do Agendamento que voc?? quer para obter informa????es ou ''sair'' para parar");
		String Busca = "";
		do
		{	
			System.out.print("\nEscreva no Formato [DIA/MES/ANO - HORA:MINUTO] -> ");
			Busca = Q11Entrada.nextLine();
			for (int i = 0; i < AG.getAgendamentos().size(); i++) 
			{
				if (Busca.equals(AG.getAgendamentos().get(i).getDatadoAgendamento()))
				{
					System.out.println(AG.getAgendamentos().get(i).imprimir());	
				}
			}
		}
		while(!Busca.equals("sair"));
	}
	
	public static void Q12HorarioOcupadodoCabeleireiro(Agenda AG, Scanner Q12Entrada)
	{	
		System.out.println("\nDigite o ID do Cabeleireiro que voc?? quer para obter seu Horario Ocupado ou ''0'' para parar");
		int Busca;
		do
		{	
			System.out.print("\nID do Cabeleireiro -> ");
			Busca = Q12Entrada.nextInt();
			for (int i = 0; i < AG.getAgendamentos().size(); i++) 
			{
				if (Busca == AG.getAgendamentos().get(i).getCabeleireiro().getId())
				{
					System.out.println("\n" + AG.getAgendamentos().get(i).getDatadoAgendamento());	
				}
			}
		}
		while(Busca != 0);
	}
	
	public static void Q13HorarioMarcadodoCliente(Agenda AG, Scanner Q13Entrada)
	{
		System.out.println("\nDigite o ID do Cliente para saber seu Horario Marcado ou ''0'' para parar");
		int Busca;
		do
		{	
			System.out.print("\nID do Cabeleireiro -> ");
			Busca = Q13Entrada.nextInt();
			for (int i = 0; i < AG.getAgendamentos().size(); i++) 
			{
				if (Busca == AG.getAgendamentos().get(i).getCliente().getId())
				{
					System.out.println("\n" + AG.getAgendamentos().get(i).getDatadoAgendamento());	
				}
			}
		}
		while(Busca != 0);
	}
}
