/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author home
 */
public class Conexion {
    public static Connection conectar() throws SQLException
    {
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecasena2021","root","");
        }
        
    catch(ClassNotFoundException ex){
            System.out.println("No se encontro driver");
        return null;
        
    }catch (SQLException ex){
            System.out.println("la base de datos no se encuentra");
            return null;
            }
}
}