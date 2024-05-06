package Model;

import java.util.*;
import DAO.BancoDAO;
import java.sql.SQLException;

public class Produto extends Informa��o {

    private String descri��o;
    private int quantidade;
    private double pre�o;
    private final BancoDAO dao;

    public Produto() {
        this.dao = new BancoDAO(); // inicializado n�o importa em qual construtor
    }

    public Produto(String descri��o, int quantidade, double pre�o) {
        this.descri��o = descri��o;
        this.quantidade = quantidade;
        this.pre�o = pre�o;
        this.dao = new BancoDAO(); // inicializado n�o importa em qual construtor
    }

    public Produto(String descri��o, int quantidade, double pre�o, int id, String nome, int datacadastro) {
        super(id, nome, datacadastro);
        this.descri��o = descri��o;
        this.quantidade = quantidade;
        this.pre�o = pre�o;
        this.dao = new BancoDAO(); // inicializado n�o importa em qual construtor
    }

    public String getDescri��o() {
        return descri��o;
    }

    public void setDescri��o(String descri��o) {
        this.descri��o = descri��o;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPre�o() {
        return pre�o;
    }

    public void setPre�o(double pre�o) {
        this.pre�o = pre�o;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Data de Cadastro: " + this.getDatacadastro()
                + "\n Descri��o: " + this.getDescri��o()
                + "\n Quantidade:" + this.getQuantidade()
                + "\n Pre�o:" + this.getPre�o()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
        //return AlunoDAO.MinhaLista;
        return dao.getMinhaLista();
    }

    public boolean InsertAlunoBD(String descri��o, int quantidade, double pre�o, String nome, int datacadastro) throws SQLException {
        int id = this.maiorID() + 1;
        Produto objeto = new Produto(descri��o, quantidade, pre�o, id, nome, datacadastro);

        dao.InsertAlunoBD(objeto);
        return true;

    }

    public boolean DeleteAlunoBD(int id) {

        dao.DeleteAlunoBD(id);
        return true;
    }

    public boolean UpdateAlunoBD(String descri��o, int quantidade, double pre�o, int id, String nome, int datacadastro) {
        Produto objeto = new Produto(descri��o, quantidade, pre�o, id, nome, datacadastro);

        dao.UpdateAlunoBD(objeto);
        return true;
    }

    public Produto carregaAluno(int id) {

        dao.carregaAluno(id);
        return null;
    }

    public int maiorID() throws SQLException {

        return dao.maiorID();
    }
}
