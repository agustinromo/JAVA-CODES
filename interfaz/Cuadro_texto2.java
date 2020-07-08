//aqui usamos las barras deslizadoras para el texto
import javax.swing.*;

public class Cuadro_texto2 extends JFrame{

  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane slidebar1;

  public Cuadro_texto2(){
      setLayout(null);
      textfield1 = new JTextField();
      textfield1.setBounds(10,10,200,30);
      add(textfield1);

      textarea1 = new JTextArea(); //no queremos que aprezca texto de inicio por eso dejamos los parentesis asi ()
      slidebar1 = new JScrollPane(textarea1);// le decimos que el componente textarea1 estará dentro del componente JScrollPane
      slidebar1.setBounds(10,50,400,300); //le damos diseño al scrollpane porque el textarea estara dentro de el, por lo tanto
      //es al scrollpane al que hay que darle diseño
      add(slidebar1);//el diseño fue para el scroll, entonces una vez mas, es el scroll el que se debe mostrar, el textarea ahi ta dentro
  }
  public static void main(String args[]){
    Cuadro_texto2 cuadro = new Cuadro_texto2();
    cuadro.setBounds(0,0,540,400);
    cuadro.setResizable(false);
    cuadro.setVisible(true);
    cuadro.setLocationRelativeTo(null);
  }
}
