//Este programa es el acceso a la investigación del caso de Cindy Crawford
import java.util.Scanner;
import javax.swing.*;
public class Casocindy extends JFrame{
  private JTextField textfield1;
  private JTextArea textarea1;
  public Casocindy(){
      setLayout(null);
      textfield1 = new JTextField();
      textfield1.setBounds(10,10,200,30);
      add(textfield1);
      textarea1 = new JTextArea();
      textarea1.setBounds(10,50,400,300);
      add(textarea1);
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String nomb = "", pass = "", ans = "";
    System.out.print("Ke tranza wey, que quieres: ");
    ans = in.nextLine();
    if(ans.equals("investigo el caso cindy") || ans.equals("investigo caso cindy")){
        System.out.println("ah ok, yo tengo la información en mi disco duro por cortesia del detective");
        System.out.println("tendrás que decir las palabras mágicas para llegar a ella");
        System.out.print("usuario/a: ");
        nomb = in.nextLine();
        System.out.print("password: ");
        pass = in.nextLine();
        if(nomb.equals("aromo") && pass.equals("35092ass")){
            System.out.println("Bienvenido");
            Casocindy cindy = new Casocindy();
            cindy.setBounds(0,0,540,400);
            cindy.setResizable(false);
            cindy.setVisible(true);
            cindy.setLocationRelativeTo(null);
         }
         else{
           System.out.println("Usuario/a o password no autorizados/as. ACCESO DENEGADO");
           System.out.println("     ¡¡¡CHINGA TU MADRE!!!   ");
         }
     }
     else{
       System.out.println("no pues suerte con eso, no podre ayudarte con esas mamadas");
     }
  }
}
