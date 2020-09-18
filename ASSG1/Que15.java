import java.util.Scanner;
class Que15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter gender M/F : ");
		char g = sc.next().charAt(0);
		System.out.println("gender = "+g);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		if (age >= 21 && g == 'M')
		{
			System.out.println("Eligible for marriage");
		}
		else if(age >= 19 && g == 'F')
		{
			System.out.println("lady is eligible for marriage");
		}
		else{
			System.out.println("Not eligible for marriage");
		}		
	}
}