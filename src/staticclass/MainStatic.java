/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticclass;

/**
 *
 * @author CRUZLEIJA
 */
public class MainStatic {
     
    public int x;
    static int aux;
    
    public MainStatic(int x, int b) {
        this.x = x;
        aux = b;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ClaseA a = new ClaseA();
        ClaseA a1 = new ClaseA();
        ClaseA a2 = new ClaseA();
        ClaseA a3 = new ClaseA();
        ClaseA a4 = new ClaseA();
        ClaseA a5 = new ClaseA();
        ClaseB b = new ClaseB();
        System.out.println(ClaseA.cA);
        System.out.println(ClaseB.cB);
    }
    
}
