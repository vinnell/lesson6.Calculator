public class Programmingcalculator extends Calculator{
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

    public double CalculationBodyMassIndex(double weight, double height) {
        double index = weight / (height * height);;

       if(index <= 16) {
            System.out.println("\nSevere lack of body weight");
        }
            if(index > 16 && index <= 18.5) {
                System.out.println("\nLack of body weight");
            }
                if(index > 18.5 && index <= 25) {
                    System.out.println("\nNorm of body weight");
                }
                    if(index > 25 && index <= 30) {
                        System.out.println("\nOverweight");
                    }
                        if(index > 30 && index <= 35) {
                            System.out.println("\nFirst-degree obesity");
                        }
        return index;
        }

    }