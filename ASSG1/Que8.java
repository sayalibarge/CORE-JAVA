import java.util.Scanner;
class Que8{
   public static void main(String args[]){
   float p, r, t;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Principal : ");
    p = sc.nextFloat();
   System.out.print("Enter the Rate of interest : ");
    r = sc.nextFloat();
   System.out.print("Enter the Time : ");
    t = sc.nextFloat();
    float si;
   si = (r * t * p) / 100;
   System.out.print("Simple Interest is :" +si);
    
     
     
   }
}