package InputOutput_06;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Моля въведете число: ");
        int num = input.nextInt();
        System.out.println(num%2==0 ? "четно число" : "нечетно число");
    }
}
