//print factorial of a number n
import java.util.Scanner;

public class FactN {
    public static void printFactorial(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *=n;
        printFactorial(n-1, fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh number : ");
        int n = sc.nextInt();

        printFactorial(n, 1);
    }
}
