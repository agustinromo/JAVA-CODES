import java.util.Scanner;
public class Nombres{
 public static void main(String args[]){

 Scanner in = new Scanner(System.in);
 String nomb = "", nomb2 = "";

 System.out.print("Dame un nombre ");
 nomb = in.nextLine();
 System.out.print("Dame otro nombre ");
 nomb2 = in.nextLine();
 if(nomb.equalsIgnoreCase(nomb2)){        //ora si podrás hacer tu traductor WEY!!!
   //egualsIgnoreCase es para que le valga pito si lo escribes en minus o MAYUS
   System.out.println("Ambos son el mismo nombre");
  }
  else{
     System.out.println("El nombre "+ nomb + " y el nombre "+ nomb2 + " son diferentes weee");
  }
 }
}
