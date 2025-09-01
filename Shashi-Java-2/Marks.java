//Code written in derived class
import java.util.*;
class Marks extends Student
{
    int p,c,m,cts,e,tot=0;
    float per=0;
    char gd;
    void readdata()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter marks in Physics");
        p = ob.nextInt();
        System.out.println("Enter marks in Chemistry");
        c=ob.nextInt();
        System.out.println("Enter marks in Mathematics");
        m=ob.nextInt();
        System.out.println("Enter marks in Computer Science");
        cts = ob.nextInt();
        System.out.println("Enter marks in English");
        e=ob.nextInt();
    }
    void compute()
    {
        tot=p+c+m+cts+e;
        per=(tot*100)/500;
        if(per>=90)
        gd='A';
        if(per>=60&&per<90)
        gd='B';
        if(per>=40&&per<60)
        gd='C';
        else if(per<40)
        gd='D';
    }
    void showdata()
    {
        printdata();
        System.out.println("Marks in Physics: "+p);
        System.out.println("Marks in Chemistry: "+c);
        System.out.println("Marks in Mathematics: "+m);
        System.out.println("Marks in Computer Scince: "+cts);
        System.out.println("Marks in ENglish: "+e);
        System.out.println("Percentage Marks: "+per+"%");
        System.out.println("Grade obtained: "+gd);
    }
}
