/*
50.	Explain the importance of toString() and equals()
 method of the Object class and
 override them on class Employee(empId,name,salary). 
 a. Create class for main method(say XYZ),and 
 accept five employees information and store in an array. 
 Also ensure if entered empId already exist or not (use equals method).
 b. Display all employee info using toString method.
*/
//////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
class Employee {
	
	int empId;
	String name;
	double salary;
	Employee(int empId,String name,double salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}
	public String toString()
	{
		return "Emp id =" +empId  +"Name =" +name   +"Salary = " +salary;
	}
	public boolean equals(Object obj)
	{
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
}
class Que50{
	public static void main(String args[])
	{
		Employee e[] = new Employee[5];
		Scanner sc = new Scanner(System.in);
		int k = 0;
		for( int i=0;i < e.length; i++)
		{
			System.out.println("Enter emp details:");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double sal = sc.nextDouble();
			
			Employee e1 = new Employee(id,name,sal);
			if( i == 0 )
			{
				e[i] = e1;
				k++;
		    }
             else {
				 int flag = 0;
				 for(int j=0;j<k;j++)
				 {
					 if( e1.equals( e[j] ))
					 {
						 System.out.println("empId already exist");
						 flag = 1;
						 i = i-1;
						 break;
					 }
				 }
				 if( flag == 0 )
				 {
					 k++;
					 e[i] = e1;
				 }
			 }			
				
		}
		for(Employee x : e )
		{
			System.out.println( x );
		}
		sc.close();
		
	}
	
}