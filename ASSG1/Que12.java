import java.util.Scanner;
class Que12{
  
   public static void main(String args[]){

   float Basic , DA , HRA ,GS;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter Basic salary of employee:");
   Basic = sc.nextFloat();

   
 
   if( Basic<10000)
  {
    HRA = Basic * 10 / 100 ;
    
   DA = Basic * 90 / 100;

  System.out.println(" Hra salary = " +HRA);
  System.out.println(" Da salary = " +DA);

  }
   else 
  {


   HRA = 2000;
   DA = Basic * 98 / 100;

   System.out.println(" Hra  salary = " +HRA);
   System.out.println(" Da  = " +DA);
  }


   GS = Basic + HRA + DA ;
 
 System.out.println(" Gross salary = " +GS);



}
}
