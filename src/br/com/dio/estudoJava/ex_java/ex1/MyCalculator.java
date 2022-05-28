package br.com.dio.estudoJava.ex_java.ex1;

public class MyCalculator {
    public static void sum(double n1, double n2) {

        double result = n1 + n2;

        System.out.println("Sum: " + n1 + " + " + n2 + " = " + result);

    }

    public static void subtraction(double n1,double n2){
        double result = n1 - n2;

        System.out.println("Sub: " + n1 + " - " + n2 + " = " + result);

    }

    public static void division(double n1,double n2){
        double result = n1 / n2;

        System.out.println("Division: " + n1 + " / " + n2 + " = " + result);
    }

    public static void multiplication(double n1,double n2) {
        double result = n1 * n2;

        System.out.println("Multiplication: " + n1 + " * " + n2 + " = " + result);

    }




    public static void main(String[] args) {

        System.out.println("My calculator");

        MyCalculator.sum(10,20);
        MyCalculator.subtraction(10,20);
        MyCalculator.division(100,2.5);
        MyCalculator.multiplication(100,20);

    }
}
