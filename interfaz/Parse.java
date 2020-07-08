import javax.swing.*;
import java.awt.event.*;
public class Parse extends JFrame implements ActionListener{
  private JTextField textfield1, textfield2;
  private JLabel label1, label2, label3;
  private JButton boton;

  public Parse(){
    setLayout(null);
    label1 = new JLabel("N1:");
    label1.setBounds(50,5,100,30);
    add(label1);
    label2 = new JLabel("N2:");
    label2.setBounds(50,35,100,30);
    add(label2);
    label3 = new JLabel("ANS:");
    label3.setBounds(120,80,100,30);
    add(label3);

    textfield1 = new JTextField(); //no aparecerá ningún mensaje de inicio, al dejar los parentesis solo asi ()
    textfield1.setBounds(120,10,150,20);
    add(textfield1);
    textfield2 = new JTextField(); //no aparecerá ningún mensaje de inicio, al dejar los parentesis solo asi ()
    textfield2.setBounds(120,40,150,20);
    add(textfield2);

    boton = new JButton("Sumar");
    boton.setBounds(10,80,100,30);
    add(boton);
    boton.addActionListener(this);
}
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton){int n1=0,n2=0,ans=0;
          n1 = Integer.parseInt(textfield1.getText()); //Se utiliza el parseo para convertir el valor a entero y ahora si poderlo guardar en la variable n1
          n2 = Integer.parseInt(textfield2.getText());
          ans = n1 + n2;
          label3.setText("Resultado: "+ ans); //setText para la colocación del texto
        }
    }
    public static void main(String args[]){
      Parse parseo= new Parse();
      parseo.setBounds(0,0,300,150);
      parseo.setResizable(false);
      parseo.setVisible(true);
      parseo.setLocationRelativeTo(null);
  }
}
