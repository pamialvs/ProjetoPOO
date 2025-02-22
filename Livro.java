public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private int ano;

    // Construtor para inicializar os atributos
    public Livro(String titulo, String autor, String genero, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
    }

    // Getters e Setters (opcionais, mas úteis se for necessário alterar os dados)
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    // Método para exibir as informações do livro
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Gênero: " + genero + ", Ano: " + ano;
    }
}
