/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericas;

import poo.Alumno;

/**
 *
 * @author CRUZLEIJA
 */
public class GenericaA<Tipo> {
    
   private Tipo aux;

    public GenericaA(Tipo aux) {
        this.aux = aux;
    }
    
    public void classType(){
        if (this.aux instanceof Alumno){
            
        }
        System.out.println(this.aux.toString());
    }
   
   

}
