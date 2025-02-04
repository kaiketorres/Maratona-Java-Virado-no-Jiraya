package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodios = new int[100];

    {
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }

        for(int episodios :this.episodios){
            System.out.println("Episodio:" + episodios);
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }

        for(int episodios :this.episodios){
            System.out.println("Episodio:" + episodios);
        }

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
