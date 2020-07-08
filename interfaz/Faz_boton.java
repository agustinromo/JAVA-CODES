import javax.swing.*;
import java.awt.event.*; //esta libreria permite controlar los eventos de la interfaz por ejemplo al usar un boton
public class Faz_boton extends JFrame implements ActionListener{//el ActionListener atiende los eventos a ejecutar
  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane slidebar1;
  private JButton boton;

    String texto =""; //el texto que se escribió en el textfield, se guarda en esta variable tipo String para reescribirlo en el textArea y que no se pierda
    public Faz_boton(){
      setLayout(null);
      textfield1 = new JTextField();
      textfield1.setBounds(10,10,200,30);
      add(textfield1);

      textarea1 = new JTextArea(); //no queremos que aprezca texto de inicio por eso dejamos los parentesis asi ()
      slidebar1 = new JScrollPane(textarea1);// le decimos que el componente textarea1 estará dentro del componente JScrollPane
      slidebar1.setBounds(10,50,400,300); //le damos diseño al scrollpane porque el textarea estara dentro de el, por lo tanto
      //es al scrollpane al que hay que darle diseño
      add(slidebar1);//el diseño fue para el scroll, entonces una vez mas, es el scroll el que se debe mostrar, el textarea ahi ta dentro

      //aqui el constructor sera para el diseño de nuestro boton
      boton = new JButton("Add");
      boton.setBounds(250,10,100,30);
      add(boton); //sin el, no aparecera tu boton asi que se debe de poner ok?
      boton.addActionListener(this);//Se le dice al programa que este boton tendra un evento, una tarea, una funcion a realizar
    }
    //aqui viene lo que queremos que realice el evento del boton
    public void actionPerformed(ActionEvent e){//esto es para capturar el evento, es decir, guardarlo en un espacio en memoria que es e, asi nombrado por mi
      if(e.getSource() == boton){//getSource pertenece a la ActionEvent que es la clase que resguarda el evento, para recuperar el evento guardado se usa el getSource
        texto += textfield1.getText() + "\n";//para ir enviando mas datos a la variable texto, se debe usar un acumulador que es ese +=, esto para que no se borre nada de lo anterior escrito
        //sino para que se vayan acumulando los mensajes, la parte de getText, es para que el acumulador recupere cada uno de los mensajes que se van escribiendo
        //finalmente se usa la concatenación \n para pasar del textfield al textArea
        textarea1.setText(texto);//SetText coloca el texto dentro de cualquier componente, por el cntyrario a getText que es el recuperador
        textfield1.setText("");//Con esto se le indica al textfield que debe de limpiarse por completo
      }
    }//Ya tewrmino todo lo que debe hacer el evento del boton
    public static void main(String args[]){
      Faz_boton faz= new Faz_boton();
      faz.setBounds(0,0,540,400);
      faz.setResizable(false);//usuario no modifica las dimensiones
      faz.setVisible(true);//interfaz visible
      faz.setLocationRelativeTo(null);//aparece al centro de la pantalla
    }
}
