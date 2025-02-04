package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite = 250;


    public void imprime(){
        System.out.println("-------------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidadeMaxima " + this.velocidadeMaxima);
        System.out.println("velocidadeLimite " + this.velocidadeLimite);
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

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
