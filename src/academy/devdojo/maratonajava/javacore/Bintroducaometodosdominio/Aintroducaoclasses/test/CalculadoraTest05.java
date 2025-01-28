package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int [] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgns(1,2,3,4,5,6,7);

    }
}
