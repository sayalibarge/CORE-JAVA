/*
54.	Write a program to reverse the given String.
*/
/////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Que54 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.next();
		
		StringBuilder str = new StringBuilder(s);
		System.out.println("Input String: " + str);
		
		str.reverse();
		System.out.print("Reversed String: "+str);
		
	}
}