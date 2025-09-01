import java.util.*;
class Circle_p extends Cross
{
    public static void main(String Circle[])
    {
        int i,j,k,z,x;
        System.out.println("Circle pattern");
        for(i=1;i<=9;i++)
        {
            switch(i)
            {
                case 1:
                case 9:
                x = 6;
                z = 4;
                break;
                case 2:
                case 8:
                x = 8;
                z = 2;
                break;
                case 3:
                case 7:
                x = 9;
                z = 1;
                break;
                default:
                x = 10;
                z = 0;
            }
            for(j=1;j<=z;j++)
            {
                for(int m=1;m<99999999;m++);
                System.out.print(" ");
            }
            for(k=1;k<=x;k++)
            {
                for(int m=1;m<99999999;m++);
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}