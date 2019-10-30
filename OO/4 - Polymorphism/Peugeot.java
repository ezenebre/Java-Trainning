public class Peugeot extends Carro{

    public Peugeot(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void ligar(){
        System.out.println("Girar a chave");
        System.out.println("Aguardar Oil OK");
        System.out.println("Partida");
        System.out.println("Carro ligado");
        this.ligarBluetooth();
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
        System.out.println("Dá pro gasto...");
        System.out.println("--------------------------");
        
    }

    public void ligarBluetooth(){
        System.out.println("Bluetooth ligado!");
    }

}