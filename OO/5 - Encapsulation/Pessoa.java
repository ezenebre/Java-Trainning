public class Pessoa{

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    protected void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    protected void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

}