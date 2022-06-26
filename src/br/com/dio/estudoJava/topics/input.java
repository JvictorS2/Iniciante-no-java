package br.com.dio.estudoJava.topics;

import java.util.Scanner;

public class input {


    public static void main(String[] args) {
        System.out.println("oi");
        Scanner inputX = new Scanner(System.in);
        Scanner inputU = new Scanner(System.in);
        Scanner inputZ = new Scanner(System.in);
        Scanner inputY = new Scanner(System.in);
        int x;
        int u;
        int z;
        int y;

        System.out.println("Inform number: ");
        x = inputX.nextInt();
        y = inputY.nextInt();
        z = inputZ.nextInt();
        u = inputU.nextInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(u);

    }
}