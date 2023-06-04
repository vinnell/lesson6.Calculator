public class Main {
    public static void main(String[] args) {

            Calculator calculator = new Calculator();
            calculator.setAdd(3,0);

            System.out.println("Simple calculator: Add = " + calculator.add());
            System.out.println("Simple calculator: Remove =  " + calculator.remove());
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
        engineering.setAdd(5,1);
        System.out.println("\nEngineeringcalculator: Add = " + engineering.add());
        System.out.println("Engineeringcalculator: Divide =  " + engineering.remove());
        System.out.println("Sinus = " + engineering.sinus(90));
        System.out.println("Cosinus = " + engineering.cosinus(60));

        Accountingcalculator accounting = new Accountingcalculator();
        accounting.setAdd(5,8);
        System.out.println("\nAccountingcalculator: Multiply = " + accounting.multiply());
        System.out.println("Accountingcalculator: Divide = " + accounting.divide());
        System.out.println("Value Added Tax (VAT) = " + accounting.allocateValueAddedTax(550, 20));

        Programmingcalculator programming = new Programmingcalculator();
        programming.setAdd(25,5);
        System.out.println("\nProgrammingcalculator: Multiply = " + programming.multiply());
        System.out.println("Programmingcalculator: Divide = " + programming.divide());
        System.out.print("Body Mass Index is " + programming.CalculationBodyMassIndex(60,1.58));
        programming.canUseBodyCalculator(17);
        }
    }

