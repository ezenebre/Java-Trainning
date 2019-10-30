public class TesteInterfaceImplementacao{

    public static void main(String[] args){

        UsoImplementacao repoImp = new UsoImplementacao();
        repoImp.processo();

        UsoAbstracao repoAbs = new UsoAbstracao(new Repositorio());
        repoAbs.processo();

        UsoAbstracao repoAbsFake = new UsoAbstracao(new Repositorio());
        repoAbsFake.processo();

    }

}