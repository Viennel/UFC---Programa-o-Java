package lab1;

import java.util.ArrayList;

public class Agenda
{
	private ArrayList<Agendamento> Agen = new ArrayList<Agendamento>();
	
	public void setAgendamentos(ArrayList<Agendamento> Agendamentos) {
		Agen = Agendamentos;
	}
	public void addAgendamentos(Agendamento AG) {
		Agen.add(AG);
	}
	public ArrayList<Agendamento> getAgendamentos()
	{
		return Agen;
	}
}
