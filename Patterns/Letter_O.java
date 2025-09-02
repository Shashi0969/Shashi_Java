import java.util.*;
class Letter_O
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int i,j;
        System.out.println("Pattern");
        for(i=1;i<=15;i++)
        {
            for(j=1;j<=10;j++)
            {
                if((i<=3)||(i>3&&i<=12&&(j<=3||j>=8))||(i>12))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
