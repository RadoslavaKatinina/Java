package Variables_04;

public class StringVariables {
    public static void main(String[] args) {
        String firstName = "Radoslava";
        String lastName = "Katinina";
        String age = "45";

        String firstNameSpouse = "Kiril";
        String lastNameSpouse = "Katinin";
        String ageSpouse = "40";

        System.out.println (firstName);
        System.out.println(firstName.equals(firstNameSpouse));
        System.out.println(firstName.equalsIgnoreCase(firstNameSpouse));
        System.out.println(firstName.compareTo(firstNameSpouse));
        System.out.println (firstName+lastName);
        System.out.println (age);
        System.out.println (firstName.concat(" ").concat(lastName).concat(" ").concat(age));
        System.out.println (String.join(" ",firstNameSpouse,lastNameSpouse,ageSpouse));


    }
}
