import java.util.Scanner;
class Que7{
   public static void main(String args[]){

   float eng, phy, chem, math,comp;
   double sum,percentage;
   Scanner sc = new Scanner(System.in);
     
     
     System.out.println("Enter marks of 5 subjects:");
     eng = sc.nextFloat();
     phy = sc.nextFloat();
     chem = sc.nextFloat();
     math = sc.nextFloat();
     comp = sc.nextFloat();
   
   sum = eng + phy + chem + math + comp ;
    percentage = (sum / 500.0 ) * 100;

    System.out.println("Sum:" +sum);
     System.out.println("Percentage:" +percentage);
    
   }
}
