public class Professor extends Pessoa{
    private String livro;

    public Professor(String nome, int matricula, String livro){
        super(nome, matricula);
        this.livro = livro;
    }
    public void saiLivros(){
        System.out.println(livro);
    }
    @Override
    public void quemSou(){
        System.out.println("Sou um professor");
    }
}