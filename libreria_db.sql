-- 1. Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS `libreria_db`;
USE `libreria_db`;

-- 2. Limpiar la tabla si ya existe (Cuidado: esto borra los datos actuales)
DROP TABLE IF EXISTS `books`;

-- 3. Crear la estructura de la tabla
-- Usamos BIGINT y AUTO_INCREMENT directamente en el ID
CREATE TABLE `books` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `author` VARCHAR(255) DEFAULT NULL,
  `title` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 4. Insertar datos de prueba
-- Nota: No incluimos el ID en el INSERT para que el AUTO_INCREMENT haga su trabajo
INSERT INTO `books` (`author`, `title`) VALUES
('Andrew Hunt', 'El programador pragmático'),
('Rod Johnson', 'Spring Boot + Angular');

-- 5. Verificar los datos
SELECT * FROM books;