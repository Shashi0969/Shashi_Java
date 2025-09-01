import java.util.*;
class Cricket 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String n[] = new String [11];
        int a[] = new int[11];
        int i,s=0,ib=0,r=0;
        System.out.println("Enter the names and runs made by the players");
        for(i=0;i<11;i++)
        {
            System.out.println("Name");
            n[i] = ob.nextLine();
            System.out.println("Runs");
            a[i] = Integer.parseInt(ob.nextLine());
        }
        s = a[0];
        for(i=0;i<10;i++)
        {        
            s = (s>a[i+1])?s:a[i+1];
        }
        for(i=0;i<11;i++)
        {
            if(a[i]==s)
            break;
        }
        System.out.println("Maximum runs are "+s+" and of "+n[i]);
    }
}
