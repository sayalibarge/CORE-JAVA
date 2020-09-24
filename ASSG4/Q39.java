/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.Scanner;
import java.util.*;
///////////////////////////////////////////////////////////////////////
class Product{
	private int pid ;
	private double price ;
	private int quantity ;
	Product(){}
	Product(int pid,double price ,int quantity){
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	double getPrice(){
		return price;
	}
	int getPid()
	{
	     return pid;
	}
	static double totalAmount(Product []arr){
		double sum = 0;
		for(Product i : arr)
		{
			
			sum+=(i.price*i.quantity);
		}
		return sum;
		
	}
	
}
class Q39{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		Product [] arr = new Product[5];
		System.out.println("Enter the 5 product elements ");
		for(int i = 0 ; i < 5 ; i++){
			System.out.print("Enter id : " );
			int pid = sc.nextInt();
			
			System.out.print("Enter price : " );
			double price = sc.nextDouble();
			
			System.out.print("Enter quantity : " );
			int quantity1 = sc.nextInt();
			
			arr[i] = new Product(pid,price,quantity1);
			//prr[i]=(Product)p.clone();
		}
		double max = 0;
		Product index = arr[0];
		for(Product i : arr)
		{
		    if(max < i.getPrice())
			{
				max = i.getPrice();
				index = i;
			}
		}
		System.out.println("\n Pid with highest Price (Rs.): " + index.getPrice() + " is : " + index.getPid());
		System.out.println("\n Total amount spent on all product (Rs.): " + Product.totalAmount(arr));
	}
	
}