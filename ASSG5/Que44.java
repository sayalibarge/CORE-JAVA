/*
44.Create three classes
-Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
*/

/////////////////////////////////////////////////////////////
import java.util.Scanner;
class Faculty{
	
	          private int facultyId;
			  private double salary;
			  
			  void input(int facultyId)
			  {
				  this.facultyId=facultyId;
			  }
			  void setsalary(double salary)
			  {
				  this.salary=salary;
			  }
			  void printSalary()
			  {
				  System.out.println("Salary: "+salary);
			  }
	
}
class FullTimeFaculty extends Faculty{
	          private double basicSalary;
			  private double allowance;
			  void input(int facultyId, double basicSalary,double allowance)
			  {
				  this.basicSalary=basicSalary;
				  this.allowance=allowance;
				  
				  double salary = basicSalary + allowance;
				  input(facultyId);
				  setsalary(salary);
				  
			   }
}
class PartTimeFaculty extends Faculty{
	         private double workingHours;
			 private double ratePerHour;
			 void input(int  facultyId, double workingHours, double ratePerHour)
			 {
				  this.workingHours = workingHours;
				  this.ratePerHour = ratePerHour;
				  
				  double salary = workingHours * ratePerHour;
				  input(facultyId);
				  setsalary(salary);
			 }
}
class Q44{
	        public static void main(String args[])
			{
				FullTimeFaculty f = new FullTimeFaculty();
				f.input(102,50000.000,900.00);
				f.printSalary();
				
				PartTimeFaculty p = new PartTimeFaculty();
				p.input(102,24.00,90.00);
				p.printSalary();
				
			}
}