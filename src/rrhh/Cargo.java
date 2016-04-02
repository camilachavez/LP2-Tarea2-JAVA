/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;


public class Cargo {
    
    private String codCargo;
    private String nombre;
    private String descripcion;
    private double salarioMin;
    private double salarioMax;  
    
    public String getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(double salarioMin) {
        this.salarioMin = salarioMin;
    }

    public double getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(double salarioMax) {
        this.salarioMax = salarioMax;
    }
    
    public Cargo(){
        this.codCargo="";
    }
    
    public Cargo(String codCargo, String nombre, String descripcion, double salarioMin, double salarioMax){
        this.codCargo = codCargo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
    }
    
    
}
