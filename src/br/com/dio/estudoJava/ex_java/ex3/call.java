package br.com.dio.estudoJava.ex_java.ex3;

public class call {
    public static void main(String[] args) {
    //Call the functions of ex3
    int square = areaReturn.AreaReturn(10);
   System.out.println("The area of the square is: " + square +"m²");

    int quadrilateralA = areaReturn.AreaReturn(10,20);
    System.out.println("The area of the quadrilateral is: " + quadrilateralA +"m²");

    int quadrilateralB = areaReturn.AreaReturn(10, 20, 8);
    System.out.println("The area of the quadrilateral is: " + quadrilateralB +"m²");


    }
}
