public class Pessoa {
    private String Nome;
    private int matricula;

    public Pessoa(String nome) {
        Nome = nome;
    }

    public Pessoa(String nome, int matricula) {
        Nome = nome;
        this.matricula = matricula;
    }

    public void falarNome(){
        System.out.println(Nome);
    }
    public void  quemSou(){
        System.out.println("Sou uma Pessoa");
    }
}