import java.util.Scanner; 
class Que18{
       public static void main(String args[]){
       int count = 0;
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number for checking prime or not");
           int num = sc.nextInt();
           for(int i = 1; i<=num; i++) 
            {
	      if(num%i == 0) 
                  {
			count++;
		   }
	      }
	     if(count==2)
             {
	       System.out.println("Number is prime");
	      }
	      else 
               {
	        System.out.println("Number is not prime");
	       }
}
}
