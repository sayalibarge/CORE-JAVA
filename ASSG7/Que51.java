/*
51.	Create a program that helps banks to maintain records. 
It should have following facilities. 
o Anybody can create current or saving account with following initial
 information: account number, name, balance, and branch. 
 o display account detail for a particular accounts. 
 o display total money deposited in bank. 
 o allow deposit and  withdrawal in an account  . 
 o for saving account opening balance and minimum 
 balance must be 5000.
 o for current account opening balance and minimum balance
 must be 1000. 
 o can not withdraw the amount from the account that makes
 balance less than the minimum balance. 
 */
 /////////////////////////////////////////////////////////////
  import java.util.Scanner;

class Account{
	static int totalDeposit=0;
	int accNo;
	String name;
	int bal;
	String branch;
	public Account(int accNo, String name, int bal, String branch) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
		this.branch = branch;
		totalDeposit=totalDeposit+bal;
	}
	public Account() {
		super();
	}
	
	void totalDeposite() {
		System.out.println("Total deposite in bank : "+totalDeposit);
	}
	
	void display() {
		System.out.println("Account Number : "+accNo);
		System.out.println("Account Holder Name : "+name);
		System.out.println("Account Balance : "+bal);
		System.out.println("Branch Name : "+branch);
	}
}

class Current extends Account {

	public Current(int accNo, String name, int bal, String branch) {
		super(accNo, name, bal, branch);
	}
	
	void Display() {
		super.display();
		System.out.println("Current Account Details is : ");
	}
	
	void addBal(int amount) {
		bal=bal+amount;
	}
	
	void widral(int amount) {
		bal=bal-amount;
	}
	
	
	
}

class Saving extends Account {

	public Saving(int accNo, String name, int bal, String branch) {
		super(accNo, name, bal, branch);
	}
	
	void Display() {
		super.display();
		System.out.println("Saving Account Details is : ");
	}
	
	void addBal(int amount) {
		bal=bal+amount;
	}
	
	void widral(int amount) {
		bal=bal-amount;
	}
}

public class Que51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Saving s[] = new Saving[10];
		Current c[] = new Current[10];
		int i=0,j=0;
		System.out.println("Enter the Account Type : \n 1 : Saving Accoung \n 2 : Current Account ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("Enter saving accoun number : ");
			int accNo = sc.nextInt();
			System.out.print("Enter the name : ");
			String name = sc.next();
			System.out.print("Enter the money tobe deposite ");
			int bal=sc.nextInt();
			while(bal<5000) {
				System.out.println("Deposite should be above 5000");
				System.out.print("Enter the money tobe deposite ");
				bal=sc.nextInt();
				if(bal>5000)
					break;
			}
			System.out.println("Enter the branch : ");
			String branch = sc.next();
			s[i]=new Saving(accNo,name,bal,branch);
		//	i++;
			s[i].display();
		}
		
		
		
		
		
	}
}
