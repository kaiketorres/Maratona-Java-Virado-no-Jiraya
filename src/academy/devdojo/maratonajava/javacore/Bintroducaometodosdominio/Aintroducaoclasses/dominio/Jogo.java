package academy.devdojo.maratonajava.javacore.Bintroducaometodosdominio.Aintroducaoclasses.dominio;

public class Jogo {


    private String nomeJogo;
    private int classificacao;
    private float preco;


    public void setNomeJogo(String nome){
        this.nomeJogo = nome;
    }


    public void setClassificacao(int classificacao){
        this.classificacao = classificacao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    public void comprar(Pessoa01 pessoa01){

        if(pessoa01.getSaldo() < preco){
            System.out.println("Voce nao tem saldo suficiente");
        } else if(pessoa01.getIdade() < classificacao ){
            System.out.println("Voce deve estar dentro da classificao para poder compra este jogo");
        } else {
            pessoa01.setSaldo((pessoa01.getSaldo() - preco));
            System.out.println("Voce comprou o jogo " + nomeJogo + "muito obrigado"  );
            System.out.println(pessoa01.getSaldo());
        }

    }

}
