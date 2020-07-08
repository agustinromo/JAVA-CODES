public class If{
 public static void main(String args[]){
  float mat = 5, bio = 8, quim = 7, prom = 0; 
  prom = (mat + bio + quim)/3; 
   if(prom >= 6)
   { 
    System.out.println("Aprobado " + prom);
  }
   else{ 
   System.out.println("No, reprobado " + prom);
  }
 }
}