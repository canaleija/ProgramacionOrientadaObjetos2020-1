/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class Persona {
    
    public String nombre;
    public int edad;
    public double estatura;
    public double peso;
    public String sexo;
    
    public Persona(){
        nombre = "Desconocido";
        edad = 0;
        estatura = 0;
        peso = 0;
        sexo = "Desconocido";    
    }

    
     public Persona(String nombre,
                    int edad, 
                    double estatura,
                    double peso, String sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 
    
}
