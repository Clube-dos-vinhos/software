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
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_alunos");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConexao() {

        Connection connection = null;  //inst�ncia da conex�o

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost"; //caminho do MySQL
            String database = "db_alunos";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "rootpass";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: N�O CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos");
            while (res.next()) {

                String descri��o = res.getString("descri��o");
                int quantidade = res.getInt("quantidade");
                double pre�o = res.getDouble("pre�o");
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int datacadastro = res.getInt("datacadastro");

                Produto objeto = new Produto(descri��o, quantidade, pre�o, id, nome, datacadastro);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertAlunoBD(Produto objeto) {
        String sql = "INSERT INTO tb_alunos(id,nome,datacadastro,descri��o,quantidade,pre�o) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getDatacadastro());
            stmt.setString(4, objeto.getDescri��o());
            stmt.setInt(5, objeto.getQuantidade());
            stmt.setDouble(6, objeto.getPre�o());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteAlunoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_alunos WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateAlunoBD(Produto objeto) {

        String sql = "UPDATE tb_alunos set nome = ? ,datacadastro = ? ,descri��o = ? ,quantidade = ? ,pre�o =? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getDatacadastro());
            stmt.setString(3, objeto.getDescri��o());
            stmt.setInt(4, objeto.getQuantidade());
            stmt.setDouble(5, objeto.getPre�o());
            stmt.setInt(6, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Produto carregaAluno(int id) {

        Produto objeto = new Produto();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_alunos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setDatacadastro(res.getInt("data de cadastro"));
            objeto.setDescri��o(res.getString("descri��o"));
            objeto.setQuantidade(res.getInt("quantidade"));
            objeto.setPre�o(res.getDouble("pre�o"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}
