# 📚 Fullstack Book Management System

Este es un proyecto Fullstack básico que permite gestionar una biblioteca de libros. Utiliza una arquitectura desacoplada con un backend en **Spring Boot** y un frontend en **Angular**.

## 🚀 Tecnologías Utilizadas

* **Backend:** Java 17, Spring Boot 3, Spring Data JPA.
* **Frontend:** Angular 17+, Signals, HttpClient.
* **Base de Datos:** MySQL / MariaDB.
* **Estilos:** CSS3 / Bootstrap (opcional).

## 🛠️ Requisitos Previos

1.  **Java JDK 17** o superior.
2.  **Node.js** y **Angular CLI**.
3.  **MySQL Server**.

📸 Screenshots
<img width="1432" height="768" alt="image" src="https://github.com/user-attachments/assets/1939c424-f62b-4f1f-84ab-db8f15488ae9" />



## 📋 Configuración de la Base de Datos

Crea una base de datos llamada `libreria_db` y ejecuta el siguiente script para crear la tabla e insertar datos iniciales:

```sql
CREATE DATABASE IF NOT EXISTS `libreria_db`;
USE `libreria_db`;

CREATE TABLE `books` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `author` VARCHAR(255) DEFAULT NULL,
  `title` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `books` (`author`, `title`) VALUES
('Andrew Hunt', 'El programador pragmático'),
('Rod Johnson', 'Spring Boot + Angular');
