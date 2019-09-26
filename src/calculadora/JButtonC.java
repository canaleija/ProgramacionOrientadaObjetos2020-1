/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author CRUZLEIJA
 */
public class JButtonC extends JButton{
    // etiqueta(texto)
    // tamaño 
    // color
    public JButtonC(String etiqueta, Dimension dim, Color color){
        super(etiqueta);
            setSize(dim);
        // TODO: VAMOS A BUSCAR LA FORMA DE QUE TODOS LOS BOTONES 
        // COMPARTAN LA MISMA DIMENSION
        // TODO: CAMBIAR EL TAMAÑO DE LA ETIQUETA
        Font aux = getFont();
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo,30);
        setFont(aux2);
    
        setBackground(color);
        // TODO: ver la forma en que se distribuyen los componentes dentro de el jframe
        
    }
    
}
