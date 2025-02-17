package academy.devdojo.maratonajava.javacore.seminario.test;

import academy.devdojo.maratonajava.javacore.seminario.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.seminario.dominio.Local;
import academy.devdojo.maratonajava.javacore.seminario.dominio.Professor;
import academy.devdojo.maratonajava.javacore.seminario.dominio.Seminario;

import java.util.Scanner;

public class GerenciadorDeSeminario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do seminario: ");
        String titulo = teclado.nextLine();

        Seminario seminario = new Seminario(titulo);

        System.out.print("Digite o endereco do seminarior: ");
        String endereco = teclado.nextLine();

        Local local = new Local(endereco);

        seminario.setLocal(local);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = teclado.nextInt();

        Estudante estudante = new Estudante(nomeAluno, idade);

        estudante.setSeminario(seminario);
        Estudante[] estudantes = new Estudante[3];
        estudantes[0] = estudante;
        System.out.println(estudantes[0].getNome());

        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = teclado.nextLine();

        System.out.print("Digite a especilidade do professor: ");
        String especialidade = teclado.nextLine();

        Professor professor = new Professor(nomeProfessor, especialidade);
        Seminario[] seminarios = new Seminario[3];
        seminarios[0] = seminario;


    }
}
