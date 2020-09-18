import java.util.Scanner;
class Que13a{



  public static void main(String args[]){
    
   int n1 ,n2, n3;
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the numbers:");
   
   n1 = sc.nextInt();
   n2 = sc.nextInt();
   n3 = sc.nextInt();
  

  if ( n1 > n2 &&  n1 > n3)
{
    System.out.println("Largest numbers:"+n1);

}
 else if(n2 > n1 && n2 > n3)
{
    System.out.println("Largest numbers:"+n2);

}
else
{
 System.out.println("Largest numbers:"+n3);

}

}
}

