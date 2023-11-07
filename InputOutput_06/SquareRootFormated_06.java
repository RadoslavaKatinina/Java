package InputOutput_06;

import java.io.PrintStream;
import java.util.Scanner;

public class SquareRootFormated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        double num = input.nextDouble();
        System.out.printf("The square root of number is: %.5f", Math.sqrt(num));
    }
}
