package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {

    private String nome;
    private static int[] episodios = new int[5];

    static {
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }

        for(int episodios : episodios){
            System.out.println("Episodio:" + episodios);
        }
    }


}
