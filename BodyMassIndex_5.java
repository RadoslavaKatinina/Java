package Operators;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height = 1.61;
        int mass = 64;
        double bMI = mass/(Math.pow(height,2));
        System.out.println(bMI<25?"normal":"overweight");
    }

}
