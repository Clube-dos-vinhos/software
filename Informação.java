package Model;

public abstract class Informa��o {

    private int id;
    private String nome;
    private int datacadastro;

    public Informa��o() {
    }

    public Informa��o(int id, String nome, int datacadastro) {
        this.id = id;
        this.nome = nome;
        this.datacadastro = datacadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(int datacadastro) {
        this.datacadastro = datacadastro;
    }

}
