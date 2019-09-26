/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import poo.Persona;

/**
 *
 * @author CRUZLEIJA
 */
public class Docente extends Persona{
    
    private String rfc;
    private double sueldo;
    private int cedula;
    private boolean basificado;
    private double antiguedad;

    public Docente() {
        this.rfc = "";
        this.sueldo = 0.0;
        this.cedula = 0;
        this.basificado = false;
        this.antiguedad = 0.0;
    }

    public Docente(String rfc, double sueldo, int cedula, boolean basificado, double antiguedad, String nombre, int edad, double estatura, double peso, String sexo) {
        super(nombre, edad, estatura, peso, sexo);
        this.rfc = rfc;
        this.sueldo = sueldo;
        this.cedula = cedula;
        this.basificado = basificado;
        this.antiguedad = antiguedad;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the basificado
     */
    public boolean isBasificado() {
        return basificado;
    }

    /**
     * @param basificado the basificado to set
     */
    public void setBasificado(boolean basificado) {
        this.basificado = basificado;
    }

    /**
     * @return the antiguedad
     */
    public double getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    
    
}
