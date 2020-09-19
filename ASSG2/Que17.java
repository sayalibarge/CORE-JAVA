import java.util.Scanner;
class Que17{

  public static void main(String args[]){


   int n=0;
   int revnum =0;

    System.out.println("Enter number to reverse:");
    Scanner sc = new Scanner(System.in);
    
   n = sc.nextInt();

   while( n != 0 )
{

   revnum = revnum * 10;
  revnum = revnum + n%10;
  n = n/10;
}

    System.out.println("Reverse of given number is:    "+revnum);
     }
}
