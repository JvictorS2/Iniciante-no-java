package br.com.dio.estudoJava.ex_java.Ex5_Array;

import java.util.Random;

public class randomm {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] line : array ) {
            for (int num : line ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
