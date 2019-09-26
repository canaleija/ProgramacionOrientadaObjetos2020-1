/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameCalculadora extends JFrame {

    public JFrameCalculadora() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(4,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        JButtonC btnC = new JButtonC("C", dim, Color.yellow);
        JButtonC btnCE = new JButtonC("CE", dim, Color.yellow);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.yellow);
        JButtonC btnMulti = new JButtonC("X", dim, Color.yellow);
        JButtonC btn7 = new JButtonC("7", dim, Color.yellow);
        JButtonC btn8 = new JButtonC("8", dim, Color.yellow);
        JButtonC btn9 = new JButtonC("9", dim, Color.yellow);
        JButtonC btnDiv = new JButtonC("/", dim, Color.yellow);
        JButtonC btn4 = new JButtonC("4", dim, Color.yellow);
        JButtonC btn5 = new JButtonC("5", dim, Color.yellow);
        JButtonC btn6 = new JButtonC("6", dim, Color.yellow);
        JButtonC btnMenos = new JButtonC("-", dim, Color.yellow);
        JButtonC btn1 = new JButtonC("1", dim, Color.yellow);
        JButtonC btn2 = new JButtonC("2", dim, Color.yellow);
        JButtonC btn3 = new JButtonC("3", dim, Color.yellow);
        JButtonC btnPlus = new JButtonC("+", dim, Color.yellow);
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
    }
    
    
    
    
}
