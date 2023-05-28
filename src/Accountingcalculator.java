public class Accountingcalculator extends Calculator{
      //  Allocate value added tax, where sum- price including VAT, taxrate - VAT rate
    public double allocateValueAddedTax(double sum, double taxrate) {
        double tax= (sum * taxrate)/(100 + taxrate);
        System.out.println("VAT rate: " + taxrate + ", " + "price including VAT: " + sum);
        return tax;
    }
}

