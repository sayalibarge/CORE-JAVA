import java.util.Scanner;
class Que19{

     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
                for(int i=12;i<n;i=i+10){
			if(i<n-10)
			System.out.print(i+" + ");
			else
			System.out.print(i);
		}		
   }

}