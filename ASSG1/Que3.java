class Que3{
	public static void main(String args[]){
		int x=10;
		int y = x*x+3*x-7;
		System.out.println("Y = "+y);
		y = x++ + ++x;
		System.out.println("X = "+x+" Y = "+y);
		int z = x++ - --y - --x + x++;
		System.out.println("X = "+x+" Y = "+y+" Z = "+z);
		boolean p = true, q = true, r = false;
		r = p && q || !(p || q);
		System.out.println("Z = "+r);   
	}
}
