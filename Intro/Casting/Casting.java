public class Casting{
    public static void main(String[] args){
        
        //double d = 3.1415;
        //int i = d; // não compila

        //double d = 5; // ok, o double pode conter um número inteiro
        //int i = d; // não compila

        //int i = 5; // COMPILA
        //double d2 = i; // COMPILA
        
        double d3 = 3.14;
        int	i =	(int) d3;

        System.out.println(d3);
        System.out.println(i);

    }
}
