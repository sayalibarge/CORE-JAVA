class mathQ36 {

	double multiply(int a,int b)
	{
		
		int mul = a * b;
		return mul;
	}
	double multiply(float a,float b,float c)
	{
		double mul = a * b * c;
		return mul;
	}
	double multiply(int a,double b)
	{
		double mul = a * b;
		return mul;
	}
	double multiply(int []a)
	{
		int mul = 1;
		for(int i = 0 ; i < a.length ; i++)
		{
			mul*=a[i];
		}
		return mul;
	}
	
}

class Q36{

	public static void main(String aa[])
	{
		int[] a = {1,2,3};
		mathQ36 c = new mathQ36();
		System.out.println(c.multiply(a));
		System.out.println(c.multiply(10,20.0));
	}
}