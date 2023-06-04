public class Calculator {
    public double x;
    public double y;

    public void setAdd(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double add(){
        return x + y;
    }
    public double remove() {
        return x - y;
    }
    public double multiply() {
        return x * y;
    }
    public double divide() {
        if(y == 0)
            try{
                throw new Exception();
            }
        catch(Exception e){
                System.out.println("ArithmeticException : divide by 0 ");
            }
                return x/y;
    }

}
