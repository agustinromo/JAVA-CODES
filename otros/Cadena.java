import java.util.Scanner;

public class Cadena{
 public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int ch, from, to;
  String nomb = "", newnomb;
  System.out.print("Dame el nombre: ");
  nomb = in.nextLine();
  ch = nomb.length();
  System.out.println("El nombre "+ nomb + " se compone de " + ch + " caracteres papu");
  System.out.print("Ahora dame el from: ");
  from = in.nextInt();
  System.out.print("Ahora dame el to: ");
  to = in.nextInt();
  newnomb = nomb.substring(from,to);
  System.out.println("Ahora el nombre "+ nomb + " ha cambiado a " + newnomb + " papu");
 }
}
