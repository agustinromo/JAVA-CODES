import javax.swing.*;
import java.awt.event.*; //esta libreria permite controlar los eventos de la interfaz por ejemplo al usar un boton
public class Boton extends JFrame implements ActionListener{//el ActionListener atiende los eventos a ejecutar
  JButton boton;
//aqui el constructor sera para el diseño de nuestro boton
  public Boton(){
    setLayout(null);
    boton = new JButton("Close");
    boton.setBounds(300,250,100,30);
    add(boton); //sin el, no aparecera tu boton asi que se debe de poner ok?
    boton.addActionListener(this);//Se le dice al programa que este boton tendra un evento, una tarea, una funcion a realizar
  }
  //aqui viene lo que queremos que realice el evento del boton
  public void actionPerformed(ActionEvent e){//esto es para capturar el evento, es decir, guardarlo en un espacio en memoria que es e, asi nombrado por mi
    if(e.getSource() == boton){//getSource pertenece a la ActionEvent que es la clase que resguarda el evento, para recuperar el evento guardado se usa el getSource
      System.exit(0);//Se cierra la interfaz al presionar el boton, ese sera el evento, la funcion del boton
    }
  }
  //Y pues finalmente usamos el void main para darle formato a la interfaz ;)
  public static void main(String args[]){
    Boton boton= new Boton();
    boton.setBounds(0,0,450,350);
    boton.setResizable(false);
    boton.setVisible(true);
    boton.setLocationRelativeTo(null);
  }
}
