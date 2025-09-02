import java.util.*;
class ISC_Score
{
    protected int number[][] = new int [6][2];
    void getiscscores()
    {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Enter subject codes and marks in different subjects");
        for(i=0;i<6;i++)
        {
            number[i][0]=in.nextInt();
            number[i][1]=in.nextInt();
        }
    }
    int point(int sub_score)
    {
        int i,pt=0;
        for(i=1;i<=6;i++)
        {
            pt=i;
            break;
        }
        return(pt);
    }
}
