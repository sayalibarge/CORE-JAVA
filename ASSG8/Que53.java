/*
53.	Input data exactly in the following format,
 and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.  
 (Hint use String class split method and Integer class
 parseInt method) .
 */
 //////////////////////////////////////////////////////////
 public class Que53 {
	public static void main(String args[]) {
		String str = "67, 89, 23, 67, 12, 55, 66";   
		
		
		String arr[] = str.split(", ");
		int sum = 0;
		for(String s : arr) {
			sum += Integer.parseInt(s);
			System.out.println(s);
			
		}
		System.out.println("sum ="+sum);
	}
	
}