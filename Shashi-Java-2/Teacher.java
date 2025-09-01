import java.util.*;
class Teacher
{
    String name[]=new String[50];
    String dob[]=new String[50];
    String doj[]=new String[50];
    void getdata()
    {
        Scanner in = new Scanner(System.in);
        int i;
        for(i=0;i<50;i++)
        {
            System.out.println("Enter name in the cell "+(i+1)+":");
            name[i]=in.nextLine();
            System.out.println("Enter date of birth in the cell :"+(i+1)+":");
            dob[i]=in.nextLine();
            System.out.println("Enter date of joining in the cell :"+(i+1)+":");
            doj[i]=in.nextLine();
        }
    }
    void show_getdata()
    {
        int i;
        System.out.println("The names with date of birth andd date of joining are:");
        for(i=0;i<50;i++)
        System.out.println(name[i]+"\t\t"+dob[i]+"\t\t"+doj[i]);
    }
}
