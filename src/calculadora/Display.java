/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class Display extends JTextField {
    
   private NumeroDisplay numero;

    public Display() {
        this.numero = new NumeroDisplay();
    }
    
    public void concatenar (String texto){
        this.numero.concatenar(texto);
        setText(this.numero.getTexto());
    
    }
    /**
     * @return the numero
     */
    public NumeroDisplay getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(NumeroDisplay numero) {
        this.numero = numero;
    }
   
   
    
}
