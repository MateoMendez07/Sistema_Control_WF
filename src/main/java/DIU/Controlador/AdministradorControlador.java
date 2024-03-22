/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tutut
 */
public class AdministradorControlador {
    public boolean inicioSesion(String nombreUsuario, String contraseña) {
    boolean estado = false;
    Connection conexion = null;
    CallableStatement cs = null;
    
    try {
        conexion = ConexionBdd.obtenerConexion();
        cs = conexion.prepareCall("{CALL VerificarInicioSesion(?, ?, ?)}");
        cs.setString(1, nombreUsuario);
        cs.setString(2, contraseña);
        cs.registerOutParameter(3, java.sql.Types.BOOLEAN);
        cs.execute();
        
        estado = cs.getBoolean(3);
    } catch (SQLException e) {
        e.printStackTrace();
    } 
    
    return estado;
}
}
