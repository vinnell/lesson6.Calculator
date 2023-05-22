public class Financialcalculator extends Calculator{
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
    // Calculation of depreciation, where sum- loan amount, r - сost of the loan, n-loan term)
    public double CalculationDepreciation(double sum, double r, double n) {

        double t = 1 / (1 + r);
        double m = Math.pow(t, n);
        double depreciation= (sum * r)/(1 - m);
        return depreciation;
    }
}

