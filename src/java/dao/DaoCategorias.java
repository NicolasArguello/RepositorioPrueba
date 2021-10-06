/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categorias;

/**
 *
 * @author home
 */
public class DaoCategorias {
    
    public static boolean registrarCategorias(Categorias cate) 
    {
        try{
        String sql="INSERT INTO Categorias values (?,?);";
             Connection con=Conexion.conectar();
             PreparedStatement st = con.prepareStatement(sql);  
             st.setInt(1, cate.getCodigoCate());
             st.setString(2, cate.getNombreCate());
             
       if(st.executeUpdate()>0)
       {
           return true;
       }else{
           return false;
       }
             
        
    }catch(SQLException ex)
    {
        return false;
    }
    }
    
public static ArrayList<Categorias> listarCategorias(){
    try{
        String sql= "SELECT * FROM Categorias;";
        Connection con = Conexion.conectar();
        PreparedStatement st = con.prepareStatement(sql);
        ResultSet resultado = st.executeQuery();
        ArrayList<Categorias> lista = new ArrayList<Categorias>();
        Categorias cate;
        while(resultado.next())
        {
            cate= new Categorias();
            cate.setCodigoCate(resultado.getInt("CodCate"));
            cate.setNombreCate(resultado.getString("NombreCate"));
            lista.add(cate); 
        }
        return lista;
        }catch(SQLException ex){
            return null;
        }
}

public static boolean actualizarcategorias(Categorias cate){
    try{
        String sql= "UPDATE Categorias SET NombreCate=? where CodCate=?;";
        Connection con= Conexion.conectar();
        PreparedStatement st= con.prepareStatement(sql);
        st.setInt(2, cate.getCodigoCate());
        st.setString(1, cate.getNombreCate());
        
        if(st.executeUpdate()>0)
       {
           return true;
       }else{
           return false;
       }
             
        
    }catch(SQLException ex)
    {
        return false;
    }
    }

    public static boolean eliminarcategorias(Categorias cate){
        try{
            String sql= ("DELETE FROM Categorias where CodCate=?;");
            Connection con= Conexion.conectar();
            PreparedStatement st= con.prepareStatement (sql);
            st.setInt(1, cate.getCodigoCate());
            if(st.executeUpdate()>0)
       {
           return true;
       }else{
           return false;
       }
             
        
    }catch(SQLException ex)
    {
        return false;
    }
        }
    }

      
 




    


   
