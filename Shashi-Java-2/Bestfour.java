class Bestfour extends ISC_Score
{
    int i,j,k,t=0,temp,c=2;
    void bestsubject()
    {
        for(i=0;i<6;i++)
        t=t+point(number[i][1]);
        System.out.println("Total points obtained");
        System.out.println(t);
        for(i=0;i<6;i++)
        {
            for(j=0;j<(5-i);j++)
            {
                if(number[j][1]<number[j+1][1])
                {
                    for(k=0;k<c;k++)
                    {
                        temp=number[j][k];
                        number[j][k]=number[j+1][k];
                        number[j+1][k]=temp;
                    }
                }
            }
        }
        System.out.println("Subject code with 4 best scores");
        for(i=0;i<4;i++)
        System.out.println(number[i][0]+"\t\t"+number[i][1]);
    }
}
