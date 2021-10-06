/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author home
 */
public class Categorias implements Serializable {
    
    private int CodigoCate;
    private String NombreCate;

    public Categorias() {
        
        this.CodigoCate=0;
        this.NombreCate="";
    }

    public Categorias(int CodigoCate, String NombreCate) {
        this.CodigoCate = CodigoCate;
        this.NombreCate = NombreCate;
    }

    public int getCodigoCate() {
        return CodigoCate;
    }

    public void setCodigoCate(int CodigoCate) {
        this.CodigoCate = CodigoCate;
    }

    public String getNombreCate() {
        return NombreCate;
    }

    public void setNombreCate(String NombreCate) {
        this.NombreCate = NombreCate;
    }
    
    
    
    
    
}

   

    

