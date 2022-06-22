package classes;

public class Mathematics {

    public static int addNumbers(int x,int y){
        return x + y;
    }

    public int findMax(int x, int y){
        return x > y ? x : y;

    }

    public double average(double a, double b, double c, double d){
        return (a+b+c+d)/4;

    }

    public boolean isEven(int number){
        return number % 2 == 0 ? true : false;
    }
}
