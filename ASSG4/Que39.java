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
	private float price ;
	private int quantity ;
	Product(){}
	Product(int pid,float price ,int quantity){
		this.pid=pid;
		this.price = price;
		this.quantity = quantity;
	}
	void show(){
		System.out.println("  ");
	}
	static void total_spent(Product []arr){
		double result = 0  ;
		for(Product a : arr){
			result =  result +(double)(a.price*a.quantity);
		}
		System.out.println("total  money spent : "+result);
	}
	static void max_element(Product []prr){
		float max=prr[0].price;
		
		Product p = new Product();
		p=prr[0];
		for( Product a : prr){
			
			if(a.price > max){
				max = a.price;
				p =a ;
			}
		}
		System.out.println(" id : "+p.pid+" price : "+p.price+" Quantity : "+p.quantity);
	
	}
	
}
class Q39{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		Product [] prr=new Product[5];
		System.out.println("Enter the 5 product elements ");
		for(int i = 0 ; i < prr.length ; i++){
			System.out.print("Enter id : " );
			int id = sc.nextInt();
			
			System.out.print("Enter price : " );
			float price1 = sc.nextFloat();
			
			System.out.print("Enter quantity : " );
			int quantity1 = sc.nextInt();
			
			prr[i] = new Product(id,price1,quantity1);
			//prr[i]=(Product)p.clone();
		}
		Product.max_element(prr);
			Product.total_spent(prr);
	}
	
}