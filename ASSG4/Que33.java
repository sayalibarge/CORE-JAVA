/*
33.Write a program to demonstrate functionalities of this keyword in java. 
*/

/////////////////////////////////////////////////
class Emp{
     
         private int empId;
         private String empName;
         void set(int empId, String empName)
        {
            this.empId=empId;
            this.empName=empName;
         }
         void show()
       {
        System.out.println(empId+" "+empName);
       }

}
class EmpDemo{
     public static void main(String args[]){
         Emp e = new Emp();
          e.set(102,"Sayu");
          e.show();
  }
}