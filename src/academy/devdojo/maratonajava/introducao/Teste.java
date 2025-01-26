package academy.devdojo.maratonajava.introducao;

public class Teste {
    public static void main(String[] args){


        String [] [] nomes = new String[3] [3];

        nomes[0][0] = "kaike";
        nomes[1][1] = "gustavo";
        nomes[2][2] = "thon";

        for (int i = 0; i < nomes.length ; i++) {
            for (int j = 0; j < nomes[2].length ; j++) {
                System.out.println(nomes[i][i]);
            }
        }

        System.out.println(nomes[2][2]);


    }
}
