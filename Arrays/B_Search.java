import java.util.*;
class B_Search
{
    void Binary_Search(int n)
    {
        Scanner ob = new Scanner(System.in);
        int i,lb=0,ub=9,p=0,k=0,j=0;
        int m[] = new int[10];
        System.out.println("Enter the numbers in the cells");
        for(i=0;i<10;i++)
        {
            m[i] = ob.nextInt();
        }
        while(lb<=ub)
        {
            p = (lb+ub)/2;//To find mid-term
            if(m[p]<n)//To search in right
            lb = p+1;
            if(m[p]>n)//To search in left
            ub = p-1;
            if(m[p]==n)//To compare searched number with the no. in cell
            {
                j=p;
                k=1;
                break;
            }
        }
        if(k==1)
        System.out.println("The searched number is present at index "+j);
        else 
        System.out.println("The searched number is not present");
    }
    public static void main(String B_Search[])
    {
        Scanner ob1 = new Scanner(System.in);
        int j,n1;
        System.out.println("Enter the number to be searched");
        n1 = ob1.nextInt();
        B_Search obj = new B_Search();
        obj.Binary_Search(n1);
    }
}
