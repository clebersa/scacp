SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- Comandos personalizados para definir usuário
create user if not exists 'scacp'@'localhost' identified by '123456';
grant all on scacp.* to 'scacp'@'localhost';


DROP SCHEMA IF EXISTS `scacp` ;
CREATE SCHEMA IF NOT EXISTS `scacp` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;
USE `scacp` ;

-- -----------------------------------------------------
-- Table `scacp`.`provas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `scacp`.`provas` ;

CREATE  TABLE IF NOT EXISTS `scacp`.`provas` (
  `id_prova` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Atributo identificador da prova' ,
  `nome` VARCHAR(45) NOT NULL COMMENT 'Nome breve utilizado para identificar uma prova.\\nExemplo: \\\'vestibular UFG 2012/1\\\'.' ,
  `tipo` INT UNSIGNED NOT NULL COMMENT 'Tipo da prova onde:\\n0 - Prova de múltipla escolha,\\n1 - Prova do tipo verdadeiro ou falso.' ,
  `quantidade_questoes` INT UNSIGNED NOT NULL COMMENT 'Quantidade de questões da prova, sempre múltipla de 10, sendo o mínimo 10 e o máximo 100.' ,
  `pontuacao_minima` DOUBLE NOT NULL COMMENT 'Menor pontuação possível de ser associada a um cartão de provas já corrigido.' ,
  `pontuacao_maxima` DOUBLE NOT NULL COMMENT 'Maior pontuação possível de ser associada a um cartão de provas já corrigido.\\n' ,
  `precisao_pontuacao` INT UNSIGNED NOT NULL COMMENT 'Quantidade de casas decimais com que a pontuação aferida a um cartão de prova corrigido será aferido.\\nPode ser 0 (zero), 1 (uma) ou 2 (duas) casas decimais, empregando-se o sistema de arredondamento com a pontuação sendo calculada com três casas decimais  /* comment truncated */' ,
  `incidencia_penalizacao` TINYINT(1) NOT NULL ,
  `proporcao_penalizacao` INT UNSIGNED NULL ,
  `gabarito` VARCHAR(100) NOT NULL COMMENT 'Marcações do cartão do gabarito, onde temos as respostas corretas para todas as questões da prova.' ,
  PRIMARY KEY (`id_prova`, `nome`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;


-- -----------------------------------------------------
-- Table `scacp`.`cartoes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `scacp`.`cartoes` ;

CREATE  TABLE IF NOT EXISTS `scacp`.`cartoes` (
  `numero_inscricao` INT(7) UNSIGNED NOT NULL COMMENT 'Número de inscrição que identifica o candidato da prova, onde esté número possui sete dígitos, sendo o dígito menos significativo utilizado como um dígito verificador (DV) calculado pelo algoritmo denominado de “Dígito verificador por módulo 11”.' ,
  `fk_id_prova` INT UNSIGNED NOT NULL COMMENT 'Chave estrangeira que refencia a prova à qual o cartão está associado.' ,
  `marcacao` VARCHAR(100) NOT NULL COMMENT 'Questões marcadas na prova, onde cada caracter representará a resposta de uma alternativa, podendo ser:\\n\\\'a\\\', \\\'b\\\', \\\'c\\\', \\\'d\\\' ou \\\'e\\\', para a prova de múltipla escolha,\\n\\\'v\\\' ou \\\'f\\\', para a prova do tipo verdadeito ou falso,\\n\\\'*\\\', questão deixada em branco,\\n\\\'#\\\', /* comment truncated */' ,
  `nota` DOUBLE NOT NULL COMMENT 'Nota obtida após o cálculo segundo as regras da prova.' ,
  PRIMARY KEY (`numero_inscricao`) ,
  INDEX `fk_id_prova_idx` (`fk_id_prova` ASC) ,
  CONSTRAINT `fk_id_prova`
    FOREIGN KEY (`fk_id_prova` )
    REFERENCES `scacp`.`provas` (`id_prova` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
