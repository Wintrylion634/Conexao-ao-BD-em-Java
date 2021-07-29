package Aplicacao;

import funcoes.AlunoDao;

/*
 * @author Nathan
 */
public class AplicacaoDeletar {

    public static void main(String[] args) {
        //instancia o objeto usado
        AlunoDao aDao = new AlunoDao();

        //executa a exclusão
        aDao.deletarAlunos(1);
    }

}
