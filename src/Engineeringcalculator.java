public class Engineeringcalculator extends Calculator{

     public double sinus(double a) {
        double sinus = Math.sin(Math.toRadians(a));
        System.out.println("Degree " + a);
        return sinus;
    }
    public double cosinus(double b) {
        double cosinus = Math.cos(Math.toRadians(b));
        System.out.println("Degree " + b);
        return cosinus;
    }
}
