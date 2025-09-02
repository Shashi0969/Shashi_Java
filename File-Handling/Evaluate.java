//program to evaluate postfix expression
import java.util.*;
class Evaluate
{
    double stack[] = new double[50];
    int sp;
    Evaluate()
    {
        sp=-1;
    }
    void push(double ele)
    {
        if(sp==49)
        System.out.println("Stack Overflows");
        else
        {
            sp++;
            stack[sp]=ele;//Pushing operand into stack
        }
    }
    double pop()
    {
        double val;
        if(sp==-1)
        {
            System.out.println("Stack Underflows");
            return(-999);
        }
        else
        {
            val = stack[sp];//Popping an operand from the stack
            sp--;
            return(val);
        }
    }
    void operate()
    {
        Scanner in = new Scanner(System.in);
        String str;
        int l;
        char ch;
        double a,b,res=0,t;
        System.out.println("Enter a postfix expression");
        str = in.next();
        l = str.length();
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            t = (int)ch-48;
            if(t>=0.0 && t<10.0)
            push(t);
            else
            {
                //Popping out two operands simultaneously
                b=pop();
                a=pop();
                switch(ch)
                {
                    case '+':
                    res = a+b;
                    break;
                    case '-':
                    res = a-b;
                    break;
                    case '*':
                    res = a*b;
                    break;
                    case '/':
                    res = a/b;
                    break;
                    case '^':
                    res = Math.pow(a,b);
                    break;
                    case '%':
                    res = a%b;
                    break;
                    default:
                    System.out.println("Wrong operator");
                    break;
                }
                push(res);
            }
        }
        System.out.println("Result =\t"+pop());
    }
}
