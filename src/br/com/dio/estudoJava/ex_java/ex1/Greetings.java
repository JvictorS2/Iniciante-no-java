package br.com.dio.estudoJava.ex_java.ex1;

public class Greetings {
    public static void message(int hora){

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                goodDay();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                goodAfternoon();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                goodEvening();
                break;
            default:
                System.out.println("Hour invalid. ");
                break;
        }
    }

    public static void goodDay(){
        System.out.println("Good day!");
    }
    public static void goodAfternoon(){
        System.out.println("Good afternoon!");
    }
    public static void goodEvening(){
        System.out.println("Good evening!");

    }

    public static void main(String[] args) {
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