package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo:");
        String nome = entrada.nextLine();

        System.out.println("Digite Sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo:");
        char sexo = entrada.next().charAt(0);

        System.out.println("Seu nome e " + nome + " voce tem " + idade + " anos e seu sexo e " + sexo);

    }
}
