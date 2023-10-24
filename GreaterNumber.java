package InputOutput_06;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number A: ");
        int a = input.nextInt();
        System.out.println("Please enter number B: ");
        int b = input.nextInt();
        System.out.println(a>=b? "The first number (A) is greater.":"The second number (B) is greater.");

    }
}
