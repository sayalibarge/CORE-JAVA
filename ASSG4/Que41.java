/*
41.Write a program to demonstrate this() construct functionality.
*/
/////////////////////////////////////////////////////

import java.util.Scanner;
class Emp{
	
	private int Empid;
	private String name;
	Emp(){
		this(100,"abc");
		System.out.println("no args constructor");
	}
	Emp(int Empid, String name)
	{
		this.Empid = Empid;
		this.name = name;
		System.out.println("params constructor");
	}
	void show()
	{
		System.out.println("empid "+ Empid + " Name "+ name);
	}
	
}
class Que41{
	 public static void main(String args[]){
		 Emp e = new Emp();
		 e.show();
		 Emp e1 = new Emp(102,"Sayali");
		 e1.show();
		 
	 }
}