import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Calculator calculator = new Calculator();
            calculator.setAdd(3,5);
            System.out.println("Simple calculator: Add = " + calculator.add());
            System.out.println("Simple calculator: Divide =  " + calculator.remove());
            System.out.println("Simple calculator: Multiply = " + calculator.multiply());
            System.out.println("Simple calculator: Divide = " + calculator.divide());

            Financialcalculator finance = new Financialcalculator();
            finance.setAdd(7,3);
        System.out.println("\nFinancialcalculator: Add = " + finance.add());
        System.out.println("Financialcalculator: Divide =  " + finance.remove());
        System.out.println("Financialcalculator: Multiply = " + finance.multiply());
        System.out.println("Financialcalculator: Divide = " + finance.divide());
        System.out.println("Depreciation = " + finance.CalculationDepreciation(550,20,2));


        Engineeringcalculator engineering = new Engineeringcalculator();

        System.out.println("Sinus = " + engineering.sinus(90));
        System.out.println("Cosinus = " + engineering.cosinus(60));

        Accountingcalculator accounting = new Accountingcalculator();
        System.out.println("Value Added Tax (VAT) = " + accounting.allocateValueAddedTax(550, 20));

        Programmingcalculator programming = new Programmingcalculator();
        System.out.print("Body Mass Index is " + programming.CalculationBodyMassIndex(60,1.58)+"\n");
        }
    }
