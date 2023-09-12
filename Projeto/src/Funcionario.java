public class Funcionario extends Pessoa{
    private String departamento;

    public Funcionario(String nome, int matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }
    @Override
    public void quemSou(){
        System.out.println("Eu sou um funcionario");
    }
}
