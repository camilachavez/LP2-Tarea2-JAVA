/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;

import java.util.Date;

public class Empleado extends Persona {
    
    private String codEmpleado;
    private Date fechaIngreso;
    private String codDepartamento;
    private String correoCorp;
    private String codCargo;
    private double salario;
    //ListaHistoricoCargo

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getCorreoCorp() {
        return correoCorp;
    }

    public void setCorreoCorp(String correoCorp) {
        this.correoCorp = correoCorp;
    }

    public String getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
           
    
    public Empleado(){
        this.codEmpleado="";
    }
    
    public Empleado(String codEmpleado, Date fechaIngreso, String codDepartamento, String correoCorp, String codCargo, double salario, long dni, String nombre, String apPaterno, String apMaterno, String correo, String telefono, Date fechaNac, String estado, String ciudad){
        
        super(dni, nombre, apPaterno, apMaterno, correo, telefono, fechaNac, estado, ciudad);
        this.codEmpleado = codEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.codDepartamento = codDepartamento;
        this.correoCorp = correoCorp;
        this.codCargo = codCargo;
        this.salario = salario;
        //ListahistoricoCargo               
    
    }
    
    
    
    
}
