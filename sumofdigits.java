package Recursion;
import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("The sum of digits is: ");
        System.out.println(sumdigits(n));
    }
    static int sumdigits(int n)
    {
        if(n<10)
            return n;
        return sumdigits(n / 10)+n%10;
    }
}
