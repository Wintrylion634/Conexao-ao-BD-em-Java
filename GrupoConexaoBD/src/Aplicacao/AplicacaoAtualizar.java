package Aplicacao;

import DTO.Aluno;
import funcoes.AlunoDao;

/*
 * @author Nathan
 */
public class AplicacaoAtualizar {

    public static void main(String[] args) {
        //instancia os objetos Aluno e AlunoDao
        Aluno a = new Aluno();
        AlunoDao aDao = new AlunoDao();

        //seta os valores para a atualização
        a.setNome_aluno("Natália");
        a.setEmail_aluno("natalia@gmail.com");
        a.setTelefone_aluno("11978578514");
        a.setSexo_aluno("Feminino");
        a.setIdade_aluno(20);
        a.setCurso_aluno("Nutrição");
        a.setSenha_aluno("natalia1111");
        a.setId_aluno(2);

        //executa a atualização
        aDao.atualizarAlunos(a, 2);

    }

}
