import java.util.*;
class Movie
{
    int y;
    String t;
    float r;
    Scanner ob = new Scanner(System.in);
    Movie()
    {
        t="";
        r=0.0f;
        y=0;
    }
    void accept()
    {
        System.out.println("Enter the Title of the Movie");
        t = ob.nextLine();
        System.out.println("Enter the Year of the release of movie");
        y = ob.nextInt();
        System.out.println("Enter the Ratings of the Movie");
        r = ob.nextFloat();
    }
    void display()
    {
        System.out.println("Title \t Year \t Ratings");
        if(r<=2.0)
        System.out.println(t+"\t"+y+"\tFlop");
        else if(r>=2.1&&r<=3.4)
        System.out.println(t+"\t"+y+"Semi-hit");
        else if(r>=3.5&&r<=4.5)
        System.out.println(t+"\t"+y+"\tHit");
        else
        System.out.println(t+"\t"+y+"\tSuper Hit");
    }
    public static void main(String args[])
    {
        Movie obj = new Movie();
        obj.accept();
        obj.display();
    }
}
