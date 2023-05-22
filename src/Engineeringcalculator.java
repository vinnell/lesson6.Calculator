public class Engineeringcalculator extends Calculator{

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
    public double sinus(double a) {
        double sinus = Math.sin(Math.toRadians(a));
        System.out.println("\nDegree " + a);
        return sinus;
    }
    public double cosinus(double b) {
        double cosinus = Math.cos(Math.toRadians(b));
        System.out.println("\nDegree " + b);
        return cosinus;
    }
}
