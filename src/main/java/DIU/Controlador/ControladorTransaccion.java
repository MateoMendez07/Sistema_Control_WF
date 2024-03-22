package DIU.Controlador;
import DIU.Modelo.Transaccion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tutut
 */
public class ControladorTransaccion {
    public static boolean agregarTransaccion(Transaccion transaccion) {
        Connection conn = null;
        CallableStatement cstmt = null;
        boolean exito = false;
        try {
            conn = ConexionBdd.obtenerConexion();
            cstmt = conn.prepareCall("{call AgregarTransaccion(?, ?, ?, ?)}");            
            cstmt.setString(1, transaccion.getTipo());
            cstmt.setDouble(2, transaccion.getMonto());
            cstmt.setDate(3, java.sql.Date.valueOf(transaccion.getFecha()));
            cstmt.setString(4, transaccion.getDescripcion());           
            int filasAfectadas = cstmt.executeUpdate();
            if (filasAfectadas > 0) {
                exito = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return exito;
    }
    public static boolean eliminarTransacciones(java.sql.Date fecha, String descripcion) {
        Connection conn = null;
        CallableStatement cstmt = null;
        boolean exito = false;

        try {
            conn = ConexionBdd.obtenerConexion();
            cstmt = conn.prepareCall("{call EliminarTransacciones(?, ?)}");

            cstmt.setDate(1, fecha);
            cstmt.setString(2, descripcion);

            int filasAfectadas = cstmt.executeUpdate();
            if (filasAfectadas > 0) {
                exito = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        
        }

        return exito;
    }
}

