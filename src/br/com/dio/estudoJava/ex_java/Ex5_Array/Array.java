package br.com.dio.estudoJava.ex_java.Ex5_Array;

public class Array {
    public static void main(String[] args) {
        int [] array = {-5, -6, 15,50, 8, 4};

        int count = 0;

        while (count <= (array.length-1)) {
            System.out.println(array[count] + " ");
            count++;

        }

        for (int i = (array.length - 1); i > -1; i--) {
            System.out.println(array[i]);
        }

    }
}
