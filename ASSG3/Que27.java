/*
27.Write a program to fine the smallest and greatest number present in the array of integer type
*/

//////////////////////////////////////////
import java.util.Scanner;
class Que27{

  public static void main(String args[]){

     System.out.print("Enter the number:");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      int arr[] = new int[n];
      
       int max=0;
	for(int i=0;i<arr.length;i++)
        {
		arr[i] = sc.nextInt();		
	}

	int min=arr[0];
	for(int a:arr)
       {
		if(min>a){
			min=a;
		}
		if(max<a){
			max=a;
		}	
	}
	System.out.println("Min = "+min);
	System.out.println("Min = "+max);     
               
  }         
}




