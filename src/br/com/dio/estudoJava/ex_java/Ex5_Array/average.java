package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int num;
        int larger = 0;
        int sum = 0;


        do {System.out.println("Number: ");
            num = scan.nextInt();
            i += 1;
            sum += num;
            if (num > larger) larger = num;
            System.out.println(i);
            System.out.println(sum);
        }   while(i < 5);

        int Average = sum / i ;

        System.out.println("higher number:" + larger );
        System.out.println("Average: " + Average );

    }
}
