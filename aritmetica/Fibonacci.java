public class Fibonacci{
 public static void main(String args[]){

  int i = 0, a = 0, b = 1, c = 0;
  for(i=0;i<10;i++){
    if(a == 34){
      System.out.print(a);
    }
    else{
    System.out.print(a+",");
    c = a+b;
    a = b;
    b = c;
   }
  }
   i = 0;
   a = 0;
   b = 1;
   c = 0;
  System.out.println("");
  System.out.println(" ahora con while");
  while(i<10){
    if(a == 34){
      System.out.print(a);
    }
    else{
    System.out.print(a+",");
    c = a+b;
    a = b;
    b = c;
   }
   i++;
  }
  i = 0;
  a = 0;
  b = 1;
  c = 0;
 System.out.println("");
 System.out.println(" ahora con DOwhile");
 do{
   if(a == 34){
     System.out.print(a);
   }
   else{
   System.out.print(a+",");
   c = a+b;
   a = b;
   b = c;
  }
  i++;
}while(i<10);
 }
}
