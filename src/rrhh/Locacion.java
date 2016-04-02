/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;

public class Locacion {
    
    private String codLocacion;
    private String codPais;
    private String codRegion;
    private String codProvincia;
    private String codCiudad;
    
    
    public String getCodLocacion() {
        return codLocacion;
    }

    public void setCodLocacion(String codLocacion) {
        this.codLocacion = codLocacion;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(String codRegion) {
        this.codRegion = codRegion;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }
    
    public Locacion(){
        this.codLocacion="";
    }
    
    public Locacion(String codLocacion, String codPais, String codRegion, String codProvincia, String codCiudad){
        this.codPais = codPais;
        this.codRegion = codRegion;
        this.codProvincia = codProvincia;
        this.codCiudad = codCiudad;        
    }
    
}
