package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        
        System.out.println(calculadora.dividirDoisNumeros(12, 4));
        System.out.println(calculadora.dividirDoisNumeros02(12, 4));
        calculadora. imprimeDivisaoDeDoisNumeros(85, 5);

    }
}
