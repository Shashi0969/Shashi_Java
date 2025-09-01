//Program to perform operations in a queue
class queueop
{
    int q[] = new int[20];
    int f,r, size,val;
    queueop(int n)
    {
        for(int i=0;i<20;i++)
        q[i]=0;
        f=-1;
        r=-1;
        size = n;
    }
    void insertqueue(int item)
    {
        if(r==size-1)
        System.out.println("Queue Overflows");
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            else
            r=r+1;
            q[r]=item;
        }
    }
    void deletequeue()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue Underflows");
        else
        {
            val=q[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else 
            f=f+1;
        }
    }
    void display()
    {
        if(f==-1 && r==-1)
        System.out.println("Queue Underflows");
        else
        {
            System.out.println("Elements of the queue");
            for(int j=f;j<=r;j++)
            System.out.println(q[j]);
        }
    }
}
