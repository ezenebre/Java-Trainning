public abstract class Carro{

    protected String marca;
    protected String modelo;
    protected int ano;

    protected Carro(String marca, String modelo, int ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void ligar(){
        System.out.println("Carro ligado");
    }

    public void desligar(){
        System.out.println("Carro ligado");
    }

    public abstract String getMarca();

    public abstract String getModelo();

    public abstract int getAno();

    public void getOutput(){

        System.out.println("--------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("--------------------------");
        
    }
}