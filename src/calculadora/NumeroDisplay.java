/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author CRUZLEIJA
 */
public class NumeroDisplay {
    
    private String texto;
    private boolean negativo;

    public NumeroDisplay() {
        this.texto = "";
        negativo = false;
    }

    public NumeroDisplay(String texto) {
        this.texto = texto;
        this.negativo = false;
    }
    
     
    public void concatenar(String texto){
        this.setTexto(this.getTexto() + texto);
        
    }
    
    public double getValue(){
        double valor=new Double(this.getTexto());
        if (isNegativo()){
          
           return valor*-1;
        }
      
        return valor;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the negativo
     */
    public boolean isNegativo() {
        return negativo;
    }

    /**
     * @param negativo the negativo to set
     */
    public void setNegativo(boolean negativo) {
        this.negativo = negativo;
    }
    
}
