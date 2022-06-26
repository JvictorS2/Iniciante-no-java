package br.com.dio.estudoJava.topics.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Car> MyQueue = new LinkedList<>();

        MyQueue.add(new Car("Ford"));
        MyQueue.add(new Car("Chevrolet"));
        MyQueue.add(new Car("volkswagen"));

        System.out.println(MyQueue.add(new Car("Peugeat")));
        System.out.println(MyQueue);//adicona

        System.out.println(MyQueue.offer(new Car("Renault")));
        System.out.println(MyQueue);//adiciona sem erro

        System.out.println(MyQueue.peek());
        System.out.println(MyQueue);//Retorna o primeiro elemento da fila

        System.out.println(MyQueue.poll());
        System.out.println(MyQueue);//Retorna o primeiro elemento da fila e remove

        System.out.println(MyQueue.isEmpty());
    }
}
