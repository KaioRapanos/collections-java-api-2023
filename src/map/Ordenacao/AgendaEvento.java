package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    //atributo
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data,evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }
    public void obterProximoEvento(){
        //Set<LocalDate dateSet = eventoMap.keySet();
        //Collection<Evento> values = eventoMap.values();
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate,Evento> entry: eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: "+ entry.getValue()+" acontecera na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.JULY,15),"Evento 1","Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2023, Month.AUGUST,20),"Evento 2","Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2023, Month.AUGUST,22),"Evento 3","Atração 3");
        agendaEvento.adicionarEvento(LocalDate.of(2005, Month.AUGUST,22),"Evento 3","Atração 3");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();

    }
}
