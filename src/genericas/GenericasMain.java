/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericas;

import poo.Alumno;
import poo.Persona;

/**
 *
 * @author CRUZLEIJA
 */
public class GenericasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
           GenericaA<Object> aux [] = new GenericaA[5];
           aux[0] = new GenericaA<>(new Integer(6));
           aux[0].classType();
           aux[1] = new GenericaA<>(new Alumno());
           aux[1].classType();
    }
    
}
