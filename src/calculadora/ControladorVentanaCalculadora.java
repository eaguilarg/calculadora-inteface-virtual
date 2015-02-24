
package calculadora;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControladorVentanaCalculadora extends VentanaCalculadora {
 public class EscuchaOperacion implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
       
                       
           }
        }
     
 
 public class EscuchaNumero0 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
        pantalla.setText(pantalla.getText()+"0");                 
      }
 }
 public class EscuchaNumero1 implements ActionListener{
     public void actionPerformed(ActionEvent ae){
         pantalla.setText(pantalla.getText()+"1");
     }
 }
 
 
 
 
 //constructor controlador
 public ControladorVentanaCalculadora(){
     super();
     Calculadora Calcu=new Calculadora("TI NSpire CX-CAS");
     boton0.addActionListener(new EscuchaNumero0());
     boton1.addActionListener(new EscuchaNumero1());
     
 }

    
    
    
    
}
