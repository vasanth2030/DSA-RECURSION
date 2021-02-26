package Recursion;
import java.util.Scanner;
public class towerofhanoi {
    public static void main(String[] args) {
        System.out.println("Enter the number of discs: ");
        Scanner s=new Scanner(System.in);
        int numberOfDisks= s.nextInt();
        char A='A';
        char B='B';
        char C='C';
        TOH(numberOfDisks,A,B,C);

    }
    static void TOH(int n,char A, char B, char C)
    {
        if(n==1) {
            System.out.println("Move 1 from " + A + " to " +C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        TOH(n-1,B,A,C);

    }
}
