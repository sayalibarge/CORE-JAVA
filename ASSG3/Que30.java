/*
30.Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.
*/

//////////////////////////////////////////////////////
import java.util.Scanner;
class Que30{

            public static void main(String args[]){

             Scanner sc = new Scanner(System.in);
              int i, j, sum=0;
              int mat[][] = new int[3][3];
              System.out.println("Enter the elements of the array:");
             for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                  {
                     mat[i][j] =sc.nextInt();
                   }
               }
             System.out.println("The elements of the array");
             for(int ar[] : mat){
			for(int a : ar){
				System.out.print("  "+a);
			}
			System.out.println("");
		}
             for(i=0;i<3;i++)
		{
		  for(j=0;j<3;j++)
                  {
		     if(i==j)
                   {
                      sum = sum + mat[i][j];
                    }
                   }
                 }
                  System.out.println("Sum of diagonal elements : "+sum);

}
}