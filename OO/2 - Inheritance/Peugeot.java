public class Peugeot extends Carro{

    public Peugeot(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    public void ligarBluetooth(){
        System.out.println("Bluetooth ligado!");
    }

}