package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Time time01 = new Time("Seleção Brasileira");
        Time time02 = new Time("vascao");

        Jogador jogador1 = new Jogador("Pele", time01);

        jogador1.setTime(time02);

        jogador1.imprime();


    }
}
