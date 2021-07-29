package Aplicacao;

import DTO.Aluno;
import funcoes.AlunoDao;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Nathan
 */
public class AplicacaoConsultar {

    public static void main(String[] args) {
        //Instancia os objetos que serão utilizados
        AlunoDao aDao = new AlunoDao();
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        //executa a listagem dos atributos do BD
        listaAlunos = aDao.consultarTodos();

        //organiza-os numa forma legível
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println(listaAlunos.get(i));
        }

    }

}
