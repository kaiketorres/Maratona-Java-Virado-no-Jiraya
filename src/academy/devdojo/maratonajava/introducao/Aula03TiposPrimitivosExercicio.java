package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {

    /* Texto do exercício:

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

     */

    public static void main(String[] args){

        String nome = "kaike";

        String endereco = "Rua pomba do cabo";

        double salario = 5431.12;

        String dataRecebimento = "20/03/2025";

        String relatorio = "Eu " + nome +", morando no endereço " + endereco +", confirmo que recebi o salário de " + salario +", na data " + dataRecebimento +".";


        System.out.println(relatorio);
    }
}
