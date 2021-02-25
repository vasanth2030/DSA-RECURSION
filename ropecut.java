package Recursion;
import java.util.Scanner;
public class ropecut {
    public static void main(String[] args) {
        System.out.println("Enter the rope size, a, b and c");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(cutrope(n,a,b,c));

    }
    static int cutrope(int n,int a,int b, int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int result= max(cutrope(n-a,a,b,c),cutrope(n-b,a,b,c),cutrope(n-c,a,b,c));
        if(result==-1)
            return -1;
        return (result+1);
    }
    static int max(int a,int b,int c)
    {
        if(a>=b && a>=c)
            return a;
        else if(b>a || b>c)
            return b;
        else return c;
    }
}
