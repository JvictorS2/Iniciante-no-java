package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Note;

        while (true){
            System.out.println("Note: ");
            Note = scan.nextInt();
            if (Note > 10 || Note < 1) {
                System.out.println("Invalid value! type again. ");
                System.out.println(" ");
            }
            else break;

        }
    }
}
