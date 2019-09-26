/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.util.ArrayList;
import poo.Alumno;

/**
 *
 * @author CRUZLEIJA
 */
public class Grupo {

                
    private String nombre;
    private Docente tutor;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente> docentes;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.tutor = null;
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tutor
     */
    public Docente getTutor() {
        return tutor;
    }

    /**
     * @param tutor the tutor to set
     */
    public void setTutor(Docente tutor) {
        this.tutor = tutor;
    }

    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return the docentes
     */
    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    /**
     * @param docentes the docentes to set
     */
    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }
    
    
    
}
