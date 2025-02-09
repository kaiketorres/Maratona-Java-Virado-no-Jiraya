package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

   static {
        System.out.println("oi");
    }

    public void imprime(){
        System.out.println("-------------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidadeMaxima " + this.velocidadeMaxima);
        System.out.println("velocidadeLimite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){

        Carro.velocidadeLimite = velocidadeLimite;

    }

    public static double getVelocidadeLimite(){

         return velocidadeLimite;

    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
