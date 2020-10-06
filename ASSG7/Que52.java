/*
52.	Input name of a person and count how many vowels it contains. 
 Use String class functions. 
*/
//////////////////////////////////////////////////////
import java.util.Scanner;
public class Que52 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter fname : ");
	String s1 = sc.next();
	int count =0;
	char ch[]=s1.toCharArray();
	
	for(char a:ch)
	{
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'|| a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
		{
			count++;
		}
	}
		/*for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'|| a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
			{
				count++;
			}
		}*/
	System.out.println(count);
		
		
	}

}