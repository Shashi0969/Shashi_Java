import java.util.*;
class Clock extends Stpwtch
{
    public static void main( String []Clock ) throws InterruptedException
    {
        Scanner ob = new Scanner(System.in);
        int choice;
        System.out.println("Enter clock of your choice");
        System.out.println("1. Realtime Clock \n2. Clock of time chosed by you");
        choice = ob.nextInt();
        if(choice==1)
        {
            Calendar rightNow;
            int hour, minute, second, day, month, year;
            String time = "",date="";
            while(true)
            {
                rightNow = Calendar.getInstance( );
                hour = rightNow.get( Calendar.HOUR );
                minute = rightNow.get( Calendar.MINUTE );
                second = rightNow.get( Calendar.SECOND );
                day = rightNow.get( Calendar.DATE );
                month = rightNow.get( Calendar.MONTH );
                year = rightNow.get( Calendar.YEAR );
                date = day+"/"+month+"/"+year;
                time = ( hour >= 10 ? hour : "0" + hour ) + ":";
                time += ( minute >= 10 ? minute : "0" + minute ) + ":";
                time += ( second >= 10 ? second : "0" + second );
                System.out.print("Date : "+date);
                System.out.print("    Time : "+time);
                Thread.sleep( 1000 );
                System.out.println( "\b\b\b\b\b\b\b\b" );
                Thread.sleep(10);
                System.out.print("\u000C");
            }
        }
        else if(choice==2)
        {
            int n,i,j,k,m,p,a,n2,n3;
            String time;
            System.out.println("Enter the present time");
            System.out.print("Hours :");
            n = ob.nextInt();
            System.out.print("Minutes :");
            n2 = ob.nextInt();
            System.out.print("Seconds :");
            n3 = ob.nextInt();
            while(true)
            {
                for(i=n;i<=11;i++)
                {
                    for(j=n2;j<=59;j++)
                    {
                        for(m=n3;m<=59;m++)
                        {
                            System.out.print("Time : ");
                            time = ((i>=10)? i : "0"+i)+ ":";
                            time+= ((j>=10)? j : "0"+j)+ ":";
                            time+= ((m>=10)? m : "0"+m);
                            System.out.print(time);
                            Thread.sleep(1000);
                            System.out.print(10);
                            System.out.print("\u000C");
                        }
                        n3 = 0;
                    }
                    n2 = 0;
                }
                n=0;
            }
        }
        else
        {
            System.out.println("Wrong Choice");
            System.exit(0);
        }
    }
}

