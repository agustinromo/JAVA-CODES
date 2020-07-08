import javax.swing.*;
public class Formulario2 extends JFrame{

 public Formulario2(){
  setLayout(null);
 }
 public static void main(String args[]){
   Formulario2 form = new Formulario2();
   form.setBounds(0,0,400,550);
   form.setVisible(true);
   form.setLocationRelativeTo(null); //Siempre aparecera al centro la interfaz, valiendole madre las coordenadas
   form.setResizable(false); //No permitimos que el usuario modifique la dimension de la interfaz con false, si con true
 }
}
