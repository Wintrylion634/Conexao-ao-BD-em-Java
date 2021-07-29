package Aplicacao;

import DTO.Aluno;
import funcoes.AlunoDao;

/*
 * @author Nathan
 */
public class AplicacaoCadastro {

    public static void main(String[] args) {
        //instancia os objetos que vão ser usados
        Aluno a = new Aluno();
        AlunoDao aDao = new AlunoDao();

        //seta os valores para o cadastro
        a.setNome_aluno("Nathan");
        a.setEmail_aluno("nathan@gmail.com");
        a.setTelefone_aluno("11978578514");
        a.setSexo_aluno("Masculino");
        a.setIdade_aluno(28);
        a.setCurso_aluno("Informática");
        a.setSenha_aluno("nathan0001");

        //executa o cadastro no BD
        aDao.cadastrarAlunos(a);

    }

}
