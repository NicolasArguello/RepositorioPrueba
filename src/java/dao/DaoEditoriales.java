/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DaoEditoriales.listarEditoriales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categorias;
import model.Editoriales;

/**
 *
 * @author home
 */
public class DaoEditoriales {
    
    public static boolean registrarEditoriales(Editoriales edi){
        
        try{
    
    String sql="INSERT INTO editoriales(NitEdit,NombreEdit,Telefono,Direccion,EMAIL,SitioWeb)VALUES (?,?,?,?,?,?);";
                
        Connection edit=Conexion.conectar();
        PreparedStatement st = edit.prepareStatement(sql);
        st.setInt(1, edi.getNitEdit());
        st.setString(2, edi.getNombreEdit());
        st.setString(3, edi.getTelefono());
        st.setString(4, edi.getDireccion());
        st.setString(5, edi.getEMAIL());
        st.setString(6, edi.getSitioWeb());
        
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
        
        public static ArrayList<Editoriales> listarEditoriales(){
        try{
            String sql="SELECT * FROM editoriales;";
            Connection conect=Conexion.conectar();
            PreparedStatement st=conect.prepareStatement(sql);
            ResultSet resultado=st.executeQuery();
            ArrayList<Editoriales> listaedit=new ArrayList<Editoriales>();
            Editoriales edito;
            while(resultado.next())
            {
               edito= new Editoriales();
                edito.setNitEdit(resultado.getInt("NitEdit"));
                edito.setNombreEdit(resultado.getString("NombreEdit"));
                edito.setTelefono(resultado.getString("Telefono"));
                edito.setEMAIL(resultado.getString("EMAIL"));
                edito.setDireccion(resultado.getString("Direccion"));
                edito.setSitioWeb(resultado.getString("SitioWeb"));
                
                listaedit.add(edito);
            }
            return listaedit;
        }catch(SQLException ex){
            return null;
        }
    }
        
        public static boolean actualizareditorial(Editoriales edito){
            try{
                String sql= "UPDATE Editoriales SET NombreEdit=?, Telefono=?, Direccion=?, EMAIL=?, SitioWeb=? WHERE NitEdit=?;";
                Connection conect = Conexion.conectar();
                PreparedStatement st= conect.prepareStatement(sql);
                st.setString(1, edito.getNombreEdit());
                st.setString(2, edito.getTelefono());
                st.setString(3, edito.getDireccion());
                st.setString(4, edito.getEMAIL());
                st.setString(5, edito.getSitioWeb());
                st.setInt(6, edito.getNitEdit());
                
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
        
        public static boolean eliminareditorial(Editoriales edito){
           try{
               String sql ="DELETE FROM Editoriales where NitEdit=?;";
               Connection conect= Conexion.conectar();
               PreparedStatement st = conect.prepareStatement(sql);
               st.setInt(1, edito.getNitEdit());
               
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
        
        
        
    


          
    
    

