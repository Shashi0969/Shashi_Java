import java.util.*;
class Prmttion
{
    static int k=0;
    static String Swap(String st,int i,int j)
    {
        char ch;
        char[] arr = st.toCharArray();
        ch = arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
        return String.valueOf(arr);
    }
    static void Permute(String st,int low,int high)
    {
        if(low==high)
        {
            k++;
            System.out.println(k+"."+st);
        }
        int i;
        for(i=low;i<=high;i++)
        {
            st = Swap(st,low,i);
            Permute(st,low+1,high);
            st = Swap(st,low,i);
        }
    }
    public static void main(String Permutations[])
    {
        Scanner ob = new Scanner(System.in);
        String st;
        System.out.println("Enter the String");
        st = ob.nextLine();
        System.out.println("All possible Permutations");
        Permute(st,0,st.length()-1);
    }
}
