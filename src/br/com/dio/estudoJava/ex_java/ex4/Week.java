package br.com.dio.estudoJava.ex_java.ex4;


import java.util.Scanner;

public class Week {

    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);

        System.out.println(("Inform the number: "));
        int day = week.nextInt();

        switch (day) {
            case 1 -> System.out.println("Correct");
            case 2 -> System.out.println("Correct");
            case 3 -> System.out.println("Correct");
            case 4 -> System.out.println("Wrong");
            case 5 -> System.out.println("Maybe");
            default -> System.out.println("Invalid number");
        }


    }
}
