package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class oddPair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int odd = 0;
        int pair = -1;

        System.out.println("Type '0' to end! ");
        do {
            System.out.println("Number: ");
            num = scan.nextInt();
            if (num % 2 == 0) ++pair;
            else ++odd;

        } while (num > 0);


        System.out.println("Amount of pair: " + pair );
        System.out.println("Amount of odd: " + odd);

    }
}
