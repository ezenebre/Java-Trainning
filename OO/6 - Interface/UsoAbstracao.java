public class UsoAbstracao{

    private IRepositorio _repositorio;

    public UsoAbstracao(IRepositorio repositorio){
        _repositorio = repositorio;
    }

    public void processo(){
        _repositorio.adicionar();
    }

}