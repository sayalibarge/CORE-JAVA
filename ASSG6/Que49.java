/*
49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%.
 create abstract method calcTax().
 a. Create class Employee(empId,name,salary) and 
 implement Taxable to calculate incomeTax on yearly salary.
 b. Create class Product(pid,price,quantity) and 
 implement Taxable to calculate salesTax on unit price of product. 
 c. Create class for main method(Say XYZ), accept employee information 
 and a product information from user and print income tax and sales tax respectively.
 */
 /////////////////////////////////////////////////////////////////////////////////
 import java.util.Scanner;

interface Taxable{
	double salesTax = 0.07;
	double incomeTax = 0.105;
	void calcTac();
}

class Employee implements Taxable{
	
	int empId,salary;
	String name;
	
	
	public Employee(int empId, int salary, String name) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}


	@Override
	public void calcTac() {
		double ysal = salary*12;
		double tax = ysal * incomeTax;
		System.out.println("Yearly Salary is : "+ysal);
		System.out.println("Income Tax is : "+tax);
	}

}

class Product implements Taxable{
	int pid,price,quantity;

	public Product(int pid, int price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public void calcTac() {
		double t  = price * quantity ;
		double tax = t*salesTax;
		double total = t + tax;
		double unitP = total/quantity;
		System.out.println("Total sales tax : "+tax);
		System.out.println("Unit price of product : "+unitP);
	}
	
}

//c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax 
//and sales tax respectively.

public class Que49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Details :");
		System.out.print("Employee ID : ");
		int eid = sc.nextInt();
		System.out.print("Enter the Employee Salary :");
		int sal = sc.nextInt();
		System.out.print("Enter the Employee Name : ");
		String name = sc.next();
		
		Taxable e = new Employee(eid,sal,name);
		e.calcTac();
		
		System.out.println("Enter the Product details : ");
		System.out.print("Enter the product Id : ");
		int pid = sc.nextInt();
		System.out.println("Enter the price of the product : ");
		int price = sc.nextInt();
		System.out.println("Enter the Quatity of Product :");
		int q = sc.nextInt();
		
		Taxable p = new Product(pid,price,q);
		p.calcTac();
	}

}