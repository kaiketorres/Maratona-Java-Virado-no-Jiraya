package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        // Utilizando switch Dados os valore de 1 a 7 , imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 3;

        String categoria;

        switch (dia){
            case 1:
                categoria = "Domingo";
                break;
            case 2:
                categoria = "Segunda";
                break;
            case 3:
                categoria = "Terça";
                break;
            case 4:
                categoria = "Quarta";
                break;
            case 5:
                categoria = "Quinta";
                break;
            case 6:
                categoria = "Sexta";
                break;
            case 7:
                categoria = "Sabado";
                break;
            default:
                categoria = "Valor invalido";
        }
        System.out.println(categoria);
    }
}
