/*
32.Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]
*/

/////////////////////////////////////////////////
import java.util.Scanner;
class Student{
	
	    private int rno;
		private String name;
		static int total;
		Student(int rno,String name)
		{
			this.rno=rno;
			this.name=name;
			total++;
			
		}
		void show()
		{
			System.out.println(rno+" "+ name);
		}
}
class Student_call{
         public static void main(String args[])
		 {
			 Student.total=0;
			 Student s = new Student(102,"Sayali");
			 s.show();
			 
			 Student s1 = new Student(103,"Shubham");
			 s1.show();
			 
			 Student s2 = new Student(104,"Sayali");
			 s2.show();
			 
			 System.out.println("no of objects= "+Student.total);
			 
			 
		 }		 
}