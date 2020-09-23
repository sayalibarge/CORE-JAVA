/*
28.Initialize one String type of array and print the elements using for each loop


*/

///////////////////////////////////////////////////
import java.util.Scanner;
class Que28{

  public static void main(String args[]){
   Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
   for(int i=0; i<n; i++)
  {
   arr[i] = sc.next();
  }
    System.out.println("using for loop:");
    for(String a:arr)
  {
   System.out.println(a);
  }



}


}
