-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema cosc457final
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cosc457final
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cosc457final` DEFAULT CHARACTER SET utf8 ;
USE `cosc457final` ;

-- -----------------------------------------------------
-- Table `cosc457final`.`PAYMENT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`PAYMENT` (
  `paymentID` VARCHAR(45) NOT NULL,
  `customerID` VARCHAR(45) NULL,
  `paymentAmount` DECIMAL NULL,
  `paymentDate` DATE NULL,
  `paymentType` VARCHAR(45) NULL,
  PRIMARY KEY (`paymentID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`CUSTOMER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`CUSTOMER` (
  `customerID` VARCHAR(45) NOT NULL,
  `customerFName` VARCHAR(45) NULL,
  `customerLName` VARCHAR(45) NULL,
  `customerSSN` INT(9) NOT NULL,
  `customerAddress` VARCHAR(45) NULL,
  `customerPhone` INT(10) NULL,
  `customerPayID` VARCHAR(45) NULL,
  `customerFoodID` VARCHAR(45) NULL,
  PRIMARY KEY (`customerID`, `customerSSN`),
  INDEX `customerPayID_idx` (`customerPayID` ASC) VISIBLE,
  CONSTRAINT `customerPayID`
    FOREIGN KEY (`customerPayID`)
    REFERENCES `cosc457final`.`PAYMENT` (`paymentID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`WAITER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`WAITER` (
  `waiterID` VARCHAR(45) NOT NULL,
  `fname` VARCHAR(45) NULL,
  `m_init` VARCHAR(45) NULL,
  `lname` VARCHAR(45) NULL,
  `SSN` INT(9) NOT NULL,
  `phoneNumber` INT(10) NULL,
  `mgrSSN` INT(9) NULL,
  `customID` VARCHAR(45) NULL,
  PRIMARY KEY (`waiterID`, `SSN`),
  INDEX `customID_idx` (`customID` ASC) VISIBLE,
  CONSTRAINT `customID`
    FOREIGN KEY (`customID`)
    REFERENCES `cosc457final`.`CUSTOMER` (`customerID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`SUPPLIER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`SUPPLIER` (
  `supplierID` VARCHAR(45) NOT NULL,
  `supplierPhone` INT(10) NULL,
  `supplierCity` VARCHAR(45) NULL,
  `supplierAddress` VARCHAR(45) NULL,
  PRIMARY KEY (`supplierID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`INGREDIENT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`INGREDIENT` (
  `ingredientID` VARCHAR(45) NOT NULL,
  `ingredientName` VARCHAR(45) NULL,
  `ingredientType` VARCHAR(45) NULL,
  `ingredientSuppID` VARCHAR(45) NULL,
  `ingredientPrice` DECIMAL NULL,
  PRIMARY KEY (`ingredientID`),
  INDEX `ingredientSuppID_idx` (`ingredientSuppID` ASC) VISIBLE,
  CONSTRAINT `ingredientSuppID`
    FOREIGN KEY (`ingredientSuppID`)
    REFERENCES `cosc457final`.`SUPPLIER` (`supplierID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`FOOD_ITEM`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`FOOD_ITEM` (
  `foodID` VARCHAR(45) NOT NULL,
  `foodName` VARCHAR(45) NULL,
  `foodPrice` DECIMAL NULL,
  `foodIngredientID` VARCHAR(45) NULL,
  PRIMARY KEY (`foodID`),
  INDEX `ingredientID_idx` (`foodIngredientID` ASC) VISIBLE,
  CONSTRAINT `ingredientID`
    FOREIGN KEY (`foodIngredientID`)
    REFERENCES `cosc457final`.`INGREDIENT` (`ingredientID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`MENU`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`MENU` (
  `menuID` VARCHAR(45) NOT NULL,
  `menuName` VARCHAR(45) NULL,
  `menuFoodID` VARCHAR(45) NULL,
  PRIMARY KEY (`menuID`),
  INDEX `foodID_idx` (`menuFoodID` ASC) VISIBLE,
  CONSTRAINT `menuFoodID`
    FOREIGN KEY (`menuFoodID`)
    REFERENCES `cosc457final`.`FOOD_ITEM` (`foodID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`CHEF`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`CHEF` (
  `chefID` VARCHAR(45) NOT NULL,
  `chefFName` VARCHAR(45) NULL,
  `chefLName` VARCHAR(45) NULL,
  `chefPhone` INT(10) NULL,
  `chefOrderID` VARCHAR(45) NULL,
  PRIMARY KEY (`chefID`),
  INDEX `chefOrderID_idx` (`chefOrderID` ASC) VISIBLE,
  CONSTRAINT `chefOrderID`
    FOREIGN KEY (`chefOrderID`)
    REFERENCES `cosc457final`.`FOOD_ITEM` (`foodID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cosc457final`.`ORDERS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cosc457final`.`ORDERS` (
  `orderID` INT NOT NULL AUTO_INCREMENT,
  `orderDate` DATE NULL,
  `orderCustomerID` VARCHAR(45) NULL,
  `foodItemID` VARCHAR(45) NULL,
  PRIMARY KEY (`orderID`),
  INDEX `orderCustomerID_idx` (`orderCustomerID` ASC) VISIBLE,
  INDEX `orderFoodID_idx` (`foodItemID` ASC) VISIBLE,
  CONSTRAINT `orderCustomerID`
    FOREIGN KEY (`orderCustomerID`)
    REFERENCES `cosc457final`.`CUSTOMER` (`customerID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `orderFoodID`
    FOREIGN KEY (`foodItemID`)
    REFERENCES `cosc457final`.`FOOD_ITEM` (`foodID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
