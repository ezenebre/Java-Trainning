public class Monza extends Carro{

    public Monza(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void ligar(){
        this.puxarAfogador();
        System.out.println("Três bombadas no acelerador");
        System.out.println("Girar a chave");
        System.out.println("Carro ligado");
    }

    @Override
    public String getMarca(){
        return super.marca;
    }

    @Override
    public String getModelo(){
        return super.modelo;
    }

    @Override
    public int getAno(){
        return super.ano;
    }

    @Override
    public void getOutput(){

        System.out.println("--------------------------");
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + super.modelo);
        System.out.println("Ano: " + super.ano);
        System.out.println("É velho...");
        System.out.println("--------------------------");
        
    }

    public void puxarAfogador(){
        System.out.println("Afogador puxado!");
    }

}