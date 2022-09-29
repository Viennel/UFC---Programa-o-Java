package salão_de_beleza;

import java.util.Calendar;
import java.util.Scanner;

public class Main 
{
	public static int Tempo(Calendar C, int Tipo)
	{
		return C.get(Tipo);
	}
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		Cliente Cliente1 = new Cliente("245.356.145-91");
		Cliente1.setId(456);
		Cliente1.setNome("Joana");
		
		Cliente Cliente2 = new Cliente("345.865.133-53");
		Cliente2.setId(356);
		Cliente2.setNome("Paula");
		
		Cliente Cliente3 = new Cliente("123.765.285-98");	
		Cliente3.setId(798);
		Cliente3.setNome("Fernanda");
		
		Cabeleireiro Cabeleireiro1 = new Cabeleireiro("864.326.673-45", "Jordana");
		Cabeleireiro1.setId(234);
		
		Cabeleireiro Cabeleireiro2 = new Cabeleireiro("132.765.256-24", "Maria");
		Cabeleireiro2.setId(234);
		
		Cabeleireiro Cabeleireiro3 = new Cabeleireiro("243.576.243-46", "Daniel");
		Cabeleireiro3.setId(234);
		
		Serviço Serviço1 = new Serviço();
		Serviço1.setId(Cliente1.getId());
		Serviço1.setNome("Corte");
		Serviço1.setValor(15);
		Serviço1.setDescrição("Corte completo de Cabelo");
		
		Serviço Serviço2 = new Serviço();
		Serviço2.setId(Cliente2.getId());
		Serviço2.setNome("Lavagem");
		Serviço2.setValor(30);
		Serviço2.setDescrição("Lavagem completa de Cabelo");
		
		Serviço Serviço3 = new Serviço();
		Serviço3.setId(Cliente3.getId());
		Serviço3.setNome("Tintura");
		Serviço3.setValor(40);
		Serviço3.setDescrição("Tintura completa de Cabelo");
				
		Atendimento Atendimento1 = new Atendimento(Cliente1);
		Calendar data1 = Calendar.getInstance();
		Atendimento1.setData(data1);
		Atendimento1.setListadeServiços(Serviço1.getNome());
		Atendimento1.setCabeleireiro(Cabeleireiro1.getNome());
		
		Atendimento Atendimento2 = new Atendimento(Cliente2);
		Calendar data2 = Calendar.getInstance();
		Atendimento2.setData(data2);
		Atendimento2.setListadeServiços(Serviço2.getNome());
		Atendimento2.setCabeleireiro(Cabeleireiro2.getNome());

		Atendimento Atendimento3 = new Atendimento(Cliente3);
		Calendar data3 = Calendar.getInstance();
		Atendimento3.setData(data3);
		Atendimento3.setListadeServiços(Serviço3.getNome());
		Atendimento3.setCabeleireiro(Cabeleireiro3.getNome());
		
		Agendamento Agendamento1 = new Agendamento(Cliente1, Cabeleireiro1);
		Agendamento1.setId(Cliente1.getId());
		Calendar DataAgendamento1 = Calendar.getInstance();
		Agendamento1.setData(DataAgendamento1);
		Agendamento1.setHora(DataAgendamento1, Calendar.HOUR_OF_DAY);
		Agendamento1.setMinuto(DataAgendamento1, Calendar.MINUTE);
		
		Agendamento Agendamento2 = new Agendamento(Cliente2, Cabeleireiro2);
		Agendamento2.setId(Cliente2.getId());
		Calendar DataAgendamento2 = Calendar.getInstance();
		Agendamento2.setData(DataAgendamento2);
		Agendamento1.setHora(DataAgendamento2, Calendar.HOUR_OF_DAY);
		Agendamento1.setMinuto(DataAgendamento2, Calendar.MINUTE);
				
		Agendamento Agendamento3 = new Agendamento(Cliente3, Cabeleireiro3);
		Agendamento3.setId(Cliente3.getId());
		Calendar DataAgendamento3 = Calendar.getInstance();
		Agendamento3.setData(DataAgendamento3);
		Agendamento1.setHora(DataAgendamento3, Calendar.HOUR_OF_DAY);
		Agendamento1.setMinuto(DataAgendamento3, Calendar.MINUTE);
		
		System.out.print("Para iniciar cadastro, insira o CPF do cliente\nAAA.BBB.CCC-DD -> ");
		Cliente ClienteX = new Cliente(entrada.next());
		System.out.print("Insira o ID do Cliente -> ");
		ClienteX.setId(entrada.nextInt());
		System.out.print("Insira o Nome do Cliente -> ");
		ClienteX.setNome(entrada.next());
		
		System.out.print("\nInsira CPF e o Nome do Cabeleireiro que fará o serviço.\nAAA.BBB.CCC-DD -> ");
		String CPFX = entrada.next();
		System.out.print("Nome -> ");
		String NomeX = entrada.next();
		Cabeleireiro CabeleireiroX = new Cabeleireiro(CPFX, NomeX);
		System.out.print("Insira o ID do Cabeleireiro ->");
		CabeleireiroX.setId(entrada.nextInt());
		
		Serviço ServiçoX = new Serviço();
		
		Atendimento AtendimentoX = new Atendimento(ClienteX);
		Calendar dataX = Calendar.getInstance();
		AtendimentoX.setData(dataX);
		System.out.print("\nQuantos Serviços a Pessoa quer? -> ");
		int QuantdeServiços = entrada.nextInt();
		System.out.println("Quais?");
		System.out.println("S1 > Corte\nS2 > Lavagem\nS3 > Tintura");
		int Serv;
		for (int i = 0; i < QuantdeServiços; i++)
		{
			System.out.print((i+1) + "° Serviço - Serviço: ");
			Serv = entrada.nextInt();
			if (Serv == 1)
			{
				ServiçoX = Serviço1;
			}
			else if (Serv == 2)
			{
				ServiçoX = Serviço2;
			}
			else if (Serv == 3)
			{
				ServiçoX = Serviço3;
			}
			AtendimentoX.setListadeServiços(ServiçoX.getNome());
		}
		ServiçoX.setId(ClienteX.getId());
		AtendimentoX.setCabeleireiro(CabeleireiroX.getNome());
		
		Agendamento AgendamentoX = new Agendamento(ClienteX, CabeleireiroX);
		AgendamentoX.setId(ClienteX.getId());
		System.out.print("\nEm qual data ocorrerá o serviço?\nAno -> ");
		Calendar DataAgendamentoX = Calendar.getInstance();
		int Ano = entrada.nextInt();
		System.out.print("Mes -> ");
		int Mes = entrada.nextInt();
		System.out.print("Dia -> ");
		int Dia = entrada.nextInt();
		System.out.print("Em qual Horario?\nHora -> ");
		int Hora = entrada.nextInt();
		System.out.print("Minuto -> ");
		int Minuto = entrada.nextInt();
		DataAgendamentoX.set(Ano, Mes, Dia, Hora, Minuto);
		AgendamentoX.setData(DataAgendamentoX);
		AgendamentoX.setHora(DataAgendamentoX, Calendar.HOUR_OF_DAY);
		AgendamentoX.setMinuto(DataAgendamentoX, Calendar.MINUTE);
		
		entrada.close();
		
		System.out.println("\nClientes:");
		System.out.println(Cliente1.getNome() + " " + Cliente2.getNome() + " " + Cliente3.getNome() + " " + ClienteX.getNome());
		System.out.println("Cabeleireiros:");
		System.out.println(Cabeleireiro1.getNome() + " " + Cabeleireiro2.getNome() + " " + Cabeleireiro3.getNome() + " " + CabeleireiroX.getNome());
		System.out.println("Serviços");
		System.out.println(Serviço1.getNome() + " " + Serviço2.getNome() + " " + Serviço3.getNome());
		System.out.println("Atendimentos");
		System.out.println(Atendimento1.getData().getTime() + " " + Atendimento2.getData().getTime() + " " + Atendimento3.getData().getTime() + " " + AtendimentoX.getData().getTime());
	}
}
