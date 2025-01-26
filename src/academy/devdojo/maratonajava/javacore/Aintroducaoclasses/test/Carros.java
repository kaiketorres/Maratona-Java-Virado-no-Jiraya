package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carros {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Argo";
        carro1.moledo = "fiat";
        carro1.ano = 2017;

        carro1 = carro2;
        carro2.nome = "Mustang";
        carro2.moledo = "fiat";
        carro2.ano = 2003;


        System.out.println("Carro:" + carro1.nome + " Modelo:" + carro1.moledo + " Ano:" + carro1.ano);

        System.out.println("Carro:" + carro2.nome + " Modelo:" + carro2.moledo + " Ano:" + carro2.ano);

    }
}
