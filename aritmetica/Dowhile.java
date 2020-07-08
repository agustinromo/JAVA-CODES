public class Dowhile{
 public static void main(String args[]){
  int i = 1, j = 99;
  do{
    System.out.print(i+ ", ");
    System.out.print(j+ ", ");
    i++;
    j--;
  }while(i<=5 && j>=95);
 }
}
