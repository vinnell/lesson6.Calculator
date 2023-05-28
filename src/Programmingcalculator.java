public class Programmingcalculator extends Calculator{
     public double CalculationBodyMassIndex(double weight, double height) {
        double index = weight / (height * height);;

       if(index <= 16) {
            System.out.println("Severe lack of body weight");
        }
            if(index > 16 && index <= 18.5) {
                System.out.println("Lack of body weight");
            }
                if(index > 18.5 && index <= 25) {
                    System.out.println("Norm of body weight");
                }
                    if(index > 25 && index <= 30) {
                        System.out.println("Overweight");
                    }
                        if(index > 30 && index <= 35) {
                            System.out.println("First-degree obesity");
                        }
        return index;
        }

    }