public class Carro{

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void ligar(){
        System.out.println("Carro ligado");
    }

    public void desligar(){
        System.out.println("Carro desligado");
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }
}