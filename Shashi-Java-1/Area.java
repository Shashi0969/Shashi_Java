import java.util.*;

class Area {
    void Area() {
        Scanner ob = new Scanner(System.in);
        String str;
        char n;
        double r, s, l, b;
        System.out.println("Enter your choice");
        System.out.println("c. Area of Circle");
        System.out.println("s. Area of Square");
        System.out.println("r. Area of Rectangle");
        str = ob.nextLine();
        n = str.charAt(0);

        switch (n) {
            case 'c':
                System.out.println("Enter the radius of circle");
                r = ob.nextDouble();
                System.out.println("Area =" + 3.14 * r * r);
                break;
            case 's':
                System.out.println("Enter the side of square");
                s = ob.nextDouble();
                System.out.println("Area =" + s * s);
                break;
            case 'r':
                System.out.println("Enter the length and breadth of rectangle");
                l = ob.nextDouble();
                b = ob.nextDouble();
                System.out.println("Area =" + l * b);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }

    public static void main(String args[]) {
        Area obj = new Area();
        obj.Area();
    }
}
