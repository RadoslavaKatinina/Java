package Operators;

public class SpringSeason {
    public static void main(String[] args) {
        int month = 3;
        int day = 21;
        boolean spring = (month==3 && day>=20)||month==4||month==5||(month==6 && day<=20);
        System.out.println(spring?"true":"false");

    }
}
