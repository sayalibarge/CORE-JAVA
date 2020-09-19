import java.util.Scanner;
class Que23{

      public static void main(String args[]){
      
      Scanner sc = new Scanner(System.in);
     int n;
     System.out.print("Enter  no of elements:");
      n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("original array:");
      for(int i = 0 ; i < arr.length ; i++){
			arr[i]= sc.nextInt();
		}	
		for(int i = 0,j=arr.length-1 ; i < arr.length/2 ; i++ ,j--){
			int a = 0;
			a = arr[i];
			arr[i] = arr[j];
			arr[j]=a;
				
		}

     System.out.println("Array in reverse order:");
     for(int a : arr){
			System.out.println(a);
		}
   }
}

   

      
       