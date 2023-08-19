package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //atributo
    private Map<String,Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome= null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 5665);
        agendaContato.adicionarContato("Camila Cavalcante", 11111111);
        agendaContato.adicionarContato("Camila DIO", 654987);
        agendaContato.adicionarContato("Maria Silva", 1111111);
        agendaContato.adicionarContato("Camila", 44444);

        agendaContato.exibirContato();
        agendaContato.removerContato("Maria Silva");
        agendaContato.exibirContato();

        System.out.println("O numero é: "+ agendaContato.pesquisarPorNome("Camila DIO"));

    }
}
