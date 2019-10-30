public class Monza extends Carro{

    public Monza(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    public void puxarAfogador(){
        System.out.println("Afogador puxado!");
    }

}