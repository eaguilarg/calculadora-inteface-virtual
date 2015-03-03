
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class VentanaCalculadora extends JFrame {
    
//atributos
    protected JPanel miPanel;
    protected Border miBorde;
    protected JButton botonBorrar,botonPunto, botonEspacio, botonParentesisAbre, botonParentesisCierra, botonSuma, botonResta, botonMultiplicacion, botonDivision,botonIgual,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0;
    protected JTextField pantalla;
    protected JLabel blanco;
    
//constructor
    public VentanaCalculadora() {
        super("Calculadora");
        miPanel=new JPanel(new GridLayout(5,5));
        //miBorde=BorderFactory.createEmptyBorder(5,5,5,5);
        //miPanel.setBorder(miBorde);
        pantalla= new JTextField();
        miPanel.add(pantalla);
        botonParentesisAbre=new JButton("(");
        miPanel.add(botonParentesisAbre);
        botonParentesisCierra=new JButton(")");
        miPanel.add(botonParentesisCierra);
        botonEspacio=new JButton("Espacio");
        miPanel.add(botonEspacio);
        boton7=new JButton("7");
        miPanel.add(boton7);
        boton8=new JButton("8");
        miPanel.add(boton8);
        boton9=new JButton("9");
        miPanel.add(boton9);
        botonSuma=new JButton("+");
        miPanel.add(botonSuma);
        boton4=new JButton("4");
        miPanel.add(boton4);
        boton5=new JButton("5");
        miPanel.add(boton5);
        boton6=new JButton("6");
        miPanel.add(boton6);
        botonResta=new JButton("-");
        miPanel.add(botonResta);
        boton1=new JButton("1");
        miPanel.add(boton1);
        boton2=new JButton("2");
        miPanel.add(boton2);
        boton3=new JButton("3");
        miPanel.add(boton3);
        botonMultiplicacion=new JButton("*");
        miPanel.add(botonMultiplicacion);
        boton0=new JButton("0");
        miPanel.add(boton0);
        botonPunto=new JButton(".");
        miPanel.add(botonPunto);
        botonIgual=new JButton("=");
        miPanel.add(botonIgual);
        botonDivision=new JButton("/");
        miPanel.add(botonDivision);
        
        super.setContentPane(miPanel);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);   
        
    }
    
        
    
    
    
}

