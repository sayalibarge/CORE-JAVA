import java.util.Scanner;
class Que21{

    public static void main(String args[]){

                Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i : arr){
			sum+=i;	
		}
		double average = (double)sum/10.00;
		System.out.println("sum is "+sum);
		System.out.printf("Average is %.2f",average);
    }

}