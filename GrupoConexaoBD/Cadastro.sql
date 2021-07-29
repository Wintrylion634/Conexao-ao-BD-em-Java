drop database if exists Cadastro;
Create database Cadastro;

Use Cadastro;

Create table Aluno(
id_aluno int not null auto_increment,
nome_aluno varchar(30),
email_aluno varchar(60),
telefone_aluno varchar(11),
sexo_aluno varchar(10),
idade_aluno int(5),
curso_aluno varchar(20),
senha_aluno varchar(20)
);

Create table Professor(
id_professor int not null auto_increment,
nome_professor varchar(30),
idade_professor int(3),
email_professor varchar(60),
curso_professor varchar(20),
sexo_professor varchar(10),
telefone_professor varchar(11),
senha_professor varchar(20)
);

insert into Aluno (nome_aluno, email_aluno, telefone_aluno, sexo_aluno, idade_aluno, curso_aluno, senha_aluno) values ( "João Pinto", "joãopinto123@gmail.com", "11941736903", "Masculino", "25", "História", '123456789');
insert into Professor (nome_professor, idade_professor, email_professor, curso_professor, sexo_professor, telefone_professor, senha_professor) values ( "Marcelo Moraes", "42", "marcelo.educacao887@gmail.com", "Português", "Masculino", "16978564478", '123456789');
