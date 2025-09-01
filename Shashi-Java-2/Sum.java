import java.util.*;
class Sum
{
    int i=0,s=0;
    void Sum(int n)
    {
        i++;
        s+= i;
        if(i==n)
        System.out.println("Sum upto the number ="+s);
        else
        Sum(n);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,sum;
        System.out.println("Enter the number");
        n = sc.nextInt();
        Sum ob = new Sum();
        ob.Sum(n);
    }
}
