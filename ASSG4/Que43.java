/*
43.Create a class OneBHK with instance variables roomArea, hallArea and price.
 Then create default constructor that initializes instance variables with some values 
 and a parameterized constructor that takes values for all instance variables and stores
 them in instance variables. Now create a method named show() to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance 
variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized
constructor to take the values for initialization of all instance variables. 
Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and
print information using show method. 
Also print total amount of all flats. 
*/

////////////////////////////////////////////////////////
class OneBHK{
	                 private float roomArea;
			  private float hallArea;
			  private double price;
			  
			  OneBHK()
			  {
				  roomArea=10;
				  hallArea=20;
				  price=450.0;
			  }
			  OneBHK(float roomArea,float hallArea,double price)
			  {
				  this.roomArea=roomArea;
				  this.hallArea=hallArea;
				  this.price=price;
			  }
			  void show()
			  {
				  System.out.println(roomArea+" "+hallArea+" "+price);
			  }
	
	
}
class TwoBHK extends OneBHK{
	
	   private float roomArea2;
	   TwoBHK()
	   {
		  super();
                 roomArea2=500;		  
	   }
	   TwoBHK(float roomArea,float hallArea,double price,float roomArea2)
	   {
		   super(roomArea,hallArea,price);
		   this.roomArea2=roomArea2;
	   }
	   void show()
	   {
		  super.show();
          System.out.println(roomArea2);		  
	   }
	
}
class Demo1{
	
	public static void main(String args[]){
		TwoBHK t=new TwoBHK();
		t.show();
	}
	
	
}

