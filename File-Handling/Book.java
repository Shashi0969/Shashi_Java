class Book
{
    String name[];
    int point;
    int max;
    Book(int cap)
    {
        point=-1;
        max=cap;
        name=new String[max];
    }
    void tell()
    {
        if(point==-1)
        System.out.println("Shelf is empty");
        else 
        {
            System.out.println("Topmost book:"+name[point]);
            point--;
        }
    }
    void add(String v)
    {
        if(point==max-1)
        System.out.println("Shelf is full");
        else
        {
            point=point+1;
            name[point]=v;
        }
    }
    void display()
    {
        System.out.println("Arrangement of the book");
        if(point==-1)
        System.out.println("Shelf is empty");
        else
        {
            for(int i=point;i>=0;i--)
            System.out.println(name[i]);
        }
    }
}
