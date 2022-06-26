package br.com.dio.estudoJava.ex_java.ex1;

public class call {
// Call the functions of ex1

    public static void main(String[] args) {

        System.out.println("My calculator");
        // Calculator
        MyCalculator.sum(10, 20);
        MyCalculator.subtraction(10, 20);
        MyCalculator.division(100, 2.5);
        MyCalculator.multiplication(100, 20);
        System.out.println("");
        System.out.println("");

        //Loan
        Loan.Calculate(1000, Loan.getTwo());
        Loan.Calculate(1000, Loan.getThree());
        Loan.Calculate(1000, 5);
        System.out.println("");
        System.out.println("");

        // Greetings
        Greetings.message(0);
        Greetings.message(1);
        Greetings.message(2);
        Greetings.message(3);
        Greetings.message(4);
        Greetings.message(5);
        Greetings.message(6);
        Greetings.message(7);
        Greetings.message(8);
        Greetings.message(9);
        Greetings.message(10);
        Greetings.message(11);
        Greetings.message(12);
        Greetings.message(13);
        Greetings.message(14);
        Greetings.message(15);
        Greetings.message(16);
        Greetings.message(17);
        Greetings.message(18);
        Greetings.message(19);
        Greetings.message(20);
        Greetings.message(21);
        Greetings.message(22);
        Greetings.message(23);
        Greetings.message(24);
    }


}