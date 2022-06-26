package br.com.dio.estudoJava.ex_java.ex4;

import java.util.Scanner;
// if
public class Months {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Inform the number: ");

        int month = value.nextInt();

        if (month == 1) {
            System.out.println("January");
        }
        if (month == 2) {
            System.out.println("February");
        }
        if (month == 3) {
            System.out.println("Match");
        }
        if (month == 4) {
            System.out.println("April");}
        if (month == 5) {System.out.println("May");
        }
        if (month == 6) {
            System.out.println("June");
        }
        if (month == 7) {
            System.out.println("July; Vacation!");
        }
        if (month == 8) {
            System.out.println("August");
        }
        if (month == 9) {
            System.out.println("September");
        }
        if (month == 10) {
            System.out.println("October");
        }
        if (month == 11) {
            System.out.println("November; Vacation!");
        }
        if (month == 12) {
            System.out.println("December; Vacation!");
        }
        else System.out.println("Invalid number");

    }
}