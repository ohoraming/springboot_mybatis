SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema my_board
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema my_board
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `my_board` DEFAULT CHARACTER SET utf8 ;
USE `my_board` ;

-- -----------------------------------------------------
-- Table `my_board`.`board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_board`.`board` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_board`.`file`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_board`.`file` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `boardNum` INT NOT NULL,
  `fileName` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_file_board1_idx` (`boardNum` ASC) VISIBLE,
  CONSTRAINT `fk_file_board1`
    FOREIGN KEY (`boardNum`)
    REFERENCES `my_board`.`board` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_board`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_board`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NULL,
  `email` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_board`.`likeboard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_board`.`likeboard` (
  `boardNum` INT NOT NULL,
  `userNum` INT NOT NULL,
  PRIMARY KEY (`boardNum`, `userNum`),
  INDEX `fk_board_has_user_user1_idx` (`userNum` ASC) VISIBLE,
  INDEX `fk_board_has_user_board_idx` (`boardNum` ASC) VISIBLE,
  CONSTRAINT `fk_board_has_user_board`
    FOREIGN KEY (`boardNum`)
    REFERENCES `my_board`.`board` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_board_has_user_user1`
    FOREIGN KEY (`userNum`)
    REFERENCES `my_board`.`user` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;