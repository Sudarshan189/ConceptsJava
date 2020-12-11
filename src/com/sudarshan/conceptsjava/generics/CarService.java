package com.sudarshan.conceptsjava.generics;

public class CarService {

    public static void main(String[] args) {
        Mist<Car> carMist = new MistImpl<>(5);
        System.out.println("Empty " + carMist.isEmpty());
        System.out.println("Full " +carMist.isFull());
        carMist.add(new Car("Audi","Q4", "petrol"));
        carMist.add(new Car("Maruti","Omini", "petrol"));
        carMist.add(new Car("Maruti","800", "petrol"));
        carMist.add(new Car("Hundai","i20", "petrol"));
        carMist.add(new Car("Hundai","i20", "petrol"));
        System.out.println("Empty " + carMist.isEmpty());
        System.out.println("Full " +carMist.isFull());
        System.out.println(carMist.get(4));
    }
}
