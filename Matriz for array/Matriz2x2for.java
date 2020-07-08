import java.util.Scanner;

public class Matriz2x2for{
 public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  int a=0,b=0;
  System.out.print("Dame la longitud de a: ");
  a = in.nextInt();
  System.out.print("Excelente papu, ahora dame la de b: ");
  b = in.nextInt();
  int matrix[][]= new int [a][b];

  for(int i = 0; i<a; i++){
    for(int j = 0; j<b; j++){
    System.out.print("Dame un numero en la posicion   "+i +j+ ":");
     matrix[i][j] = in.nextInt();
   }
  }
  for(int i = 0; i<a; i++){
    for(int j = 0; j<b; j++){
    System.out.print("["+ matrix[i][j] + "]");
   }
   System.out.println("");
  }
 }
}
