
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControladorVentanaCalculadora extends VentanaCalculadora {

 public class EscuchaNumero0 implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
        pantalla.setText(pantalla.getText()+"0");                 
      }
 }
 public class EscuchaNumero1 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"1");
     }
 }
  public class EscuchaNumero2 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"2");
     }
 }
   public class EscuchaNumero3 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"3");
     }
 }
   public class EscuchaNumero4 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"4");
     }
 }
   public class EscuchaNumero5 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"5");
     }
 }
   public class EscuchaNumero6 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"6");
     }
 }
   public class EscuchaNumero7 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"7");
     }
 }
   public class EscuchaNumero8 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"8");
     }
 }
   public class EscuchaNumero9 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"9");
     }
 }
   public class EscuchaSuma implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"+");
     }
   }
   public class EscuchaResta implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"-");
     }
   }

        
   public class EscuchaMultiplicacion implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"*");
     }

       
   }
   public class EscuchaDivision implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"*");
     }
   }
   public class EscuchaParentesisAbre implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"(");
     }
   }
   public class EscuchaParentesisCierra implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+")");
     }
   }
   public class EscuchaPunto implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+".");
     }
        
   }
   public class EscuchaEspacio implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+" ");
     }
   }
 public class EscuchaIgual implements ActionListener{
      public void actionPerformed(ActionEvent ae){
         String infijo, postfijo;
         double resp;
         EvaluadorPostfijo e=new EvaluadorPostfijo();
         InfixToPostfix e2=new InfixToPostfix();
         
         postfijo=e2.evaluate(pantalla.getText());//evaluate ==infix to postfix
         try{
             resp= e.EvaluacionPostfijo(postfijo);
             pantalla.setText(""+resp);
             
         }catch(Unchecked c){
             pantalla.setText("Error");
         }
     
     } 
      pantalla.setText("");   
 }
 
 
 
 
 //constructor controlador
 public ControladorVentanaCalculadora(){
     super();
     Calculadora Calcu=new Calculadora("T");
     boton0.addActionListener(new EscuchaNumero0());
     boton1.addActionListener(new EscuchaNumero1());
     boton2.addActionListener(new EscuchaNumero2());
     boton3.addActionListener(new EscuchaNumero3());
     boton4.addActionListener(new EscuchaNumero4());
     boton5.addActionListener(new EscuchaNumero5());
     boton6.addActionListener(new EscuchaNumero6());
     boton7.addActionListener(new EscuchaNumero7());
     boton8.addActionListener(new EscuchaNumero8());
     boton9.addActionListener(new EscuchaNumero9());
     botonSuma.addActionListener(new EscuchaSuma());
     botonResta.addActionListener(new EscuchaResta());
     botonMultiplicacion.addActionListener(new EscuchaMultiplicacion());
     botonDivision.addActionListener(new EscuchaDivision());
     botonParentesisAbre.addActionListener(new EscuchaParentesisAbre());
     botonParentesisCierra.addActionListener(new EscuchaParentesisCierra());
     botonEspacio.addActionListener(new EscuchaEspacio());
     botonPunto.addActionListener(new EscuchaPunto());
     botonIgual.addActionListener(new EscuchaIgual());
 }

    
    
    
    
}
