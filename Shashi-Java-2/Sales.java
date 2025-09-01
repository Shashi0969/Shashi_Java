class Sales extends Product
{
    int day;
    double tax;
    double totamt;
    Sales(String n1,int c1,double p1,int d)
    {
        super(n1,c1,p1);
        day=d;
        tax=0.0;
        totamt=0.0;
    }
    void compute()
    {
        double f=0.0D;
        tax=12.4/100*amount;
        if(day>30)
        f=2.5/100*amount;
        totamt=amount+tax+f;
    }
    void show()
    {
        super.show();
        System.out.println("Total Amount : Rs.\t"+totamt);
    }
}
