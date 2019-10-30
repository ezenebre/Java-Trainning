public class Peugeot extends Carro{

    public Peugeot(String marca, String modelo, int ano){
        super(marca, modelo, ano);
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

    public void ligarBluetooth(){
        System.out.println("Bluetooth ligado!");
    }

}