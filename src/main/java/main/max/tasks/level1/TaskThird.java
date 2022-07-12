package main.max.tasks.level1;

public class TaskThird {
    static double A = 5;
    static double B = 4;
    static double C = 8;

    public static void main(String[] args) {
        System.out.println("Square : " + getSquare(A,B,C));
    }

    public static int getSquare(double A, double B, double C){
        double p = (A + B + C) / 2;

        return (int) Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
