import java.util.Scanner;

public class Sistema{
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);
  String nomb = "";
  int clave = 0, antiguedad = 0;

  System.out.println("*******************************************");
  System.out.println("Bienvenido al sistema vacacional de la coca");
  System.out.println("*******************************************");
  System.out.println("");

  System.out.print("Nombre del trabajador: ");
  nomb = entrada.nextLine();
  System.out.println("");

    System.out.print("Tiempo de servicio: ");
    antiguedad = entrada.nextInt();
      System.out.println("");

      System.out.print("Clave del trabajador: ");
      clave = entrada.nextInt();
        System.out.println("");
//////////datos del trabajador
        if(clave == 1){
          if(antiguedad == 1){
            System.out.println("El trabajador " + nomb + " merece 6 dias de vacacion");
          }
          else if(antiguedad >= 2 && antiguedad <= 6){
            System.out.println("El trabajador " + nomb + " merece 14 dias de vacacion");
          }
          else if(antiguedad >= 7){
              System.out.println("El trabajador " + nomb + " merece 20 dias de vacacion");
          }
        }
        else if(clave == 2){
          if(antiguedad == 1){
            System.out.println("El trabajador " + nomb + " merece 7 dias de vacacion");
          }
          else if(antiguedad >= 2 && antiguedad <= 6){
            System.out.println("El trabajador " + nomb + " merece 15 dias de vacacion");
          }
          else if(antiguedad >= 7){
              System.out.println("El trabajador " + nomb + " merece 22 dias de vacacion");
          }
        }
        else if(clave == 3){
          if(antiguedad == 1){
            System.out.println("El trabajador " + nomb + " merece 10 dias de vacacion");
          }
          else if(antiguedad >= 2 && antiguedad <= 6){
            System.out.println("El trabajador " + nomb + " merece 20 dias de vacacion");
          }
          else if(antiguedad >= 7){
              System.out.println("El trabajador " + nomb + " merece 30 dias de vacacion");
          }
        }
        else
        {
          System.out.println("Error: dato incorrecto");
        }
 }
}
