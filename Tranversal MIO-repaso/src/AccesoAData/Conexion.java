package AccesoAData;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
//    Estos seran los atributos de la clase conexion, donde tendra como privado y estatico,
//    la url de la base de datos, el nombre de la base de datos, el usuario, la contraseña
//    y un objeto de tipo connection.

    private static String url = "jdbc:mariadb://localhost/";
    private static String user = "root";
    private static String bd = "ulp-mio-repaso";
    private static String password = "";
    private static Connection connection;

    //  Crearemos un costructor privado y vacio, para que no pueda ser inicializado en ningun otra
    //  parte.
    private Conexion() {
    }

    ;
    
    //1. Luego crearemos el metodo statico que devolvera la conexion.
    //2. Le preguntamos si la variable connection esta vacia, entonces le cargamos el 
    //  el driver, dentro de un try catch porque nos lanza excepcion de driver, y tambien
    //  una excepcion de la base de datos sql.
    //3.Luego de declarar el driver, lo guardamos pasandole la url, usuario y contraseña
    //  a nuestra variable connection de tipo Connection.
    // finalmente si logro conectarse mostrara un JOptionPane de que se pudo conectar 
    //  exitosamente a la bd, y devolvera la connection.
    public static Connection getConnection() {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, password);
                JOptionPane.showMessageDialog(null, "SE CONECTO EXITOSAMENTE A LA BD.");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de Datos.");
            }

        }

        return connection;
    }
;

}
