import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{ //Tanto para botones como para menus, se usa el Actionlistener
private JMenuBar barra; //El MenuBar es para la barra de herramientas
private JMenu menu; //Para el menu
private JMenuItem item, item2, item3; //Son los elementos de los que se compone el menu

public Menu(){
  setLayout(null);
  barra = new JMenuBar();
  setJMenuBar(barra); //es para colocar la barra dentro de la interfaz, usando el componente creado para la barra
  //en este caso no se usa el metodo setBounds, java asignará las dimensiones de la barra en auntomático en base a las dimensiones de la interfaz

  menu = new JMenu("Opciones");
  barra.add(menu); // esto es para añadir menu a la barra de opciones

  item = new JMenuItem("red");
  item.addActionListener(this); //para que ocurra el evento como en el caso de los botones
  menu.add(item); // lo añadimos a menu

  item2 = new JMenuItem("green");
  item2.addActionListener(this);
  menu.add(item2);

  item3 = new JMenuItem("blue");
  item3.addActionListener(this);
  menu.add(item3);
}
public void actionPerformed(ActionEvent e){
  Container fondo = this.getContentPane(); //lo que el programa tiene que hacer es agarrar las dimensiones y caracterisiticas de la interfaz
  //despues las guarda en el contenedor llamado fondo, y es ese contenedor el que cambia de color
  if(e.getSource() == item){//Si el evento ocurrió en el primer item
    fondo.setBackground(new Color(255,0,0)); //si se selecciona la opcion 1 el fondo cambia al color rojo.
  }
  if(e.getSource() == item2){
    fondo.setBackground(new Color(0,255,0));
  }
  if(e.getSource() == item3){
    fondo.setBackground(new Color(0,0,255));
  }
 }
 public static void main (String args[]){
   Menu main= new Menu();
   main.setBounds(0,0,400,300);
   main.setVisible(true);
   main.setLocationRelativeTo(null);
   //Dejaremos que el usuario modifique las dimensiones de la interfaz para demostrar que la barra se adapta a sus cambios de dimension
 }
}
