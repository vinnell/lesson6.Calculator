public class Calculator {
    public double x;
    public double y;

    public double getAdd(){
        return 0;
    }
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
        return x/y;
    }

}
