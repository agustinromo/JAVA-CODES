//Crearemos una interfaz grafica papu
import javax.swing.*;//Libreria swing para interfaces, el asterisco representa que se usaran todos los elementos de la libreria
public class Formulario extends JFrame { //JFrame extencion de la libreria swing
 private JLabel label1; //la etiqueta label se usa en lugar del System.out, nos permite mostrar texto en la interfaz

 public Formulario(){//ESte es un constructor, el constructor debe tener el mismo nombre de la clase, el constructor contiene
   //todas las dimensiones de la etiqueta y su diseño, incluyendo el mensaje TOD0
  setLayout(null); //se indicara a travez de coordenadas donde van los elementos de la interfaz, para evitar que setLayout los ponga
  //donde quiera, se debe poner el (null)
  label1 = new JLabel("Agus Youngg"); //Este label es un objeto
  label1.setBounds(10,20,200,300); //Coordenadas en las que se posicionara la etiqueta label1, que es el mensaje de arriba, 10 en x
  //20 en y y 200 ancho de pixeles, 300 largo de pixeles, osea las dimensiones y coordenadas
  add(label1);//todo lo realizado en el programa sera agregado en la etiqueta creada label1
 }
 //saliendo del constructor ahora si nos vamos al metodo main
 public static void main(String args[]){
   Formulario formulario1 = new Formulario(); //hemos creado el objeto de tipo FORMULARIO, tal como se llama nuestra clase
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);//Si la interfaz se debe ver o esconder, true para que se vea, false para que no
   formulario1.setLocationRelativeTo(null);//esto es para que aparezca al centro de la pantalla
 }
}
