package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String author, Integer anoPublicacao){
        livroList.add(new Livro(titulo, author, anoPublicacao));
    }

    public List<Livro> pesquisarPorAuthor(String author){
        List<Livro> livrosPorAuthor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAuthor().equalsIgnoreCase(author)){
                    livrosPorAuthor.add(l);
                }
            }
        }
        return livrosPorAuthor;
    }

    public List<Livro> pesquisaLivroPorAnoInicialAnoFinal(Integer anoInicial, Integer anoFinal){
        List<Livro> livrosPorIntervadoAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList ) {
                if (l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervadoAnos.add(l);
                }
            }
        }
        return livrosPorIntervadoAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
