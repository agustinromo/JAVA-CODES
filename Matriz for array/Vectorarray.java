import java.util.Scanner;

public class Vectorarray{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int v=0;
  System.out.print("Dame la longitud de tu vector: " );
  v = in.nextInt();
  int var[] = new int [v];

   for(int i=0;i<var.length;i++){
     System.out.println("Dame un numero en la posicion: " +i); 
     var[i] = in.nextInt();
   }
   for(int i=0;i<var.length;i++){
     System.out.print("["+ var[i] + "]");
   }
  }
 }
