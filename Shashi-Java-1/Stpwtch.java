import java.util.*;
class Stpwtch
{
    public static void main(String Stopwatch[]) throws Exception
    {
        Scanner ob = new Scanner(System.in);
        int i,j,k,m,p;
        System.out.println("Time Started");
        for(k=1;k>0;)
        {
            for(i=0;i<=11;i++)
            {
                for(j=0;j<=59;j++)
                {
                    for(m=0;m<=59;m++)
                    {
                        System.out.print(i+":"+j+":"+m);
                        Thread.sleep(1000);
                        System.out.println("\b\b\b\b\b\b\b\b");
                        Thread.sleep(10);
                        System.out.print("\u000C");
                    }
                }
            }
        }
    }
}
