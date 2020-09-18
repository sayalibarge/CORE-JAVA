import java.util.Scanner;
class Que11{
   public static void main(String args[]){
     double f,c;
    Scanner sc =  new Scanner(System.in);
   System.out.println("Enter Fahrenheit temperature");
      f = sc.nextDouble();
     c=(f-32)*5/9;
   System.out.println("Celsius  temperature is = "+c);
  }
}
