import java.util.*;
class Principal extends Teacher
{
    int i,j;
    String temp,t1,t2;
    void sortdata()
    {
        for(i=0;i<49;i++)
        {
            for(j=0;j<49-i;j++)
            {
                if(name[j].compareTo(name[j+1])>0)
                {
                    temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                    t1=dob[j];
                    dob[j]=dob[j+1];
                    dob[j+1]=t1;
                    t2=doj[j];
                    doj[j]=doj[j+1];
                    doj[j+1]=t2;
                }
            }
        }
    }
    void display()
    {
        System.out.println("Name with date of birth and date of joining are:");
        for(j=0;j<50;j++)
        System.out.println(name[j]+"\t\t"+dob[j]+"\t\t"+doj[j]);
    }
    void searchdata()
    {
        Scanner in = new Scanner(System.in);
        int i;
        String n;
        System.out.println("Enter the name to be searched");
        n=in.nextLine();
        for(i=0;i<50;i++)
        {
            if(n.equals(name[i]))
            {
                System.out.println("Name is present and the details are:");
                System.out.println(name[i]+"\t\t"+dob[i]+"\t\t"+doj[i]);
                break;
            }
            else
            System.out.println("Name is not present in the list");
        }
    }
}
