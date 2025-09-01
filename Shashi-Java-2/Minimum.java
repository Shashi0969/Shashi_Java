import java.util.*;
class Minimum
{
    int min=0;
    void fmin(int arr[],int n)
    {
        if(arr[n-1]<arr[min])
        min = n-1;
        n--;
        if(n==0)
        System.out.println("Smallest element of the given array is :"+arr[min]);
        else
        fmin(arr,n);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number of elements in the given array");
        n = sc.nextInt();
        int m[] = new int [n];
        System.out.println("Enter the elements in the arrray");
        for(i=0;i<n;i++)
        {
            m[i] = sc.nextInt();
        }
        Minimum ob = new Minimum();
        ob.fmin(m,n);
    }
}
