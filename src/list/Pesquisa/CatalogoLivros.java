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
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
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

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Author 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Author 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2","Author 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3","Author 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4","Author 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAuthor("Author 2"));

        System.out.println(catalogoLivros.pesquisaLivroPorAnoInicialAnoFinal(2020,2022));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));



    }
}
