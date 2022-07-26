/*  Verifica se o banco de dados já existe e em caso positivo, deleta.   */
DROP DATABASE IF EXISTS tudoounada;
/*  Cria o Banco de Dados "tudoounada".  */
CREATE DATABASE tudoounada;
/*Usa o banco criado*/
USE tudoounada;
/*Cria a tabela "usuario".*/
CREATE TABLE usuario (
	id_usuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	email VARCHAR(30) NOT NULL,
	whatsapp VARCHAR(20) NOT NULL,
	professor VARCHAR(8) NOT NULL
);
/*Cria a tabela "curso".*/
CREATE TABLE curso (
	id_curso INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(30) NOT NULL,
	assunto VARCHAR(50) NOT NULL,
	descricao VARCHAR(200) NOT NULL,
	conteudo VARCHAR(100) NOT NULL
);
/*Cria a tabela "aula".*/
CREATE TABLE aula (
	id_aula INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	video VARCHAR(200) NOT NULL,
	texto VARCHAR(200) NOT NULL,
	exercicio VARCHAR(50) NOT NULL	
);
/*Cria a tabela de relacionamento usuario X curso, matricula*/
CREATE TABLE matricula(
    fk_id_usuario_matricula INT NOT NULL,
	fk_id_curso_matricula   INT NOT NULL,
  	  CONSTRAINT PRIMARY KEY (fk_id_usuario_matricula, fk_id_curso_matricula),	 
	  CONSTRAINT fk_id_usuario_matricula FOREIGN KEY (fk_id_usuario_matricula)
	  REFERENCES usuario (id_usuario),
	  CONSTRAINT fk_id_curso_matricula FOREIGN KEY (fk_id_curso_matricula)
	  REFERENCES curso (id_curso)
);
/*Cria a tabela de relacinamento curso X aula, grade*/
CREATE TABLE grade
(
  
  fk_id_curso_grade  INT NOT NULL,
  fk_id_aula_grade    INT NOT NULL,
  
	  CONSTRAINT pk_grade PRIMARY KEY (fk_id_curso_grade,fk_id_aula_grade),
	  CONSTRAINT fk_id_curso_grade FOREIGN KEY (fk_id_curso_grade)
	  REFERENCES curso (id_curso),
	  CONSTRAINT fk_id_aula_grade FOREIGN KEY (fk_id_aula_grade)
	  REFERENCES aula (id_aula)
);


/*TODO: Faremos posteriomente as demais querys*/