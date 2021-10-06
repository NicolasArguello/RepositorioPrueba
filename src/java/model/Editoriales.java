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
public class Editoriales implements Serializable {
    private int NitEdit;
    private String NombreEdit;
    private String Telefono;
    private String Direccion;
    private String EMAIL;
    private String SitioWeb;

    public Editoriales() {
        this.NitEdit=0;
        this.NombreEdit="";
        this.Telefono="";
        this.Direccion="";
        this.EMAIL="";
        this.SitioWeb="";
    }

    public Editoriales(int NitEdit, String NombreEdit, String Telefono, String Direccion, String EMAIL, String SitioWeb) {
        this.NitEdit = NitEdit;
        this.NombreEdit = NombreEdit;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.EMAIL = EMAIL;
        this.SitioWeb = SitioWeb;
    }


    

    public int getNitEdit() {
        return NitEdit;
    }

    public void setNitEdit(int NitEdit) {
        this.NitEdit = NitEdit;
    }

    public String getNombreEdit() {
        return NombreEdit;
    }

    public void setNombreEdit(String NombreEdit) {
        this.NombreEdit = NombreEdit;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSitioWeb() {
        return SitioWeb;
    }

    public void setSitioWeb(String SitioWeb) {
        this.SitioWeb = SitioWeb;
    }
    
    

}