import java.util.*;
class Arprme
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int m[] = new int[20];
        int i,j=1,c=0,k=0;
        int p[] = new int[20];
        System.out.println("Enter 20 numbers in the cells");
        for(i=0;i<20;i++)
        {
            m[i] = ob.nextInt();
        }
        for(i=0;i<20;i++)
        {
            c=0;
            while(j<=m[i])
            {
                if(m[i]%j==0)
                {
                    c++;
                }
                j++;
            }
            j=1;
            if(c==2)
            {
                p[k] = m[i];
                k++;
            }
        }
        System.out.println("Prime number are :");
        for(i=0;i<k;i++)
        {
            System.out.println(i+". "+p[i]);
        }
    }
}
