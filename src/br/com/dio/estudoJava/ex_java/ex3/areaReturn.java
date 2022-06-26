package br.com.dio.estudoJava.ex_java.ex3;

public class areaReturn {

    public static int AreaReturn(int sideA) {
        return sideA * sideA;
    }

    public static int AreaReturn(int sideA,int sideB) {
        return sideA * sideB;
    }

    public static int AreaReturn(int sideA, int sideB, int height) {
        return (sideA + sideB) * height/2;
    }
}
