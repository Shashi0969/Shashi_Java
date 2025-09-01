import java.util.*;
class Smvrage
{
    public static void main(String args[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        double avg;
        int i,s=0;
        int m[] = new int[9];
        System.out.println("Enter 9 numbers");
        for(i=0;i<9;i++)
        {
            m[i] = ob.nextInt();
        }
        for(i=0;i<9;i++)
        {
            s = s+m[i];
        }
        avg = (double)s/9;
        System.out.println("Sum ="+s);
        System.out.printf("Average =%.2f",avg);
        System.out.println();
        System.out.println("Reversed order");
        for(i=8;i>=0;i--)
            System.out.println(m[i]);
    }
}
