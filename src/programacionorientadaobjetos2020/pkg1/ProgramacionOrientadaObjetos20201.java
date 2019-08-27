/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import java.util.LinkedList;
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
        Persona a = new Persona("Juan Alberto",
                18, 1.9, 2.1, "Prefiero no decirlo");
      
        Alumno b = new Alumno("Beto",23,1.90,80,"Masculino",200, true, 8.9, "Arte y Costura");
        Alumno c = new Alumno("Albertano",23,1.90,80,"Masculino",200, true, 8.9, "Arte y Costura");
        Alumno d = new Alumno("Maximiliano",23,1.90,80,"Masculino",200, true, 8.9, "Arte y Costura");
        
        LinkedList<Persona> grupoA = new LinkedList<>();
        grupoA.add(a);
        grupoA.add(b);
        grupoA.add(c);
        grupoA.add(d);
       
        
        for(Persona aux: grupoA){
            aux.saludar();
        
        }
        
        System.out.println();
        
       
    }
    
}
