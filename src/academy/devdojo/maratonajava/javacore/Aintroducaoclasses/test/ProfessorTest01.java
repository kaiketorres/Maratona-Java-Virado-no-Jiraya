package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "thon";
        professor.idade = 15;
        professor.sexo = 'M';

        System.out.println("Nome do prefessor: " + professor.nome + "\nidade do professor: " + professor.idade + " anos");

    }
}
