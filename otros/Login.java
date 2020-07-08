import java.util.Scanner;
public class Login{
 public static void main(String args[]){

 Scanner in = new Scanner(System.in);
 String nomb = "", pass = "";

 System.out.print("usuario/a: ");
 nomb = in.nextLine();
 System.out.print("password: ");
 pass = in.nextLine();
 if(nomb.equals("aromo") && pass.equals("35092ass")){
     System.out.println("Pasale a mis dominios");
  }
  else{
    System.out.println("Usuario/a no autorizado/a. ACCESO DENEGADO");
    System.out.println("   P U T O/A   ");
  }
 }
}
