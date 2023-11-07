package InputOutput_06;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        byte age = input.nextByte();
        System.out.println(age>=18? "You are eligible to vote." : "You are not allowed to vote.");
    }
}
