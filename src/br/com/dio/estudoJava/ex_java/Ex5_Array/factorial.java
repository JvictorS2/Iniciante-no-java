package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Factorial: ");
        int Factorial = scan.nextInt();
        int Multiplication = 1;

        for (int i = Factorial; i >= 1; i -= 1 ){
            Multiplication *= i;
        }

        System.out.println(Factorial + "! = " + Multiplication);
    }

}
