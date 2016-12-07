-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema pomodori
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pomodori
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pomodori` DEFAULT CHARACTER SET utf8 ;
USE `pomodori` ;

-- -----------------------------------------------------
-- Table `pomodori`.`task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pomodori`.`task` (
  `id` INT NOT NULL,
  `name` VARCHAR(60) NULL,
  `shortBreak` TINYINT(1) NULL,
  `longBreak` TINYINT(1) NULL,
  `createdAt` VARCHAR(30) NULL,
  `completed` TINYINT(1) NULL,
  `keep` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
