/*
38.Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.Only parameterized constructor. [Do not overload the constructor]
b.totalSalary always represents salary total of all the employees created.
c.empNo should be auto incremented.
d.display total employees and totalSalary using a method.
  Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
*/
////////////////////////////////////////////////////////

class Employee{
	private int Empno ;
	private float salary ;
	private static float TotalSalary ;
	private static int count;

	
	Employee(float salary){
		count++;
		this.Empno=count;
		this.salary = salary;
		this.TotalSalary = TotalSalary+salary;
	}
	void display(){
		System.out.println("Total no of employees  : "+count +"\ntotal salaries of all employee:"+TotalSalary);
	}
}
class EmpDemo{
	public static void main (String args[]){
		Employee e = new Employee(25000.00F);
		Employee e1 = new Employee(25375.00F);
		Employee e2 = new Employee(25123.00F);
		Employee e3 = new Employee(25059.00F);
		Employee e4 = new Employee(25000.00F);
		e4.display();
	}
	
}
