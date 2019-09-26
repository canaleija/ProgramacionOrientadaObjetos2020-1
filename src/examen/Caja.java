/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author CRUZLEIJA
 */
public class Caja {
    
    private double ancho;
    private double alto;
    private double profundidad;

    public Caja() {
        this.ancho = 0;
        this.alto = 0;
        this.profundidad = 0;
        
    }

   

    
    public Caja(double ancho, double alto, double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * @return the profundidad
     */
    public double getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public boolean equals(Object obj) {
       
       Caja caja = (Caja)obj; 
       return ((this.alto==caja.getAlto())
               &&(this.ancho==caja.getAncho())
               &&(this.profundidad==caja.getProfundidad()));
    }
    
    
    
}
