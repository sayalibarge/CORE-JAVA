import java.util.Scanner;
class Que9{

public static void main(String args[]){

   int month , year ,week ,day;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of days:");
    month = sc.nextInt();
    year =  month / 365;
    month = month % 365;
   System.out.println(" no of years:"+year);
     
   week = month /7 ;
    month =  month % 7;
   System.out.println(" no of weeks:"+week);
  
   day = month;
  System.out.println(" no of days:"+day);  

}
}
