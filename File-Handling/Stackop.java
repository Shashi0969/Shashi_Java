//Program to illustrate Stack Operations
class Stackop
{
    int s[] = new int[20];
    int sp,n;
    Stackop(int nn)
    {
        for(int i=0;i<20;i++)
        s[i]=0;
        sp=-1;
        n=nn;
    }
    void pushdata(int item)
    {
        if(sp==(n-1))
        System.out.println("Stack Overflow");
        else
        {
            sp++;
            s[sp]=item;
        }
    }
    void popdata()
    {
        int v;
        if(sp==-1)
        System.out.println("Stack Underflows");
        else
        {
            v=s[sp];
            System.out.println("Popped out element is "+v);
            sp--;
        }
    }
    void display()
    {
        if(sp==-1)
        System.out.println("Stack Empty");
        else
        {
            System.out.println("SP------>|"+s[sp]+"|");
            System.out.println("        ___");
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println("        |"+s[i]+"|");
                System.out.println("        ___");
            }
        }
    }
}
