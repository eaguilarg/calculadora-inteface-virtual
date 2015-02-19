
package calculadora;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVentanaCalculadora extends VentanaCalculadora {
 public class EscuchaOperacion implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
           String Snumero,Snumero2, Sresp;
           Double numero,numero2;
           Double resp;
           
           Snumero=pantalla.getText();
           numero=Double.valueOf(Snumero);
           pantalla.setText(" ");
           Snumero2=pantalla.getText();
           numero2=Double.valueOf(Snumero2);
            switch(operador){
               case("+"):
                 resp=numero+numero2;  
                 Sresp=resp.toString();
                 pantalla.setText(Sresp);
                   break;
                case("-"):
                 resp=numero-numero2;  
                 Sresp=resp.toString();
                 pantalla.setText(Sresp);
                    break;
                case("*"):
                 resp=numero*numero2;  
                 Sresp=resp.toString();
                 pantalla.setText(Sresp);
                    break;
                case("/"):
                if(numero2!=0){
                    resp=numero/numero2;  
                    Sresp=resp.toString();
                    pantalla.setText(Sresp);
                }
                else
                    pantalla.setText("No se puede dividir entre cero");
                    break;
                       
           }
        }
     
 }
 public class EscuchaNumeros implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
           
            switch(5){
                case(0):
                    
                    
                    
            }
           
        }
     
 }
 
 //constructor controlador
 public ControladorVentanaCalculadora(){
     super();
     Calculadora Calcu=new Calculadora("TI NSpire CX-CAS");
     boton0.addActionListener(new EscuchaNumeros());
     botonSuma.addActionListener(new EscuchaOperacion());
 }
    
    
    
    
    
}
