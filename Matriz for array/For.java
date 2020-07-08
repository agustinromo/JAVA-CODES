public class For{
 public static void main(String args[]){
   int j=99;
  for(int i=1; i<=5; i++){ // si quieres que vaya de 2 en 2 solo pon i+=2, en vez de i++
    if(i<5){
          System.out.print(i+", ");
          System.out.print(j+", ");
        }
        else{
          System.out.print(i+", ");
          System.out.print(j);
        }
          j--;
  }
 }
}
