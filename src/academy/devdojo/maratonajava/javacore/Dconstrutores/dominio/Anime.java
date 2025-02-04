package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private int anoLancamento;
    private int ovas;

    public Anime(String nome, String tipo, int episodios,String genero){

        this(nome, tipo, episodios, genero, 2003);

    }

    public Anime(String nome, String tipo, int episodios,String genero, int anoLancamento ){

        this(nome, tipo, episodios, genero, anoLancamento, 2);

    }

    public Anime(String nome, String tipo, int episodios,String genero, int anoLancamento, int ovas ){

        this.nome =  nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.ovas = ovas;

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.anoLancamento);
        System.out.println(this.ovas);
    }

    public void init(String nome, String tipo, int episodios){

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    public void init(String nome, String tipo, int episodios,String genero){

        this.init(nome, tipo, episodios);

        this.genero = genero;

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }
}
