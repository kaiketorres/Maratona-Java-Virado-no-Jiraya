package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {


/* se renda for menor que 38097, taxa 9.32%
    se renda for maior ou igual a 38098 e menor que 75517, taxa 36.97%

    se renda for maior ou igual a 75518, taxa 49.50% */

        float renda = 40000F;

        float taxa;

        if (renda < 38098) {

            taxa = 9.32F;

        } else if (renda >= 38098 && renda < 75518) {

            taxa = 36.97F;

        } else {

            taxa = 49.50F;

        }

        float resultado = renda * (taxa / 100);

        System.out.println("A taxa é " + taxa + " e o valor a ser pago é " + resultado);



    }
}
