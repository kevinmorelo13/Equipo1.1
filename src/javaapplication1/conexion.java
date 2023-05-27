/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class conexion {
Connection con; 
    public conexion(){

        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionequipo", "root", "");

        } catch (Exception e) {
            System.err.println("No se pudo establecer la conexion con la base de datos " + e);

        }

    }

    public Connection getConnection() {
        return con;
    }
}
