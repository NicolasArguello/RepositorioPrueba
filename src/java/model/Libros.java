/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import static org.eclipse.jdt.internal.compiler.ast.ExplicitConstructorCall.This;

/**
 *
 * @author home
 */
public class Libros implements Serializable {
    
    private int Cisbn;
    private String Titulo;
    private String Descripcion;
    private String NombreAuto;
    private String Publicacion;
    private int CodC;
    private String NitEd;

    

    public Libros() {
        this.Cisbn=0;
        this.Titulo="";
        this.Descripcion="";
        this.NombreAuto="";
        this.Publicacion="";
        this.CodC=0;
        this.NitEd="";
        
    }

    

    public int getCisbn() {
        return Cisbn;
    }

    public void setCisbn(int Cisbn) {
        this.Cisbn = Cisbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombreAuto() {
        return NombreAuto;
    }

    public void setNombreAuto(String NombreAuto) {
        this.NombreAuto = NombreAuto;
    }

    public String getPublicacion() {
        return Publicacion;
    }

    public void setPublicacion(String Publicacion) {
        this.Publicacion = Publicacion;
    }

    public int getCodC() {
        return CodC;
    }

    public void setCodC(int CodC) {
        this.CodC = CodC;
    }

    public String getNitEd() {
        return NitEd;
    }

    public void setNitEd(String NitEd) {
        this.NitEd = NitEd;
    }

   
    
    
    

}

