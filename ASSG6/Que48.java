/*
48.	Create an Abstract class Processor with int member variable data 
and method showData to display data value. 
Create abstract method process() to define processing of member data.
Create a class  Factorial using abstract class Processor  to 
calculate and print factorial of a number by overriding the process method.
b. Create a class Circle using abstract class Processor to calculate and 
print area of a circle by overriding the process method.
Ask user to enter choice (factorial or circle area). 
 Also ask data to work upon.
 Use Processor class reference to achieve this mechanism.
 */
 
 /////////////////////////////////////////////////////////////////////////
 import java.util.Scanner;

abstract class Processor{
	int member_data;	//instance variable
	void showdata() {	//instance method
		System.out.println(member_data);
	}
	abstract void process(int n);	//abstract method
}
class Factorial extends Processor{
 @Override
	void process(int n) {
		int fact = n;
		for(int i=1;i<n;i++) {
			fact = fact * i;
		}
		System.out.print("Factorial of Number = ");
		Factorial name = new Factorial();
		name.member_data = fact;
		name.showdata();
	}
}

class Circle extends Processor{
	float area = 1;
	void process(int n) {
				
		area = 3.1415f * n * n;
		System.out.println(area);	
	}
//		Circle c = new Circle();
//		c.member_data = area;
}

public class Que48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Choice : ");
		System.out.println("\n1.Factorial \n2.Circle Area");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			System.out.print("Factorial of Number : ");
			int n = sc.nextInt();
			Processor f = new Factorial();
			f.process(n);	
			break;
		}
		case 2: {
			System.out.print("Area of circle Radius: ");
			int r = sc.nextInt();
			Processor f = new Circle();
			f.process(r);	
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
		
	}
}
