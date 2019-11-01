
public class Principal{

    public static void main(String[] args){

        Carro monza = new Carro("GM", "Monza", 1989);
        Carro peugeot = new Carro("Peugeot", "307", 2011);

        monza.ligar();
        peugeot.ligar();

        monza.desligar();
        peugeot.desligar();

        // Monza output
        String monzaMarca = monza.getMarca();
        String monzaModelo = monza.getModelo();
        int monzaAno = monza.getAno();

        System.out.println("--------------------------");
        System.out.println("Marca: " + monzaMarca);
        System.out.println("Modelo: " + monzaModelo);
        System.out.println("Ano: " + monzaAno);
        System.out.println("--------------------------");

        // Peugeot output
        String peugeotMarca = peugeot.getMarca();
        String peugeotModelo = peugeot.getModelo();
        int peugeotAno = peugeot.getAno();

        System.out.println("--------------------------");
        System.out.println("Marca: " + peugeotMarca);
        System.out.println("Modelo: " + peugeotModelo);
        System.out.println("Ano: " + peugeotAno);
        System.out.println("--------------------------");

    }

}