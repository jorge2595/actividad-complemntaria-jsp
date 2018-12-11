package modelos;

import inlcude.Area;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class conexion {
    private String user ="jorge";
    private String password = "7G7y4t68m3YRQ8JX";
    private String hostname ="localhost";
    private String port = "3306";
    private String database ="adm_de_actividades";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    private Connection con;

    public conexion () {
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException esql) {
            System.err.println(esql.getMessage());
        }
    }
        public Connection getConection(){return con;}


}
