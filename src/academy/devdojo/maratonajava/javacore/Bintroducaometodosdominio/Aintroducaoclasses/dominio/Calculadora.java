package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 20);
    }

    public void multiplicarDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double dividirDoisNumeros(double num1, double num2) {

        if (num2 == 0) {
            return 0;
        }

        return num1 / num2;

    }

    public double dividirDoisNumeros02(double num1, double num2) {

        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
            System.out.println(num1 / num2);

    }

    public  void alteraDoisNumeros(int num1,int num2){

        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }


    public void somaArray(int [] numeros){
        int soma = 0;

        for (int num: numeros){
            soma += num;
        }

        System.out.println(soma);


    }



    public  void somaVarArgns(int... numeros){
        int soma = 0;

        for (int num: numeros){
            soma += num;
        }

        System.out.println(soma);


    }

}
