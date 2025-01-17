package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){

        // int, double, float, char, byte, short, long, boolean

        int idade = (int) 10000000000L;

        long numeroGrande = (long) 155.32;

        double salarioDouble = 2000D;

        float salarioFloat = (float) 2500.0D;

        byte idadeByte = 127;

        short idadeShort = 15;

        boolean verdadeiro = true;

        boolean falso = false;

        char caractere = 65 ;

        String nome = "kaike";

        System.out.println("A idade e " + idade + "anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é" + nome);
    }
}
