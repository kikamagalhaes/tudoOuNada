/*==============================


/*  Verifica se o banco de dados já existe e em caso positivo, deleta.   */
DROP DATABASE IF EXISTS tudoounada;

/*  Cria o Banco de Dados "tudoounada".  */
CREATE DATABASE tudoounada;

/*
=========================

Cria a tabela "usuario".

=========================
*/

CREATE TABLE tudoounada.usuario (
	id_usuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	email VARCHAR(30) NOT NULL,
	whatsapp VARCHAR(20) NOT NULL,
	professor VARCHAR(8) NOT NULL
);

/*
================================

Cria a tabela "curso".

================================
*/

CREATE TABLE tudoounada.curso (
	id_curso INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(30) NOT NULL,
	assunto VARCHAR(50) NOT NULL,
	descricao VARCHAR(200) NOT NULL,
	conteudo VARCHAR(100) NOT NULL,
	
	fk_id_usuario INT NOT NULL,
	FOREIGN KEY (fk_id_usuario) REFERENCES usuario(id_usuario)
);


/*
=======================

Cria a tabela "aula".

=======================
*/

CREATE TABLE tudoounada.aula (
	id_aula INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	video VARCHAR(200) NOT NULL,
	texto VARCHAR(200) NOT NULL,
	exercicio VARCHAR(50) NOT NULL,
	
	fk_id_curso INT NOT NULL,
	FOREIGN KEY (fk_id_curso) REFERENCES curso(id_curso)
	
);

CREATE TABLE tudoounada.matricula
(
    fk_id_usuario INT NOT NULL,
  fk_id_curso   INT NOT NULL
  	  
  	  CONSTRAINT pk_matricula PRIMARY KEY (fk_id_usuario, fk_id_curso),	 
	  CONSTRAINT fk_id_usuario_id_usuario FOREIGN KEY (id_usuario)
	  REFERENCES usuario (id_usuario),
	  CONSTRAINT fk_id_curso_id_curso FOREIGN KEY (id_curso)
	  REFERENCES curso (id_curso)
);

CREATE TABLE tudoounada.grade
(
  
  fk_id_curso   INT NOT NULL,
  fk_id_aula     INT NOT NULL
  
  CONSTRAINT pk_grade PRIMARY KEY (fk_id_curso,fk_id_aula),
  CONSTRAINT fk_id_curso_id_curso FOREIGN KEY (id_curso)
  REFERENCES curso (id_curso),
  CONSTRAINT fk_id_aula_id_curso FOREIGN KEY (id_aula)
  REFERENCES aula (id_aula)
)



/* * * * * * * * * * * * * * * *  
 * INSERE OS DADOS NAS TABELAS *
 * * * * * * * * * * * * * * * */


/*  Insere os três primeiros registros na tabela "clientes".  */

INSERT INTO tudoounada.usuario (nome, email, whatsapp, professor)
	VALUES
		('Nome 1','nome@email.com','11-84785-8765','false'),
		('Nome 2','nome@email.com','11-84785-8765','false'),
		('Nome 3','nome@email.com','11-84785-8765','false');

INSERT INTO tudoounada.curso (titulo, assunto, descricao, conteudo, professor, fk_id_usuario)
	VALUES
		('nome do curso','assunto do curso','resumo do que será abordado', 'link do pdf com o índice das aulas', 'nome do professor', '1'),
		('nome do curso','assunto do curso','resumo do que será abordado', 'link do pdf com o índice das aulas', 'nome do professor', '1'),
		('nome do curso','assunto do curso','resumo do que será abordado', 'link do pdf com o índice das aulas', 'nome do professor', '1');

INSERT INTO tudoounada.aula (video, texto, exercicio, fk_id_curso)
	VALUES
		('link do video','link do pdf','link do formulário','1'),
		('link do video','link do pdf','link do formulário','1'),
		('link do video','link do pdf','link do formulário','1'),
		('link do video','link do pdf','link do formulário','1'),
		('link do video','link do pdf','link do formulário','1');



/* * * * * * * * * * * * * * * * * * * * * *  
 * EXIBE AS TABELAS COM OS DADOS INSERIDOS *
 * * * * * * * ** * * * * * * * * * ** * * */

SELECT * from tudoounada.usuario;

SELECT * from tudoounada.aula;

SELECT * from tudoounada.curso;



/* * * * * * * * * * * * * * * * * * * * * *  
 *                FIM                      *
 * * * * * * * ** * * * * * * * * * ** * * */
