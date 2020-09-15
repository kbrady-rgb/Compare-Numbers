//Kabrina Brady

import java.util.Scanner;

public class CompareNumbersBrady {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNum;
        double secondNum;
        boolean greaterThan = false;
        boolean lessThan = false;
        boolean equal = false;

        System.out.println("Enter a number with decimal places.");
        firstNum = input.nextDouble();
        System.out.println("Enter another number with decimal places.");
        secondNum = input.nextDouble();

        if (firstNum > secondNum){
            greaterThan = true;
            lessThan = false;
            equal = false;
        }
        else if (firstNum < secondNum){
            greaterThan = false;
            lessThan = true;
            equal = false;
        }
        else {
            greaterThan = false;
            lessThan = false;
            equal = true;
        }

        System.out.println(firstNum + " is greater than " + secondNum + ": " + greaterThan);
        System.out.println(firstNum + " is less than " + secondNum + ": " + lessThan);
        System.out.println(firstNum + " is equal to " + secondNum + ": " + equal);
    }
}
