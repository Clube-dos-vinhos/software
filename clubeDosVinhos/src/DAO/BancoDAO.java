package DAO;

import Model.Vinho;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDAO {

    public static ArrayList<Vinho> MinhaLista = new ArrayList<Vinho>();

    public BancoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_vinho");
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
            String database = "db_vinho";
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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_vinho");
            while (res.next()) {
                
                
                String tipo = res.getString("tipo");
                String regiao = res.getString("região");
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String descricao = res.getString("descrição");
                int quant_estoque = res.getInt("quantidade");
                double preco = res.getDouble("preço");
                int data_cadastro = res.getInt("datacadastro");
                String marca = res.getString("marca");

                Vinho objeto = new Vinho(tipo,regiao,marca,id,nome,descricao,quant_estoque,preco,data_cadastro);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertVinhoBD(Vinho objeto) {
        String sql = "INSERT INTO tb_vinho(id,nome,descricao,quant_estoque,preco,data_cadastro,tipo,regiao,marca) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getDescricao());
            stmt.setInt(4, objeto.getQuant_estoque());
            stmt.setDouble(5, objeto.getPreco());
            stmt.setInt(6, objeto.getData_cadastro());
            stmt.setString(7, objeto.getTipo());
            stmt.setString(8, objeto.getRegiao());
            stmt.setString(9, objeto.getMarca());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteVinhoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_vinho WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateVinhoBD(Vinho objeto) {

        String sql = "UPDATE tb_vinho set nome = ? ,descricao = ? ,quant_estoque = ? ,preco =? ,data_cadastro = ? ,tipo = ? ,regiao = ? ,marca = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getDescricao());
            stmt.setInt(3, objeto.getQuant_estoque());
            stmt.setDouble(4, objeto.getPreco());
            stmt.setInt(5, objeto.getData_cadastro());
            stmt.setString(6, objeto.getTipo());
            stmt.setString(7, objeto.getRegiao());
            stmt.setInt(8, objeto.getId());
            stmt.setString(9, objeto.getMarca());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Vinho carregaVinho(int id) {

        Vinho objeto = new Vinho();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_vinho WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setDescricao(res.getString("descrição"));
            objeto.setQuant_estoque(res.getInt("quantidade"));
            objeto.setPreco(res.getDouble("preço"));
            objeto.setData_cadastro(res.getInt("data de cadastro"));
            objeto.setTipo(res.getString("tipo"));
            objeto.setRegiao(res.getString("região"));
            objeto.setMarca(res.getString("marca"));
            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}