package Model;

import java.util.*;
import DAO.BancoDAO;
import java.sql.SQLException;

public class Produto extends Informação {

    private String descrição;
    private int quantidade;
    private double preço;
    private final BancoDAO dao;

    public Produto() {
        this.dao = new BancoDAO(); // inicializado não importa em qual construtor
    }

    public Produto(String descrição, int quantidade, double preço) {
        this.descrição = descrição;
        this.quantidade = quantidade;
        this.preço = preço;
        this.dao = new BancoDAO(); // inicializado não importa em qual construtor
    }

    public Produto(String descrição, int quantidade, double preço, int id, String nome, int datacadastro) {
        super(id, nome, datacadastro);
        this.descrição = descrição;
        this.quantidade = quantidade;
        this.preço = preço;
        this.dao = new BancoDAO(); // inicializado não importa em qual construtor
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Data de Cadastro: " + this.getDatacadastro()
                + "\n Descrição: " + this.getDescrição()
                + "\n Quantidade:" + this.getQuantidade()
                + "\n Preço:" + this.getPreço()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {

        return dao.getMinhaLista();
    }

    public boolean InsertProdutoBD(String descrição, int quantidade, double preço, String nome, int datacadastro) throws SQLException {
        int id = this.maiorID() + 1;
        Produto objeto = new Produto(descrição, quantidade, preço, id, nome, datacadastro);

        dao.InsertProdutoBD(objeto);
        return true;

    }

    public boolean DeleteProdutoBD(int id) {

        dao.DeleteProdutoBD(id);
        return true;
    }

    public boolean UpdateProdutoBD(String descrição, int quantidade, double preço, int id, String nome, int datacadastro) {
        Produto objeto = new Produto(descrição, quantidade, preço, id, nome, datacadastro);

        dao.UpdateProdutoBD(objeto);
        return true;
    }

    public Produto carregaProduto(int id) {

        dao.carregaProduto(id);
        return null;
    }

    public int maiorID() throws SQLException {

        return dao.maiorID();
    }
}
