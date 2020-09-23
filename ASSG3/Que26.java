/*
26.Create an array of 17 elements in 5 rows.  And calculate sum of all elements
*/

////////////////////////////////////////////////////////
import java.util.Scanner;
class Que26{

public static void main(String args[]){


    Scanner sc = new Scanner(System.in);
    int arr[] = new int[17];
    int sum = 0;
    System.out.println("Enter elements of array:");
    for(int i=0; i<17; i++)

   {
      arr[i] = sc.nextInt();
     sum =  sum + arr[i];
   }
   System.out.println("Sum of the elements of the array:"+sum);
}
}
