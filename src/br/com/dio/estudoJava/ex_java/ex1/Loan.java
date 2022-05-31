package br.com.dio.estudoJava.ex_java.ex1;

import com.sun.jdi.Value;

public class Loan {

    public static int getTwo() {
        return 2;
    }
    public static int getThree() {
        return 3;
    }
    public static double getTaxaTwo() {
        return 0.3;
    }
    public static double getTaxaThree() {
        return 0.45;
    }

    public static void Calculate(double value, int parcelas) {

         if (parcelas == 2){
                double ValueFinal = value + (value + getTaxaTwo());
                System.out.println("Valor final do empréstimo para 2 parcelas: R$" + ValueFinal);

         }else if (parcelas == 3) {
             double ValueFinal = value + (value + getTaxaThree());
             System.out.println("Valor final do empréstimo para 3 parcelas: R$" + ValueFinal);
        }else {
             System.out.println("Qauntidade de parcleas não aceita. ");
         }
    }

    public static void main(String[] args) {
        //Loan
        Loan.Calculate(1000,Loan.getTwo());
        Loan.Calculate(1000,Loan.getThree());
        Loan.Calculate(1000,5);
    }


}
