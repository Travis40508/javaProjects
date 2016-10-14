package javaCalcClean;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by rodneytressler on 10/13/16.
 */
public class Calculator {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> list = new ArrayList<>();
    public static String History = "history.txt";
    public static void calculate() throws IOException{
        boolean PinkFloyd = true;
        while(PinkFloyd == true) {
            System.out.println("Which Sort of Calculation Do you Wish to Perform? Please Indicate via Number" + "\n" +
                    "1. Addition" + "\n" +
                    "2. Subtraction" + "\n" +
                    "3. Multiplication" + "\n" +
                    "4. Division" + "\n" +
                    "5. Exit");
            int operation = scanner.nextInt();
            switch (operation) {
                case (1):
                    sum();
                    break;
                case (2):
                    difference();
                    break;
                case (3):
                    product();
                    break;
                case (4):
                    quotient();
                    break;
                case (5):
                    PinkFloyd = false;
                    break;
                default :
                    System.out.println("Please Enter a Valid Response");
                    break;
            }
        }
    }
    public static void sum() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(History, true));
        System.out.println("Please Enter The First Number You Wish to Add");
        double num1 = scanner.nextDouble();
        System.out.println("Please Enter the Second Number You Wish to Add");
        double num2 = scanner.nextDouble();
        double total = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " = " + total);
        list.add("The sum of " + num1 + " and " + num2 + " = " + total);
        outFile.println("The sum of " + num1 + " and " + num2 + " = " + total);
        outFile.close();
    }
    public static void difference() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(History, true));
        System.out.println("Please Enter The Number You Wish to Subtract From");
        double num1 = scanner.nextDouble();
        System.out.println("Please Enter the Number You Wish to Subtract");
        double num2 = scanner.nextDouble();
        double total = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " = " + total);
        list.add("The difference of " + num1 + " and " + num2 + " = " + total);
        outFile.println("The difference of " + num1 + " and " + num2 + " = " + total);
        outFile.close();
    }
    public static void product() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(History, true));
        System.out.println("Please Enter The First Number You Wish to Multiply");
        double num1 = scanner.nextDouble();
        System.out.println("Please Enter the Second Number You Wish to Multiply");
        double num2 = scanner.nextDouble();
        double total = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " = " + total);
        list.add("The product of " + num1 + " and " + num2 + " = " + total);
        outFile.println("The product of " + num1 + " and " + num2 + " = " + total);
        outFile.close();
    }
    public static void quotient() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(History, true));
        System.out.println("Please Enter The Number You Wish to Divide");
        double num1 = scanner.nextDouble();
        System.out.println("Please Enter the Second Number You Wish to Divide By");
        double num2 = scanner.nextDouble();
        double total = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " = " + total);
        list.add("The quotient of " + num1 + " and " + num2 + " = " + total);
        outFile.println("The quotient of " + num1 + " and " + num2 + " = " + total);
        outFile.close();
    }
    public static void tipCalculate() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(History, true));
        System.out.println("Please Enter Your Bill");
        double bill = Math.round(scanner.nextDouble() * 100.00) / 100.00;
        System.out.println("Please Indicate the Percentage of Tip You'd Like to Leave, (Example 6% = .06)");
        double tip = Math.round(scanner.nextDouble() * 100.00) / 100.00;
        double result = Math.round((bill * tip) * 100.00) / 100.00;
        System.out.println("A " + tip * 100 + "% Tip of a " + bill + " bill is " + result);
        list.add("A " + tip * 100 + "% Tip of a " + bill + " bill is " + result);
        outFile.println("A " + tip * 100 + "% Tip of a " + bill + " bill is " + result);
        outFile.close();
    }
    public static void groceryTax() throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(History, true));
        System.out.println("Please Enter Your Grocery Bill");
        double bill = Math.round(scanner.nextDouble() * 100.00) / 100.00;
        System.out.println("Please Enter Your State Tax, (Example, 6% = 0.06");
        double stateTax = Math.round(scanner.nextDouble() * 100.00) / 100.00;
        double result = Math.round((bill * stateTax) * 100.00) / 100.00;
        System.out.println("Your total grocery tax is " + result + ". Your total bill is " + (bill + result));
        list.add("Your total grocery tax is " + result + ". Your total bill is " + (bill + result));
        outFile.println("Your total grocery tax is " + result + ". Your total bill is " + (bill + result));
        outFile.close();
    }
    public static void viewHistory() {
        for (String item : list) {
            System.out.println(item);
        }
    }
    public static void clearHistory() {
        list.clear();
    }
}
