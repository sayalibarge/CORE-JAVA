import java.util.Scanner;
class Que25{
            public static void main(String args[]){


            int n ,sumE = 0, sumO = 0;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the no of elements in array:");
           n = sc.nextInt();
           int a[] = new int[n];
           System.out.println("Enter the elements of array:");
 	   for(int i = 0; i < n; i++)
 	  {
            a[i] = sc.nextInt();
           }

          for(int i = 0; i < n; i++)
	{
           if(a[i] % 2 == 0)
           {
              sumE = sumE + a[i];
           }
            else
           {
               sumO = sumO + a[i];
           }
        }
   System.out.println("sum of even numbers:"+sumE);
  System.out.println("sum of odd numbers:"+sumO);
  }
}









   
  


