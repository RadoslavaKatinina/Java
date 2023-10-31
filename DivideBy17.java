package Week1.Task1;

public class DivideBy17 {
    public static void main(String[] args) {

        //Измислих си едно число – 8589935681. Чудя се дали се дели на 17.
        //Напишете програма, която проверява дали числото се дели на 17.
        // И ако е така – напишете на екрана yes, в противен случай напишете no.

        long num = 8_589_935_681L;

        System.out.println("Is " + num + " divided by 17?");
        System.out.println(num%17==0 ? "Yes": "No");

    }
}
