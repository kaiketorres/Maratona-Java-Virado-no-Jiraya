package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio.Jogo;
import academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio.Pessoa01;

import java.util.Scanner;

public class Jogos {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do jogo:");
        String nomeJogo = teclado.nextLine();

        Jogo jogo = new Jogo();
        Pessoa01 pessoa = new Pessoa01();

        jogo.setNomeJogo(nomeJogo);
        jogo.setClassificacao(7);
        jogo.setPreco(100);

        pessoa.setSaldo(100);
        pessoa.setIdade(8);

        jogo.comprar(pessoa);


    }
}
