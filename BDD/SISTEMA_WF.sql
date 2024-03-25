CREATE TABLE Administrador (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NombreUsuario VARCHAR(50) NOT NULL,
    Contraseña VARCHAR(255) NOT NULL
);
CREATE TABLE Transacciones (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    TipoTransaccion ENUM('Ingreso', 'Egreso') NOT NULL,
    Monto DECIMAL(10, 2) NOT NULL,
    FechaHora DATETIME NOT NULL,
    Descripcion VARCHAR(255),
    AdministradorID INT,
    FOREIGN KEY (AdministradorID) REFERENCES Administrador(ID)
);
CREATE TABLE Saldos (
    SaldoTotal DECIMAL(10, 2) NOT NULL
);

DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarTransaccion`(
    IN p_tipo VARCHAR(50),
    IN p_monto DECIMAL(10, 2),
    IN p_fecha DATE,
    IN p_descripcion VARCHAR(255)
)
BEGIN
    INSERT INTO Transacciones (TipoTransaccion, Monto, Fecha, Descripcion)
    VALUES (p_tipo, p_monto, p_fecha, p_descripcion);
END
DELIMITER //
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarTransacciones`(IN p_fecha DATE, IN p_descripcion VARCHAR(255))
BEGIN
    DELETE FROM transacciones WHERE Fecha = p_fecha AND Descripcion = p_descripcion;
END
DELIMITER //
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarTransacciones`()
BEGIN
    SELECT TipoTransaccion, Monto, Fecha, Descripcion
    FROM transacciones;
END
DELIMITER //

DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerificarInicioSesion`(
    IN p_nombreUsuario VARCHAR(50),
    IN p_contraseña VARCHAR(255),
    OUT p_estado BOOLEAN
)
BEGIN
    DECLARE user_exists INT;
    SELECT COUNT(*)
    INTO user_exists
    FROM administrador
    WHERE NombreUsuario = p_nombreUsuario AND Contraseña = p_contraseña;
    
    IF user_exists > 0 THEN
        SET p_estado = TRUE; 
    ELSE
        SET p_estado = FALSE;
    END IF;
END
DELIMITER //