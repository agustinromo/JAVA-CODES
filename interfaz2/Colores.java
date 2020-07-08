import javax.swing.*;
import java.awt.*; // la libreria awt tiene la funcion de proporcionar tanto diseño, como eventos por eso la estoy usando dos veces, en este caso es para los colores
import java.awt.event.*; //aqui awt como ya ha sido en ocasiones anteriores es para eventos
public class Colores extends JFrame implements ActionListener{
  private JLabel label1, label2, label3;
  private JComboBox combo1, combo2, combo3;
  private JButton boton;

  public Colores(){
    setLayout(null);
    label1 = new JLabel("Red");
    label1.setBounds(10,10,100,10);
    add(label1);

    combo1 = new JComboBox();
    combo1.setBounds(120,10,50,30);
    for(int i = 0; i <=255; i++){
    combo1.addItem(String.valueOf(i)); //Esto es para que el combo tenga los numeros del 0 al 255. Convertimos la variable entera i a String(cadena), pues no
    //no podemos dejarla como variable entera
   }
   add(combo1);

   label2 = new JLabel("Green");
   label2.setBounds(10,50,100,10);
   add(label2);

   combo2 = new JComboBox();
   combo2.setBounds(120,50,50,30);
   for(int i = 0; i <=255; i++){
   combo2.addItem(String.valueOf(i)); //Esto es para que el combo tenga los numeros del 0 al 255. Convertimos la variable entera i a String(cadena), pues no
   //no podemos dejarla como variable entera
  }
  add(combo2);

  label3 = new JLabel("Blue");
  label3.setBounds(10,90,100,10);
  add(label3);

  combo3 = new JComboBox();
  combo3.setBounds(120,90,50,30);
  for(int i = 0; i <=255; i++){
  combo3.addItem(String.valueOf(i)); //Esto es para que el combo tenga los numeros del 0 al 255. Convertimos la variable entera i a String(cadena), pues no
  //no podemos dejarla como variable entera
 }
 add(combo3);

 boton = new JButton("Fijar Color");
 boton.setBounds(10,130,100,30);
 add(boton);
 boton.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton){
    String cad1 = combo1.getSelectedItem().toString();
      String cad2 = combo2.getSelectedItem().toString();
        String cad3 = combo3.getSelectedItem().toString();
        //para tomar los datos de un jcombobox, deben estar forzosamente en String, por eso se realiza el parseo para convertir a String
//volvemos a parsear para ahora si convertir los valores a entero
        int red = Integer.parseInt(cad1);
        int green = Integer.parseInt(cad2);
        int blue = Integer.parseInt(cad3); //gracias a estas variables, el usuario podrá modificar las tonalidades de los colores desde la interfaz

        Color color = new Color(red,green,blue); //Se crea un nuevo objeto de tipo color
        boton.setBackground(color); //Esa tonalidad se le debe de poner de fondo al boton
   }
 }
 public static void main(String args[]){
   Colores colores= new Colores();
   colores.setBounds(0,0,190,220);
   colores.setResizable(false);
   colores.setVisible(true);
   colores.setLocationRelativeTo(null);
 }
}
