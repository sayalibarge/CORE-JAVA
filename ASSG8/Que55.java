/*
55.	Write a program to count no of words in the String.
*/
///////////////////////////////////////////////////////////
import java.util.Scanner;

public class Que55 {

	public static void main(String[] args) {
	    //to count word in string
		String str = "Hello CDAC Mumbai and CDAC Juhu";
		System.out.println(str);
		String arr[] = str.split(" ");
		int a = arr.length;
		System.out.println(a);
		
		//to count string length
		/*
		String str = "Hello CDAC Mumbai and CDAC Juhu";
		int a = str.length();
		System.out.println(a);
		*/
		
	}

}