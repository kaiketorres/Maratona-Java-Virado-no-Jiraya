package academy.devdojo.maratonajava.javacore.seminario.dominio;

public class Estudante {

    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudante(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
