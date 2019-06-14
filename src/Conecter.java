
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERIC
 */
public class Conecter {
    Connection con;
    public  Conecter(){
        try{
            Class.forName("Com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
        System.err.println(e);
}
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/etude","root","");
        }catch(SQLException e){ System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}
}