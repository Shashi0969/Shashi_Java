//Program to perform operations on Dqueue
class Dqueue
{
    int dq[]=new int[50];
    int f;
    int r;
    int size;
    Dqueue(int n)
    {
        size=n;
        f=-1;
        r=-1;
    }
    void DqInsFront(int ele)
    {
        if(f==0)
        System.out.println("Dqueue Overflows");
        else
        if(f==-1 && r==-1)
        {
            f=0;
            r=0;
        }
        else f=f-1;
        dq[f]=ele;
    }
    void DqInsRear(int ele)
    {
        if(r==size-1)
        System.out.println("Dqueue Overflows");
        else if(f==-1 && r==-1)
        {
            f=0;
            r=0;
        }
        else
        r=r+1;
        dq[r]=ele;
    }
    void DqDelFront()
    {
        int v;
        if(f==-1 && r==-1)
        System.out.println("Dqueue Underflows");
        else
        {
            v=dq[f];
            System.out.println("Element deleted\t"+v);
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            f=f+1;
        }
    }
    void DqDelRear()
    {
        int v;
        if(f==-1 && r==-1)
        System.out.println("Dqueue Underflows");
        else
        {
            v=dq[r];
            System.out.println("Element deleted\t"+v);
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else 
            r=r-1;
        }
    }
    void display()
    {
        if(f==-1 && r==-1)
        System.out.println("Dqueue is empty");
        else
        {
            System.out.println("Elements in Dqueue");
            for(int i=f;i<=r;i++)
            System.out.println(dq[i]);
        }
    }
}
