import java.util.*;
class Remainder
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a%b);
        }
    }
}

