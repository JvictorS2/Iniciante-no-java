package br.com.dio.estudoJava.topics.dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsHashCode {
    public static void main(String[] args) {


        List<Car> MyList = new ArrayList<>();

        MyList.add(new Car("Ford"));
        MyList.add(new Car("Chevrolet"));
        MyList.add(new Car("volkswagen"));

        System.out.println(MyList.contains(new Car("Ford")));
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Ford1").hashCode());

        Car Car1 = new Car("Ford");
        Car Car2 = new Car("Chevrolet");

        System.out.println(Car1.equals(Car2));// line 52 and 53, 52 ativa: carros com mesma marca True
        //line 53 ativa: todos os carro True

    }
}


class Car {

    String Brand;

    public Car(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // verifica se os objetos são iguais.
        if (o == null || getClass() != o.getClass()) return false;//verifica se um deles é null e se são tipo de dados iguais.
        Car car = (Car) o;
       return Objects.equals(Brand, car.Brand);
        //return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand);
    }

    @Override
    public String toString() {
        return
                "Brand= " + Brand  ;

    }
}



