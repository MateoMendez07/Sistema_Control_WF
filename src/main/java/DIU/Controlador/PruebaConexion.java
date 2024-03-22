package DIU.Controlador;

import DIU.Controlador.ConexionBdd; 
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaConexion {
  public static void main(String[] args) {
    Connection conn = ConexionBdd.obtenerConexion();
    
    if (conn != null) {
        System.out.println("Conexión exitosa a la base de datos.");
    } else {
        System.out.println("No se pudo establecer la conexión a la base de datos.");
    }
}
}

