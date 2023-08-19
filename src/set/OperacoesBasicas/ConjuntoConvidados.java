package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, Integer codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(Integer codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet) {
            if (Objects.equals(c.getCodigoConvite(), codigoConvite)){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("nome 1",1234);
        conjuntoConvidados.adicionarConvidado("nome 2",1235);
        conjuntoConvidados.adicionarConvidado("nome 3",1236);
        conjuntoConvidados.adicionarConvidado("nome 4",1237);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
