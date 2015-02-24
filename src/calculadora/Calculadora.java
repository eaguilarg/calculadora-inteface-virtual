package calculadora;

public class Calculadora {
    
   public String modelo; 
    public Calculadora(String modelo){
        this.modelo=modelo;
    }

  
    public static void main(String[] args) {
       ControladorVentanaCalculadora m=new ControladorVentanaCalculadora();
      
       
       m.pack();
       m.setVisible(true);
        
    }
    
}
