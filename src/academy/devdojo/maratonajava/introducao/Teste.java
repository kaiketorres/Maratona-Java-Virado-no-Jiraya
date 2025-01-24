package academy.devdojo.maratonajava.introducao;

public class Teste {
    public static void main(String[] args){


        String [] nomes = new String[3];

        nomes[0] = "mario";
        nomes[1] = "lucas";
        nomes[2] = "kaike";

        for (int i = 0; i < nomes.length; i++ ){
            System.out.println(nomes[i]);
        }

        for(String i :nomes){
            System.out.println(i);
        }



    }
}
