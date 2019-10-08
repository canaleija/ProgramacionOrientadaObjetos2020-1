/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import sun.awt.im.InputMethodJFrame;

/**
 *
 * @author CRUZLEIJA
 */
public class CalculadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrameCalculadora calcu = new JFrameCalculadora();
       calcu.setSize(500, 500);
       calcu.setVisible(true);
               
    }
    
}
