package PolymorphismTasks;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a , double b){
        double c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,5));
        System.out.println(calculator.add(3,4,5));
        System.out.println(calculator.add(3.45, 5.90));
    }
}

