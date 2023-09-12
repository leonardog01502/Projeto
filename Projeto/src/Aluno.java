public class Aluno extends Pessoa{
    private float nota;

    public Aluno(String nome, int matricula, float nota){
        super(nome, matricula);
        this.nota = nota;
    }
    @Override
    public void quemSou(){
        System.out.println("Sou um Aluno");
    }
}
