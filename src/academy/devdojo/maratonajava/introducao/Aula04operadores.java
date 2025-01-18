package academy.devdojo.maratonajava.introducao;

public class Aula04operadores {

    public static void main(String[] args) {

        // + - / *

        int numero01 = 30;

        int numero02 = 20;

        int soma = numero01 + numero02;

        int subtracao = numero01 - numero02;

        int multiplicacao = numero01 * numero02;

        int divisao = numero01 / numero02;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        // %

        int resto = 20 % 2;

        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;

        boolean isDezMenorQueVinte = 10 < 20;

        boolean isDezIgualQueVinte = 10 == 20;

        boolean isDezIgualQueDez= 10 == 10;

        boolean isDezDiferenteQueDez = 10 != 10;


        System.out.println("isDezMaiorQueVinte:" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte:" + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte:" + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez:" + isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez:" + isDezDiferenteQueDez);

        // && (AND) || (or) !

        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;

        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlastationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlastationCincoCompravel" + isPlastationCincoCompravel);


    }
}
