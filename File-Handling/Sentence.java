import java.util.*;
class Sentence
{
    protected String str;
    Sentence()
    {
        str="";
    }
    void Accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        str=in.nextLine();
    }
    void Display()
    {
        System.out.println(str);
    }
}
