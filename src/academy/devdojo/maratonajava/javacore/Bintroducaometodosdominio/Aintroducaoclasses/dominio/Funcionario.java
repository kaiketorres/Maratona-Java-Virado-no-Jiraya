package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public int [] salario ;

    public void imprime(){

        System.out.println(nome);
        System.out.println(idade);


    }

    public void imprimeMedia(){

        int resultado = 0;

        for (int i = 0; i < salario.length ; i++) {
            resultado =+ salario[i];
        }

        resultado /= salario.length;

        System.out.println(resultado);

    }

}
