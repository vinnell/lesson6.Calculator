public class Accountingcalculator extends Calculator{
    @Override
    public void setAdd(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double add(){
        return x + y;
    }
    @Override
    public double remove() {
        return x - y;
    }
    @Override
    public double multiply() {
        return x * y;
    }
    @Override
    public double divide() {
        return x/y;
    }
    //  Allocate value added tax, where sum- price including VAT, taxrate - VAT rate
    public double allocateValueAddedTax(double sum, double taxrate) {
        double tax= (sum * taxrate)/(100 + taxrate);
        System.out.println("\nVAT rate: " + taxrate + ", " + "price including VAT: " + sum);
        return tax;
    }
}

