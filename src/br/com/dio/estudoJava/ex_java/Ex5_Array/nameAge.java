package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class nameAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0")) break;

            System.out.println("Age: ");
            age = scan.nextInt();
            if (age == 0) break;
        }

    }
}
