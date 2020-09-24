/*
34.Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
*/
///////////////////////////////////////////////////
import java.util.Scanner;
class Circle{
             private float r;
             private float area;
             
           void init(float r)
           {
               
               this.r=r;
               
            }
           void calculateArea() 
           {
                 this.area = 3.14F * r * r;

            }
             void show()
            {
              System.out.println("The radius of circle:"+r);
              System.out.println("The area of circle:"+area);
            }


}
class CircleDemo{
public static void main(String[] args) 
   {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter thr radius of the circle");
      float rad=sc.nextFloat();
      Circle o = new Circle();
      o.init(rad);
      o.calculateArea();
      o.show();
      sc.close();
   }
}