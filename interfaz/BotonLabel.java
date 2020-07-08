import javax.swing.*;
import java.awt.event.*;
public class BotonLabel extends JFrame implements ActionListener{
  private JButton boton, boton2, boton3, close; //private es un modificador de acceso recuerda
  private JLabel label;

  public BotonLabel(){
      setLayout(null);
      boton = new JButton("1");
      boton.setBounds(10,100,90,30);
      add(boton);
      boton.addActionListener(this);

      boton2 = new JButton("2");
      boton2.setBounds(110,100,90,30);
      add(boton2);
      boton2.addActionListener(this);

      boton3 = new JButton("3");
      boton3.setBounds(210,100,90,30);
      add(boton3);
      boton3.addActionListener(this);

      close = new JButton("Close");
      close.setBounds(300,250,100,30);
      add(close);
      close.addActionListener(this);

      label = new JLabel("En espera");
      label.setBounds(10,10,300,30);
      add(label);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton){label.setText("Presionaste 1");}//colocar texto por medio de la etiqueta de este modo
    if(e.getSource() == boton2){label.setText("Presionaste 2");}
    if(e.getSource() == boton3){label.setText("Presionaste 3");}
    if(e.getSource() == close){System.exit(0);}
  }
  public static void main(String args[]){
    BotonLabel botonlabel= new BotonLabel();
    botonlabel.setBounds(0,0,450,350);
    botonlabel.setResizable(false);
    botonlabel.setVisible(true);
    botonlabel.setLocationRelativeTo(null);
  }
}
