import java.util.Scanner;
class Que13b{


  public static void main(String args[]){

  int n1, n2, n3 ,max;

   Scanner sc = new Scanner(System.in);
   n1 = sc.nextInt();
   n2 = sc.nextInt();
   n3 = sc.nextInt();
  max = n3 > ( n1 > n2 ? n1 : n2) ? n3 : (( n1 > n2) ? n1 : n2);
  
   System.out.println("Largest number:"+max);
}
}
