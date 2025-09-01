import java.util.*;
class Max_Min extends L_Search
{
    void MaxMin(int k)
    {
        Scanner ob = new Scanner(System.in);
        int max,min,i,p=0;
        int m[] = new int[10];
        System.out.println("Enter the numbers in the cells");
        for(i=0;i<10;i++)
        {
            System.out.print(i+".");
            m[i] = ob.nextInt();
        }
        max = m[0];
        min = m[0];
        for(i=0;i<10;i++)
        {
            if(m[i]>max)
            max=m[i];// To find maximum
            if(m[i]<min)
            min=m[i];// To find minimum
        }
        for(i=0;i<10;i++)
        {
            if(m[i]==max)
            k = i;
            if(m[i]==min)
            p = i;
        }
        System.out.println("Max : \n"+k+". " +max);
        System.out.println("Min : \n"+p+". " +min);
    }
    public static void main(String Max_Min[])
    {
        int k1=0;
        Max_Min obj = new Max_Min();
        obj.MaxMin(k1);
    }
}
