import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Submenu extends JFrame implements ActionListener{ //Tanto para botones como para menus, se usa el Actionlistener
private JMenuBar barra; //El MenuBar es para la barra de herramientas
private JMenu menu, dimension, fondo; //Para el menu
private JMenuItem dimen1, dimen2, item, item2, item3; //elementos de los menus o submenus

public Submenu(){
  setLayout(null);
  barra = new JMenuBar();
  setJMenuBar(barra);

  menu = new JMenu("Opciones");
  barra.add(menu);

  dimension = new JMenu("Dimension");
  menu.add(dimension);

  fondo = new JMenu("Color");
  menu.add(fondo);

  dimen1 = new JMenuItem("300*200");
  dimen1.addActionListener(this); //para que ocurra el evento como en el caso de los botones
  dimension.add(dimen1);

  dimen2 = new JMenuItem("640*480");
  dimen2.addActionListener(this); //para que ocurra el evento como en el caso de los botones
  dimension.add(dimen2);

  item = new JMenuItem("red");
  item.addActionListener(this); //para que ocurra el evento como en el caso de los botones
  fondo.add(item);

  item2 = new JMenuItem("green");
  item2.addActionListener(this); //para que ocurra el evento como en el caso de los botones
  fondo.add(item2);

  item3 = new JMenuItem("blue");
  item3.addActionListener(this); //para que ocurra el evento como en el caso de los botones
  fondo.add(item3);
}

  public void actionPerformed(ActionEvent e){
    if(e.getSource()== dimen1){
      setSize(300,200); // esto es para la modificacion de las dimensiones de la interfaz desde la interfaz, en este caso no hay container
    }
    if(e.getSource()== dimen2){
      setSize(640,480);
    }
    if(e.getSource()== item){
      getContentPane().setBackground(new Color(255,0,0));//Usamos directamente el fondo de la interfaz gráfica, ya no hay necesidad del container
    }
    if(e.getSource()== item2){
      getContentPane().setBackground(new Color(0,255,0));
    }
    if(e.getSource()== item3){
      getContentPane().setBackground(new Color(0,0,255));
    }
}
public static void main(String arg[]){
  Submenu submenu = new Submenu();
  submenu.setBounds(0,0,300,200);
  submenu.setVisible(true);
  submenu.setResizable(false);
  submenu.setLocationRelativeTo(null);
 }
}
