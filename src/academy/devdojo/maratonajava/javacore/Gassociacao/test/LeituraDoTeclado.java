package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua pergunta e eu responderei sim ou não");

        String pergunta = teclado.nextLine();

        if(pergunta.charAt(2) == 'a'){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
