public class Principal{
    
    public static void main(String[] args){
        
        Monza monza = new Monza("GM", "Monza", 1989);
        Peugeot peugeot = new Peugeot("Peugeot", "307", 2011);

        monza.getOutput();
        peugeot.getOutput();

        monza.puxarAfogador();
        peugeot.ligarBluetooth();

        //Carro carroGenerico = new Carro("Generico", "Generico", 2019);

    }
}

 