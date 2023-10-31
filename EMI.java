package Week1.Task2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EMI {
    public static void main(String[] args) {

        // Приравнена месечна вноска e фиксирана сума за плащане, направена от кредитополучател на кредитор на определена дата всеки календарен месец.
        // Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец, така че за определен брой години заемът се изплаща изцяло заедно с лихвите.
        // Годишната вноска се изчислява по формулата:
        // A = P*r*(1+r)^n/((1+r)^n)-1
        // Където:
        // P е заетата сума
        // r е годишната лихва
        // n е броят на вноските
        // За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.
        // Купил съм си апартамент, за който съм заел от банка 10 000 000 евро
        // при годишна лихва 10.5% и смятам да го изплатя за 10 години.
        // Колко ще е моята месечна вноска?
        // ИЗПОЛЗВАЙТЕ BigDecimal!
        // Отпечатайте така: System.out.println(A.setScale(10, RoundingMode.HALF_UP));
        // Когато използвате метода divide на BigDecimal, го извикайте по следния начин:
        // import java.math.BigDecimal;
        // import java.math.RoundingMode;
        // .....
        // myDecimal.divide(anotherBigDecimal, RoundingMode.HALF_UP)

        //Месечна лихва
        BigDecimal rm = BigDecimal.valueOf(0.105).divide(BigDecimal.valueOf(12));
        //(1+r)^n
        BigDecimal power = (BigDecimal.ONE.add(rm)).pow(120);

        BigDecimal emi = BigDecimal.valueOf(10000000).multiply(rm).multiply(power)
                        .divide(power.subtract(BigDecimal.ONE),RoundingMode.HALF_UP);

        System.out.println(emi.setScale(10, RoundingMode.HALF_UP));
    }
}
