package br.com.dio.estudoJava.topics.dataStructure;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Car> MyStack = new Stack<>();

        MyStack.add(new Car("Ford"));
        MyStack.add(new Car("Chevrolet"));
        MyStack.add(new Car("volkswagen"));

        System.out.println(MyStack);
        System.out.println(MyStack.pop());
        System.out.println(MyStack);

        System.out.println(MyStack.peek());
        System.out.println(MyStack);

        System.out.println(MyStack.isEmpty());
    }
}
