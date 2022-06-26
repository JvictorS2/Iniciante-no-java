package br.com.dio.estudoJava.ex_java.ex2;

public class area {


    public static void Area(int sideA) {
        System.out.println("The area of the square is: " + (sideA * sideA) + "m²");

    }
    public static void Area(int sideA,int sideB) {
        System.out.println("The area of the quadrilateral is: " + (sideA * sideB) + "m²");
    }
    public static void Area(int sideA, int sideB, int height) {
        System.out.println("The area of the quadrilateral is: " + (sideA + sideB) * height/2 + "m²");
    }

}
