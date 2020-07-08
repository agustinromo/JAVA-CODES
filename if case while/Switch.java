import java.util.Scanner;

public class Switch{
 public static void main(String args[]){
   Scanner dato = new Scanner(System.in);

  int n1=5, n2=3, n3=0;
  int value=0;
  value = dato.nextInt();
  switch(value){
    case 1: n3 = n1+n2;
            System.out.println(" " + n3);
            break;
    case 2: n3 = n1-n2;
            System.out.println(" " + n3);
            break;
    case 3: n3 = n1*n2;
            System.out.println(" " + n3);
            break;
    case 4: n3 = n1/n2;
            System.out.println(" " + n3);
            break;
    default: System.out.println("NO SEAS MAMON");
            break;
  }
 }
}
