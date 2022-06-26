package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Scanner;

public class consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = new String[6];
        int count = 0;
        int i = 0;

        do { System.out.println("letter: ");
            String Letter = scan.next();

            if ( !(Letter.equalsIgnoreCase("a") |
                 Letter.equalsIgnoreCase("e") |
                 Letter.equalsIgnoreCase("i") |
                 Letter.equalsIgnoreCase("o") |
                 Letter.equalsIgnoreCase("u"))) {
                array[count] = Letter;
               i++;
            }
            count ++;

        }while (count < array.length);


        for (String arrays : array){
            if (arrays != null){
            System.out.println(arrays + " ");}
        }
    }
}
