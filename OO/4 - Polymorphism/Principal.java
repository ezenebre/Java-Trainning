public class Principal{
    
    public static void main(String[] args){
        
        Monza monza = new Monza("GM", "Monza", 1989);
        Peugeot peugeot = new Peugeot("Peugeot", "307", 2011);

        monza.getOutput();
        monza.ligar();

        peugeot.getOutput();  
        peugeot.ligar();

     }
}

 