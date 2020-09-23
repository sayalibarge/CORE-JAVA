/*
29.Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.
*/


////////////////////////////////////////////////////
import java.util.Scanner;
class Que29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int r = sc.nextInt();
		int arr[][] = new int[r][];
		int count = 0;
		int count1=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("enter cols for "+i);
			int cols = sc.nextInt();
			arr[i] = new int[cols];
			for(int j=0;j<arr[i].length;j++){
				System.out.println("enter ele");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int ar[] : arr){
			count++;
			for(int a : ar){
				count1++;
				System.out.print("  "+a);
			}
			System.out.println("");
		}
		System.out.println("number of rows in 2-d array "  +count);
		System.out.println("number of elements in 1-d array " +count1);

	}
}