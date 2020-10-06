/*
64.	Write a program to count no of words in a text file
 and average word size.
*/

///////////////////////////////////////////////////////////////
import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class Que64   
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
          
        //Opens a file in read mode  
        FileReader file = new FileReader("C://Users//sayali//Desktop//PG-DAC//CORE JAVA//ASSG//ASSG8//Hello.txt");
		BufferedReader br = new BufferedReader(file);  
              
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
          
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
}  
