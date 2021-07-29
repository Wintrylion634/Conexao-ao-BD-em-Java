package funcoes;

import DTO.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Nathan
 */
public class AlunoDao {

    //setar comandos SQL
    public static final String INSERT_ALUNO = " INSERT INTO Aluno (id_aluno, nome_aluno, email_aluno, telefone_aluno, sexo_aluno, idade_aluno, curso_aluno, senha_aluno) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String SELECT_ALUNO = " SELECT * FROM Aluno";
    public static final String DELETE_ALUNO_POR_ID = " DELETE FROM Aluno WHERE id_aluno = ?";
    public static final String UPDATE_ALUNO_POR_ID = " UPDATE Aluno SET nome_aluno = ?, email_aluno = ?, telefone_aluno = ?, sexo_aluno = ?, idade_aluno = ?, curso_aluno = ?, senha_aluno = ? WHERE id_aluno = ?";

    //metodo para cadastrar os alunos
    public void cadastrarAlunos(Aluno aluno) {

        //abertura da conexão com o BD e a preparação do stmt        
        Connection conn = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            //preparo do stmt com o comando correto
            stmt = conn.prepareStatement(INSERT_ALUNO);

            //resgatando cada atributo do BD
            stmt.setInt(1, aluno.getId_aluno());
            stmt.setString(2, aluno.getNome_aluno());
            stmt.setString(3, aluno.getEmail_aluno());
            stmt.setString(4, aluno.getTelefone_aluno());
            stmt.setString(5, aluno.getSexo_aluno());
            stmt.setInt(6, aluno.getIdade_aluno());
            stmt.setString(7, aluno.getCurso_aluno());
            stmt.setString(8, aluno.getSenha_aluno());

            //aplicando as alterações
            stmt.executeUpdate();

            //mensagem de sucesso
            System.out.println("Registro inserido com sucesso");

        } catch (SQLException ex) {
            //mensagem de erro
            System.out.println("Erro, inserção não realizada");
        } finally {
            //fechando a conexão
            Conexao.fecharConexao((java.sql.Connection) conn, stmt);
        }
    }

    //metodo para deletar alunos
    public void deletarAlunos(int id_aluno) {
        //abertura da conexão com o BD e a preparação do stmt        
        Connection conn = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            //preparo do stmt com o comando correto
            stmt = conn.prepareStatement(DELETE_ALUNO_POR_ID);

            //resgatando cada atributo do BD
            stmt.setInt(1, id_aluno);

            //aplicando as alterações
            stmt.executeUpdate();

            //mensagem de sucesso
            System.out.println("Registro removido com sucesso");

        } catch (SQLException ex) {
            //mensagem de erro
            System.out.println("Erro, remoção não realizada");
        } finally {
            //fechando a conexão
            Conexao.fecharConexao((java.sql.Connection) conn, stmt);
        }
    }

    //metodo para atualizar alunos
    public void atualizarAlunos(Aluno aluno, int id_aluno) {

        //abertura da conexão com o BD e a preparação do stmt        
        Connection conn = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {

            //preparo do stmt com o comando correto
            stmt = conn.prepareStatement(UPDATE_ALUNO_POR_ID);

            //resgatando cada atributo do BD
            stmt.setString(1, aluno.getNome_aluno());
            stmt.setString(2, aluno.getEmail_aluno());
            stmt.setString(3, aluno.getTelefone_aluno());
            stmt.setString(4, aluno.getSexo_aluno());
            stmt.setInt(5, aluno.getIdade_aluno());
            stmt.setString(6, aluno.getCurso_aluno());
            stmt.setString(7, aluno.getSenha_aluno());
            stmt.setInt(8, aluno.getId_aluno());

            //aplicando as alterações
            stmt.executeUpdate();

            System.out.println("Registro atualizado com sucesso");

        } catch (SQLException ex) {
            //mensagem de erro
            System.out.println("Erro, Atualização não realizada");
        } finally {
            //fechando a conexão
            Conexao.fecharConexao((java.sql.Connection) conn, stmt);
        }
    }

    //metodo consulta todos os alunos
    public List<Aluno> consultarTodos() {
        //utiliza o list e arraylist para irganizá-los
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        //abertura da conexão com o BD, preparação do stmt e do resultset
        Connection conn = Conexao.getConexao();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            //preparo do stmt com o comando correto
            stmt = conn.prepareStatement(SELECT_ALUNO);

            // executa a query do result set
            rs = stmt.executeQuery();

            //trata os result set da maneira correta
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setNome_aluno(rs.getString("nome_aluno"));
                aluno.setEmail_aluno(rs.getString("email_aluno"));
                aluno.setTelefone_aluno(rs.getString("telefone_aluno"));
                aluno.setSexo_aluno(rs.getString("sexo_aluno"));
                aluno.setIdade_aluno(rs.getInt("idade_aluno"));
                aluno.setCurso_aluno(rs.getString("curso_aluno"));
                aluno.setSenha_aluno(rs.getString("senha_aluno"));

                //lista dos result sets
                listaAlunos.add(aluno);
            }

        } catch (SQLException ex) {
            //mensagem de erro
            System.out.println("Erro, consulta não realizada");
        } finally {
            //fechando a conexão
            Conexao.fecharConexao((com.mysql.jdbc.Connection) conn, stmt, rs);
        }

        //retorna a lista organizada
        return listaAlunos;
    }

}
