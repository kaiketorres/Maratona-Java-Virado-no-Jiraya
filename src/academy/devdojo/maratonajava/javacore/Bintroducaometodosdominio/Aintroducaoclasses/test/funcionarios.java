package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio.Funcionario;

public class funcionarios {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Thon";
        funcionario.idade = 15;
        funcionario.salario = new int[]{1000,200,500};

        funcionario.imprime();
        funcionario.imprimeMedia();


    }
}
