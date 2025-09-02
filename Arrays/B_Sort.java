import java.util.*;
class B_Sort
{
    void Bubble_Sort()
    {
        Scanner ob = new Scanner(System.in);
        int i,j,t,r;
        int m[] = new int[10];
        System.out.println("Enter the numbers in cells");
        for(i=0;i<10;i++)
        {
            m[i] = ob.nextInt();
        }
        System.out.println("Enter the order to which you want to arrange these no.s");
        System.out.println("1. Ascending order \n2. Descending order");
        r = ob.nextInt();
        if(r==1)
        {
            for(i=0;i<9;i++)
            {
                for(j=0;j<(9-i);j++)
                {
                    if(m[j]>m[j+1])
                    {
                        t = m[j];
                        m[j] = m[j+1];
                        m[j+1] = t;
                    }
                }
            }
            System.out.println("The numbers arranged in ascending order are:");
        }
        else if(r==2)
        {
            for(i=0;i<9;i++)
            {
                for(j=0;j<(9-i);j++)
                {
                    if(m[j]<m[j+1])
                    {
                        t = m[j];
                        m[j] = m[j+1];
                        m[j+1] = t;
                    }
                }
            }
            System.out.println("The numbers arranged in Descending order are:");
        }
        else 
        System.out.println("Wrong Choice");
        for(i=0;i<10;i++)
        {
            System.out.print(m[i]+"|");
        }
    }
    public static void main(String B_Sort[])
    {
        B_Sort obj = new B_Sort();
        obj.Bubble_Sort();
    }
}
