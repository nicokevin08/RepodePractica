package AccesoAData;

import Entidades.Alumno;
import java.sql.*;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = (Connection) Conexion.getConnection();
    }
    
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) "
                + "VALUES (?,?,?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            
        } catch (SQLException ex) {
           
        }
        
        
    
        
        
        
        
    
    
    }
    
    
    
    

}
