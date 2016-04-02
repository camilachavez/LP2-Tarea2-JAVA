/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;

/**
 *
 * @author alulab14
 */
public class Sede {
    
    private String codSede; 
    private String nombre;
    private String direccion;
    private String locacion; // este será una clase
    private int estado;

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Sede(){
        this.codSede= "";         
        this.estado=0; 
    }
    
    public Sede(String codSede, String nombre, String direccion, String locacion, int estado){
        this.codSede=codSede;
        this.nombre=nombre;
        this.direccion=direccion;
        this.locacion=locacion;
        this.estado=estado;        
    }
    
    
}
