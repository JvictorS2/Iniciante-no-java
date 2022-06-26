package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class multiplicationTables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Number: ");
        num = scan.nextInt();

        for (int i = 1; i <= 10; i +=1) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }



    }
}
