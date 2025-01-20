package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerado 1 como domingo
        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
            default:
                System.out.println("Valor invalido");
        }

        char sexo = 'H';

        switch (sexo){
            case 'H':
                System.out.println("Homem");
                break;
            case 'M':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("invalido");
        }


    }
}
