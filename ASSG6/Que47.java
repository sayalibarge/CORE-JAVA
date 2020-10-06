/*
47.	Create a program to demonstrate constructor chaining.
*/
/////////////////////////////////////////////////////////////
class Abc
{
	Abc()
	{
		System.out.println("No-argument Constructor Abc");
	}
	Abc(int i)
	{
		System.out.println("Parameterized Constructor Abc");
	}
}
class Pqr extends Abc
{
	Pqr()
	{
		
		System.out.println("No-argument Constructor Pqr");
	}
	Pqr(int i)
	{
		System.out.println("Parameterized Constructor Pqr");
	}
}
class Q47
{
	public static void main(String args[])
	{
		Pqr p = new Pqr();
		Pqr P1 = new Pqr(11);
	}
}