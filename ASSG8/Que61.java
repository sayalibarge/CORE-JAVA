/*
61.	Create a Thread class to print following star (*)
 pattern on screen with delay of 1 second between each * print.
 Number of lines in the pattern should be passed to the 
 constructor of Thread class.  *  * * * *  * * * * * * * * * * 
 Use this class in main method and ask user to enter number of 
 lines to print.
*/
////////////////////////////////////////////////////////////
import java.util.Scanner;

class MyThread extends Thread {
	int num;
	
	public MyThread(int num) {
		super();
		this.num = num;
	}

	public void run() {
		for(int i=1;i<=num;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("*"+" ");
		}
		System.out.println("\nEND");
	}
}

public class Que61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		MyThread m = new MyThread(n);
		m.start();
	}

}