import java.util.*;
class Cricket_2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int r=0,i,j=1,s=0,p=0,k,rp=0;
        for(i=1;i<=11;i++)
        {
            s = p;
            while(true)
            {
                System.out.println("Enter the runs of "+i+"th player in "+j+" th ball");
                r = ob.nextInt();
                if(r<0)
                break;
                rp = rp+r;
                s = s+r;
                j++;
            }
            System.out.println("Runs of "+i+" th player in "+j+" balls = "+rp);
            rp = 0;
            j = 1;
            p = s;
        }
        System.out.println("Total runs of team =" +s);
    }
}
