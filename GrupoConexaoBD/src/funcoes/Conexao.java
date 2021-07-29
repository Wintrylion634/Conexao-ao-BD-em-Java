package funcoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    // setar driver, url, usuário e senha do banco de dados utilizado
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    //estabelecer a conexão com o banco de dados
    public static Connection getConexao() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("ERRO, Falha na conexão", ex);
        }
        return conn;
    }

    //fecha a conexão somente do parâmetro "conn" 
    public static void fecharConexao(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //fecha a conexão do parâmetro "conn" e "stnt"
    public static void fecharConexao(Connection conn, PreparedStatement stnt) {
        fecharConexao(conn);
        try {

            if (stnt != null) {
                stnt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //fecha a conexão do parâmetro conn, stnt e rs
    public static void fecharConexao(Connection conn, PreparedStatement stnt, ResultSet rs) {
        fecharConexao(conn, stnt);
        try {

            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
