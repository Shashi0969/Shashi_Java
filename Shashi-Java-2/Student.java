//Program to print student related information
//Code written in base class
import java.util.*;
class Student
{
    String name,dob;
    int r;
    void inputdata()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name");
        name = ob.nextLine();
        System.out.println("Enter date of birth");
        dob = ob.nextLine();
        System.out.println("Enter roll number");
        r = ob.nextInt();
    }
    void printdata()
    {
        System.out.println("Name: "+name);
        System.out.println("Date of birth: "+dob);
        System.out.println("Roll number: "+r);
    }
}
