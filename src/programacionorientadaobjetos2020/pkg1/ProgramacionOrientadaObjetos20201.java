/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import poo.Alumno;
import poo.Persona;

/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 6;
        Persona beto = new Persona("Juan Alberto",
                18, 1.9, 2.1, "Prefiero no decirlo");
        System.out.println(beto.getNombre());
        beto.setNombre("Juan Martin");
        System.out.println(beto.getNombre());
        Alumno roberto = new Alumno();
        Alumno roberto2 = new Alumno("Beto",23,1.90,80,"Masculino",200, true, 8.9, "Arte y Costura");
        System.out.println();
       
    }
    
}
