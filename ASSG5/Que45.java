/*
45.Create a class Student with two members : rollno and percentage. 
Create default and parameterized constructors.
 Create method show() to display information. 
 Create another class CollegeStudent inherits Student class.
 Add a new member semester to it. Create default and parameterized constructors.
 Also override show() method that calls super class show() method and displays semester.
 Create another class SchoolStudent inherits Student class. 
 Add a new member className(eg 12th ,10th etc.) to it. 
 Create default and parameterized constructors. 
 Also override show() method that calls super class show() method and displays className. 
 Create a class( say Demo) with main method that carries out the operation of the project : 
 -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) 
 --create two CollegeStudent  and three SchoolStudent objects and store them inside the array 
 -- display all records from the array 
 -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. 
 --count how many students are having A grade, if for A grade percentage >75. 
 */
 
 /////////////////////////////////////////////////////////////////
 class Student {
    private int rollNo;
    private double percentage;

    Student() {
        
        percentage = 0;
    }

    Student(int rollNo, double percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    void show() {
        System.out.print("Roll no. : " + rollNo + " Percentage: " + percentage + "%");
    }

    int getRollNo() {
        return rollNo;
    }

    double getPercentage() {
        return percentage;
    }

}

class CollegeStudent extends Student {
    private int semester;

    CollegeStudent() {
        semester = 0;
    }

    CollegeStudent(int rollNo, double percentage, int semester) {
        super(rollNo, percentage);
        this.semester = semester;
    }

    void show() {
        super.show();
        System.out.println(" Sem: " + semester);
    }

}

class SchoolStudent extends Student {
    private int className;

    SchoolStudent() {
        className = 0;
    }

    SchoolStudent(int rollNo, double percentage, int className) {
        super(rollNo, percentage);
        this.className = className;
    }

    void show() {
        super.show();
        System.out.println(" className: " + className);
    }

}

 class Q45 {

    public static void main(String[] args) {
        Student sArr[] = { new CollegeStudent(10, 60, 1), new CollegeStudent(12, 80, 2), new SchoolStudent(15, 95, 10),
                new SchoolStudent(16, 90, 8), new SchoolStudent(18, 70, 7) };

        for (Student s : sArr) {
            s.show();
        }

        int searchRollNo = 15;

        for (Student s : sArr) {
            if (s.getRollNo() == searchRollNo) {

                if (s instanceof CollegeStudent)
                    System.out.println("This is a college student with following details:");
                else if (s instanceof SchoolStudent)
                    System.out.println("This is a School student with following details:");
                s.show();
            }
        }
        int count = 0;
        for (Student s : sArr) {
            if (s.getPercentage() >= 75) {
                System.out.print("Grade = A  ");
                s.show();
                count++;
            }
        }

        System.out.println("No of students with A grade: " + count);

    }

}