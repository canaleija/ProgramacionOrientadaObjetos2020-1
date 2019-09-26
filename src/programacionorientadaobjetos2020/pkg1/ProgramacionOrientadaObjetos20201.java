/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import examen.Caja;
import gui.NuevoJFrame;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JFrame;
import poo.Alumno;

import poo.Persona;
import poo2.Docente;
import poo2.Grupo;

/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grupo grupo1 = new Grupo("2CM1");
       
        //grupo1.setTutor(new Docente());
       
        grupo1.getTutor().setNombre("Juan Julian");
        grupo1.getTutor().setEdad(27);
        grupo1.getTutor().setEstatura(1.8);
        
        System.out.println(grupo1.getTutor());
    }
  
    
}
