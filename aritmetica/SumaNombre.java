import java.util.Scanner; //Scanner, librería para ingresar datos de usuario

public class SumaNombre{
 public static void main(String args[]){

  Scanner in = new Scanner (System.in);//Es para que el usuario ingrese datos
  String nomb = ""; //cadena de caracteres para guardar el nombre
  int n1 = 0, n2 = 0, ans = 0;

  System.out.println("Come ti chiami?");
  nomb = in.nextLine();//usuario ingresa texto(nombre)
  System.out.println("Dame un numero:");
  n1 = in.nextInt(); //En el caso anterior fue para el nombre, asqui es para el numero, de tipo int
  System.out.println("Dame un segundo numero:");
  n2 = in.nextInt();
  ans = n1 + n2;
  System.out.println("Mi buen  " + nomb + " el resultado es: " + ans);
 }
}
