import javax.swing.*;
public class Interfaz extends JFrame {
 private JLabel label1;
 private JLabel label2;
//iniciamos con el constructor
 public Interfaz(){
  setLayout(null);
  label1 = new JLabel("La fatima esta bien sabrosa");
  label1.setBounds(10,20,300,30);
  add(label1); //sin este metodo no te va a mostrar nada heee
  label2 = new JLabel("ne ni tanto");
  label2.setBounds(10,100,100,30);
  add(label2);
 }
 //termino el constructor, a programar ahora si
 public static void main(String args[]){
   Interfaz interfaces = new Interfaz();
   interfaces.setBounds(0,0,300,200);
   interfaces.setResizable(false);
   interfaces.setVisible(true);
   interfaces.setLocationRelativeTo(null);
 }
}
