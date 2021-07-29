package DTO;

public class Aluno {

    //declaração dos atributos
    private int id_aluno;
    private String nome_aluno;
    private String email_aluno;
    private String telefone_aluno;
    private String sexo_aluno;
    private int idade_aluno;
    private String curso_aluno;
    private String senha_aluno;

    //getters e setters
    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getEmail_aluno() {
        return email_aluno;
    }

    public void setEmail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }

    public String getTelefone_aluno() {
        return telefone_aluno;
    }

    public void setTelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public String getSexo_aluno() {
        return sexo_aluno;
    }

    public void setSexo_aluno(String sexo_aluno) {
        this.sexo_aluno = sexo_aluno;
    }

    public int getIdade_aluno() {
        return idade_aluno;
    }

    public void setIdade_aluno(int idade_aluno) {
        this.idade_aluno = idade_aluno;
    }

    public String getCurso_aluno() {
        return curso_aluno;
    }

    public void setCurso_aluno(String curso_aluno) {
        this.curso_aluno = curso_aluno;
    }

    public String getSenha_aluno() {
        return senha_aluno;
    }

    public void setSenha_aluno(String senha_aluno) {
        this.senha_aluno = senha_aluno;
    }

    //Sobrecarga do metodo toString() para funcionar ometodo consultarTodos()
    @Override
    public String toString() {
        return getId_aluno() + " | " + getNome_aluno() + " | " + getEmail_aluno() + " | " + getTelefone_aluno() + " | " + getSexo_aluno() + " | " + getIdade_aluno() + " | " + getCurso_aluno() + " | " + getSenha_aluno();
    }

}
