package list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String author;
    private Integer anoPublicacao;

    public Livro(String titulo, String author, Integer anoPublicacao) {
        this.titulo = titulo;
        this.author = author;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "titulo= " + titulo + ", author= " + author + ", Publicacao= " + anoPublicacao ;
    }
}
