import java.util.Scanner;
import java.lang.Math;
class Que20{

     public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
        
          System.out.println("Enter lower bound of the interval:");
          int a = sc.nextInt();

          System.out.println("Enter upper bound of the interval:");
          int  b = sc.nextInt();
    
         for(int i=a; i <= b ; i++){
              boolean flag = false;
              for(int j=2 ; j <= Math.sqrt(i);j++)
            {
                  if( i % j == 0) 
                   {
                     flag = true;
                    }
            }
           if(flag == false)
          {
          System.out.println(i);
           }
        }
    }
}

   
       
      

  
