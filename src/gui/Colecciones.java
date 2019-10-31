/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import poo.Alumno;

/**
 *
 * @author CRUZLEIJA
 */
public class Colecciones {
    
   
    
    public Colecciones() {
       
    }
 
    public static void main(String[] args) {
        ArrayList<Object> listaDeArreglos = new ArrayList<>();
        listaDeArreglos.add(23);
        listaDeArreglos.add(4);
        listaDeArreglos.add(230);
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        listaDeArreglos.add(new Alumno());
        
        for (Object aux: listaDeArreglos){
        
        }
        
        
        System.out.println(listaDeArreglos.toString());
    }
    
}
