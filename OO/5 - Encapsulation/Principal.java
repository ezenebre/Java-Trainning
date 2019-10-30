public class Principal{

    public static void main(String[] args){

        Funcionario func = new Funcionario("Eduardo", 28, "Developer");

        System.out.println(func.getNome());
        System.out.println(func.getIdade());
        System.out.println(func.getCargo());

        func.changeIdade(30);

        System.out.println(func.getNome());
        System.out.println(func.getIdade());
        System.out.println(func.getCargo());

        Pessoa people = new Pessoa("Zé", 40);

        System.out.println(people.getNome());
        System.out.println(people.getIdade());

        people.setIdade(45);

        System.out.println(people.getNome());
        System.out.println(people.getIdade());

        
    }
}