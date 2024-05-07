package DAO;

import Model.Produto;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDAO {

    public static ArrayList<Produto> MinhaLista = new ArrayList<Produto>();

    public BancoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_produto");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConexao() {

        Connection connection = null;  //instância da conexão

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost"; //caminho do MySQL
            String database = "db_produto";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public ArrayList getMinhaLista() {

        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produto");
            while (res.next()) {

                String descrição = res.getString("descrição");
                int quantidade = res.getInt("quantidade");
                double preço = res.getDouble("preço");
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int datacadastro = res.getInt("datacadastro");

                Produto objeto = new Produto(descrição, quantidade, preço, id, nome, datacadastro);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertProdutoBD(Produto objeto) {
        String sql = "INSERT INTO tb_produto(id,nome,datacadastro,descrição,quantidade,preço) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getDatacadastro());
            stmt.setString(4, objeto.getDescrição());
            stmt.setInt(5, objeto.getQuantidade());
            stmt.setDouble(6, objeto.getPreço());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteProdutoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_produto WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateProdutoBD(Produto objeto) {

        String sql = "UPDATE tb_produto set nome = ? ,datacadastro = ? ,descrição = ? ,quantidade = ? ,preço =? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getDatacadastro());
            stmt.setString(3, objeto.getDescrição());
            stmt.setInt(4, objeto.getQuantidade());
            stmt.setDouble(5, objeto.getPreço());
            stmt.setInt(6, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Produto carregaProduto(int id) {

        Produto objeto = new Produto();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produto WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setDatacadastro(res.getInt("data de cadastro"));
            objeto.setDescrição(res.getString("descrição"));
            objeto.setQuantidade(res.getInt("quantidade"));
            objeto.setPreço(res.getDouble("preço"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}
