package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //atributos
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, Integer idade1, Double altura) {
        this.nome = nome;
        this.idade = idade1;
        this.altura = altura;
    }


    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alturta=" + altura +
                '}';
    }
}
