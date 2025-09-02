class Product
{
    String name;
    int code;
    double amount;
    Product(String n,int c,double p)
    {
        name=n;
        code=c;
        amount=p;
    }
    void show()
    {
        System.out.println("Name of the product:\t"+name);
        System.out.println("Product code:\t"+code);
        System.out.println("The amount of product: Rs.\t"+amount);
    }
}
