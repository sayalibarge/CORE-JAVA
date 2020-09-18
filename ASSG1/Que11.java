import java.util.Scanner;
class Que11{
   public static void main(String args[]){
     int a ,b;
     Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the value of a and b :");
    a = sc.nextInt();
    b = sc.nextInt();
   System.out.println("Enter the value of a and b before swapping:"+a+" "+b);
    a = a + b;
    b = a - b;
    a = a - b;
   System.out.println("The value of a and b after swapping:"+a+" "+b);

  }
}
