import javax.swing.*;
import java.awt.event.*;
public class Combobox extends JFrame implements ItemListener{//Se coloca la clase ItemListener, porque queremos que la clase este al pendiente del momento en que ocurre el evento
  private JComboBox combo;

  public Combobox(){
    setLayout(null);
    combo = new JComboBox();
    combo.setBounds(10,10,80,20);
    add(combo);

    combo.addItem("red"); //Lo que queremos que diga nuestro combo
    combo.addItem("green");
    combo.addItem("blue");
    combo.addItem("yell");
    combo.addItem("black");
    combo.addItemListener(this); //indicamos que el combo tendra un evento
  }
  public void itemStateChanged(ItemEvent e){//cada vez que haya una diferente seleccion, se guardara el cambio del evento, para eso es el StateChanged
      if(e.getSource() == combo){String selec = combo.getSelectedItem().toString();//recupera el texto seleccionado por el usuario y lo guarda en selec
        //to.String() le decimos que convierta a String lo que se selecciono del item
        setTitle(selec);
      }
  }
  public static void main(String args[]){
    Combobox combox= new Combobox();
    combox.setBounds(0,0,200,150);
    combox.setResizable(false);
    combox.setVisible(true);
    combox.setLocationRelativeTo(null);
  }
}
