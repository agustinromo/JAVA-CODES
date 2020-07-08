import javax.swing.*;

public class Cuadro_texto extends JFrame{

  private JTextField textfield1;
  private JTextArea textarea1;

  public Cuadro_texto(){
      setLayout(null);
      textfield1 = new JTextField();
      textfield1.setBounds(10,10,200,30);
      add(textfield1);

      textarea1 = new JTextArea(); //no queremos que aprezca texto de inicio por eso dejamos los parentesis asi ()
      textarea1.setBounds(10,50,400,300);
      add(textarea1);
  }
  public static void main(String args[]){
    Cuadro_texto cuadro = new Cuadro_texto();
    cuadro.setBounds(0,0,540,400);
    cuadro.setResizable(false);
    cuadro.setVisible(true);
    cuadro.setLocationRelativeTo(null);
  }
}
