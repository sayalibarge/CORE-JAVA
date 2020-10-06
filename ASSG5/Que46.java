/*
46.	Create a program to demonstrate the use of instanceof 
operator or secure reference down casting
*/
////////////////////////////////////////////////////////////////
class Y
{
       private int val;
	   
	   public int getVal()
	   {
	              return val;
	   }
	   public void setVal(int val)
	   {
	      this.val = val;  
	   
	   }
	   public Y()
	   {
	       this.val = val;
	      
	   }
}
public class Que46{

          public  static void main(String arr[])
		  {
		     Y a = new Y();
			 System.out.println((a instanceof Y));
		   
		  }

}