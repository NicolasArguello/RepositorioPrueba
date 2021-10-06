/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DaoLibros.listarLibros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Libros;

/**
 *
 * @author home
 */
public class DaoLibros {
    
    public static boolean registrarLibro(Libros libi){
        
        try{
    
    String sql="INSERT INTO libros(Cisbn,Titulo,Descripcion,NombreAuto,Publicacion,CodC,NitEd)VALUES (?,?,?,?,?,?,?);";
                
        Connection libr=Conexion.conectar();
        PreparedStatement lb = libr.prepareStatement(sql);
        lb.setInt(1, libi.getCisbn());
        lb.setString(2, libi.getTitulo());
        lb.setString(3, libi.getDescripcion());
        lb.setString(4, libi.getNombreAuto());
        lb.setString(5, libi.getPublicacion());
        lb.setInt(6, libi.getCodC());
        lb.setString(7, libi.getNitEd());

       
        
        if(lb.executeUpdate()>0)
        {
          return true;
        }
        else
        {
        return false;
        }
        
    }
    
     catch(SQLException ex)
    {
        return false;
    }
    }
    
    public static ArrayList<Libros> listarLibros(){
        try{
            String sql="SELECT * FROM libros;";
            Connection libr=Conexion.conectar();
            PreparedStatement st=libr.prepareStatement(sql);
            ResultSet result=st.executeQuery();
            ArrayList<Libros> listalib=new ArrayList<Libros>();
            Libros libi;
            while(result.next())
            {
               libi= new Libros();
                libi.setCisbn(result.getInt("Cisbn"));
                libi.setTitulo(result.getString("Titulo"));
                libi.setDescripcion(result.getString("Descripcion"));
                libi.setNombreAuto(result.getString("NombreAuto"));
                libi.setPublicacion(result.getString("Publicacion"));
                libi.setCodC(result.getInt("CodC"));
                libi.setNitEd(result.getString("NitEd"));
               
                
                listalib.add(libi);
            }
            return listalib;
        }catch(SQLException ex){
            return null;
        }
    }
  
public static boolean actualizarLibro(Libros libi){
            try{
                String sql= "UPDATE libros SET  Cisbn=?, Titulo=?, Descripcion=?, NombreAuto=?, Publicacion=?, CodC=?  where NitEd=?;";
                Connection libr = Conexion.conectar();
                PreparedStatement st= libr.prepareStatement(sql);
                st.setInt(1, libi.getCisbn());
                st.setString(2, libi.getTitulo());
                st.setString(3, libi.getDescripcion());
                st.setString(4, libi.getNombreAuto());
                st.setString(5, libi.getPublicacion());
                st.setInt(6, libi.getCodC());
                st.setString(7, libi.getNitEd());
                
                

                
                if(st.executeUpdate()>0)
        {
          return true;
        }
        else
        {
        return false;
        }
        
    }
    
     catch(SQLException ex)
    {
        return false;
    }
            }


        
        public static boolean eliminarLibro(Libros libi){
           try{
               String sql ="DELETE FROM libros where Cisbn=?;";
               Connection libr= Conexion.conectar();
               PreparedStatement st = libr.prepareStatement(sql);
               st.setInt(1, libi.getCisbn());
               
               if(st.executeUpdate()>0)
        {
          return true;
        }
        else
        {
        return false;
        }
        
    }
    
     catch(SQLException ex)
    {
        return false;
    }
           } 
        }
