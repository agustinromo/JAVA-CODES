import javax.swing.*;
import javax.swing.event.*; //Ademas de contar con componentes de diseño, swing tambien cuenta con eventos, para usar el JCheckbox se requerirá esta librería

public class Checkbox extends JFrame implements ChangeListener{ //Esta clase nos permite realizar los eventos a un JCheckbox

  private JCheckBox check, check2, check3;

  public Checkbox(){
    setLayout(null);
    check = new JCheckBox("Inglés");
    check.setBounds(10,10,150,30);
    check.addChangeListener(this);
    add(check);

    setLayout(null);
    check2 = new JCheckBox("Francés");
    check2.setBounds(10,50,150,30);
    check2.addChangeListener(this);
    add(check2);

    setLayout(null);
    check3 = new JCheckBox("Alemán");
    check3.setBounds(10,90,150,30);
    check3.addChangeListener(this);
    add(check3);
  }
  public void stateChanged(ChangeEvent e){
    String cad ="";
    if(check.isSelected() == true){ // si el componente check es seleccionado
      cad = cad + "Inglés-"; //la variable cad de tipo String guarda el texto de check
    }
    if(check2.isSelected() == true){
      cad = cad + "Francés-";
    }
    if(check3.isSelected() == true){
      cad = cad + "Alemán-";
    }
    setTitle(cad);//para que aparezca la cad seleccionada en la parte superior de la interfaz
  }
  public static void main(String args[]){
    Checkbox checkin = new Checkbox();
    checkin.setBounds(0,0,350,200);
    checkin.setVisible(true);
    checkin.setResizable(false);
    checkin.setLocationRelativeTo(null);
  }
}
