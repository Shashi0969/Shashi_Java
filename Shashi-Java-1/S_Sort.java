import java.util.*;
class S_Sort extends B_Sort
{
    void Selection_Sort(int m[])
    {
        Scanner ob = new Scanner(System.in);
        int j,t,min,r;
        System.out.println("Enter the order to which you want to arrange these no.s");
        System.out.println("1. Ascending order \n2. Descending order");
        r = ob.nextInt();
        if(r==1)
        {
            for(int i=0;i<9;i++)
            {
                min = i;
                for(j=i+1;j<10;j++)                                                                                                                                                                                                                     
                {
                    if(m[j]<m[min])
                    min = j;
                }
                t = m[i];
                m[i] = m[min];
                m[min] = t;
            }
            System.out.println("The numbers arranged in ascending order are:");
        }
        else if(r==2)
        {
            for(int i=0;i<9;i++)
            {
                min = i;
                for(j=i+1;j<10;j++)
                {
                    if(m[j]>m[min])
                    min = j;
                }
                t = m[i];
                m[i] = m[min];
                m[min] = t;
            }
            System.out.println("The numbers arranged in Descending order are:");
        }
        else 
        System.out.println("Wrong Choice");
        if(r==1||r==2)
        for(int i=0;i<10;i++)
        System.out.print(m[i]+"|");
    }
    public static void main(String S_Sort[])
    {
        Scanner ob = new Scanner(System.in);
        int p=0,q;
        int m[] = new int[10];
        System.out.println("Enter the number in the cell:");
        for(q=0;q<10;q++)
        {
            m[q] = ob.nextInt();
        }
        S_Sort obj = new S_Sort();
        obj.Selection_Sort(m);
    }
}
