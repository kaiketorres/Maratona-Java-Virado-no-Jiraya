package academy.devdojo.maratonajava.javacore.seminario.dominio;

public class Seminario {

    private String tirulo;
    private Local local;

    public Seminario(String tirulo) {
        this.tirulo = tirulo;
    }

    public String getTirulo() {
        return tirulo;
    }

    public void setTirulo(String tirulo) {
        this.tirulo = tirulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
