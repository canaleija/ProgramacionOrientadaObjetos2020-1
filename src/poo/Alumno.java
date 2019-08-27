/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author CRUZLEIJA
 */
public class Alumno extends Persona {
    
    
    private int boleta;
    private boolean regular;
    private double promedioGral;
    private String carrera;

    public Alumno() {
        this.boleta =0;
        this.regular =false;
        this.promedioGral =0;
        this.carrera = "";
    }

    public Alumno(String nombre,
                    int edad, 
                    double estatura,
                    double peso, String sexo,int boleta, boolean regular, double promedioGral, String carrera) {
        super(nombre,edad,estatura,peso,sexo);
        this.boleta = boleta;
        this.regular = regular;
        this.promedioGral = promedioGral;
        this.carrera = carrera;
    }
    
    public Alumno (Alumno alumno){
        this(alumno.getNombre(),alumno.getEdad(),alumno.getEstatura(),alumno.getPeso(),alumno.getSexo(),
                alumno.getBoleta(),alumno.isRegular(),alumno.getPromedioGral(),alumno.getCarrera());
    
    }

    /**
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the regular
     */
    public boolean isRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    /**
     * @return the promedioGral
     */
    public double getPromedioGral() {
        return promedioGral;
    }

    /**
     * @param promedioGral the promedioGral to set
     */
    public void setPromedioGral(double promedioGral) {
        this.promedioGral = promedioGral;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void saludar() {
       super.saludar();
       System.out.println("Y soy Alumno!");
    }
    
   
    
}
