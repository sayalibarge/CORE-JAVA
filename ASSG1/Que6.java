import java.util.Scanner;
class Que6{
   public static void main(String args[]){
   int r;
   double pi=3.14 ,area;
   double circum;
   Scanner sc = new Scanner(System.in);
     
     r =  sc.nextInt();
     System.out.println("radius of circle=" +r);
     area = pi * r * r;
     System.out.println("Area of circle="+area);
     circum = 2 * pi * r;
     System.out.println("Circumference of circle="+circum);
     
   }
}
