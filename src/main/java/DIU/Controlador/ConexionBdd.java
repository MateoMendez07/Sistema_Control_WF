package DIU.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBdd {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_wf";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "wjsnmdkpdja";
    
    private static Connection conexion = null;
    
    public static Connection obtenerConexion() {
        if (conexion == null) {
            try {
              
                Class.forName("com.mysql.cj.jdbc.Driver");
              
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
                
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        
        }
        return conexion;
    }
}
