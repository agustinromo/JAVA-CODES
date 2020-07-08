import javax.swing.*;
import java.awt.event.*;
public class Texto extends JFrame implements ActionListener{
  private JTextField textfield;
  private JLabel label;
  private JButton boton;

  public Texto(){
    setLayout(null);
    label = new JLabel("Usuario:");
    label.setBounds(10,10,100,30);
    add(label);

    textfield = new JTextField(); //no aparecerá ningún mensaje de inicio, al dejar los parentesis solo asi ()
    textfield.setBounds(120,17,150,20);
    add(textfield);

    boton = new JButton("Aceptar");
    boton.setBounds(10,80,100,30);
    add(boton);
    boton.addActionListener(this);
  }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton){String texto = textfield.getText();//con ayuda de este metodo obtenemos el texto que el usuario ingresó
          setTitle(texto); //se coloca en la parte de arriba de la interfaz el texto que el usuario ingresó
        }
    }
    public static void main(String args[]){
      Texto text= new Texto();
      text.setBounds(0,0,300,150);
      text.setResizable(false);
      text.setVisible(true);
      text.setLocationRelativeTo(null);
    }
}
