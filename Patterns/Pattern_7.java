import java.util.*;
class Pattern_7
{
    public static void main(String St_int[]) throws Exception
    {
        Scanner ob =  new Scanner(System.in);
        int a,b,c,p=65,k=5;
        System.out.println("Pattern");
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            System.out.print(a+" ");
            for(c=k;c>=1;c--)
            System.out.print((char)p+" ");
            k--;
            p++;
            System.out.println();
        }
    }
}
