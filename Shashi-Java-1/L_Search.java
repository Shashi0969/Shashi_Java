import java.util.*;
class L_Search extends B_Search
{
    void Linear_Search(int n)
    {
        Scanner ob = new Scanner(System.in);
        int i,k=0,p=0;
        int m[] = new int[10];
        System.out.println("Enter the numbers in the cells");
        for(i=0;i<10;i++)
        {
            m[i] = ob.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(m[i]==n)//To compare element searched with the list elements
            {
                k=1;
                p=i;
            }
        }
        if(k==1)
        System.out.println("The searched number is present at index "+p);
        else
        System.out.println("The searched number is not present");
    }
    public static void main(String L_Search[])
    {
        Scanner ob1 = new Scanner(System.in);
        int j,n1;
        System.out.println("Enter the number to be searched");
        n1 = ob1.nextInt();
        L_Search obj = new L_Search();
        obj.Linear_Search(n1);
    }
}
