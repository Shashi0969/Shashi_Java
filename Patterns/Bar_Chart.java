import java.util.*;
class Bar_Chart
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,n,j;
        System.out.println("Enter the limit");
        n = ob.nextInt();
        int m[] = new int[n];
        for(i=0;i<n;i++)
        {        
            System.out.println("Enter the limits of the "+i+"th bar in the chart");
            m[i] = ob.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print("["+(i+1)+"]");
            for(j=1;j<=m[i];j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
