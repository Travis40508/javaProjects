package javaCalcClean;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by rodneytressler on 10/13/16.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner (System.in);
        boolean Beatles = true;
        while(Beatles == true) {
            System.out.println("Welcome to the Calculator! Please Select an Option by Number:" + "\n" +
                               "1. Calculator" + "\n" +
                               "2. Tip Calculator" + "\n" +
                               "3. Grocery Tax Calculator" + "\n" +
                               "4. View Current Calculation History" + "\n" +
                               "5. Clear Current Calculation History" + "\n" +
                               "6. Help" + "\n" +
                               "7. Quit");
            int option;
            try {
                option = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Please input a number, not a letter or symbol.");
                return;
            }

            switch(option) {
                case(1) :
                    Calculator.calculate();
                    break;
                case(2) :
                    Calculator.tipCalculate();
                    break;
                case(3) :
                    Calculator.groceryTax();
                    break;
                case(4) :
                    Calculator.viewHistory();
                    break;
                case(5) :
                    Calculator.clearHistory();
                    break;
                case(6) :
                    System.out.println("Welcome to your Calculator App!" + "\n" +
                                       "Calculate Values, Calculate a Tip, Calculate a Grocery Tax," + "\n" +
                                       "View Current History, and Clear it." + "\n" +
                                       "Use Numbers to Indicate your Choices for Each. Enjoy!" + "\n");
                    break;
                case(7) :
                    Beatles = false;
                    break;
                default :
                    System.out.println("Please Enter a Valid Response");
                    break;
            }
        }
    }
}

