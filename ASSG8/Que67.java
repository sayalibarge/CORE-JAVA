/*
67.	Write a program to read data from shopping.dat file
 created in above problem and find total money spent on 
 all shopping items.(Use ObjectInputStream to read Item class object).
*/   
///////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Que67 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C://Users//sayali//Desktop//PG-DAC//CORE JAVA//ASSG//ASSG8//Hello.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			Que67 emp = (Que67) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}