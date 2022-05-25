package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;
        System.out.println("Digite o primeiro númrero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo númrero: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        float dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);


        System.out.println("Somar: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);


    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a,int b) {
        return a - b;
    }
    public static int multiplicar(int a,int b) {
        return a * b;
    }
    public static int dividir(int a,int b) {
        return a / b;
    }

}


