public class Financialcalculator extends Calculator{
      // Calculation of depreciation, where sum- loan amount, r - сost of the loan, n-loan term)
    public double CalculationDepreciation(double sum, double r, double n) {

        double t = 1 / (1 + r);
        double m = Math.pow(t, n);
        double depreciation= (sum * r)/(1 - m);
        return depreciation;
    }
}

