package Week1.Task1;

public class SpringSeason2 {
    public static void main(String[] args) {

        //Напишете програма, в която дефинирате 2 int променливи – month & day.
        //Програмата трябва да отпечатва true,
        //ако денят е между 20-ти март (включително) и 20-ти юни (включително)
        // и false, в противен случай.

        int month = 4;
        int day = 31;

        boolean isSpring = (month==3 && 20<=day && day<=31)||(month==4 && day<=30)
                ||(month==5 && day<=31)||(month==6 && 20<=day && day<=30);
        System.out.println(isSpring? "true":"false");
    }
}
