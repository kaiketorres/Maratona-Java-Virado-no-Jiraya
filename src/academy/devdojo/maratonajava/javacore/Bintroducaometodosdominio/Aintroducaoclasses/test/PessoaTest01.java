package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(21);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());


    }
}
