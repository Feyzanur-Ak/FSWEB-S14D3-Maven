package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private  int cylinders;
    private String name;
    private  int wheels;




    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }

    public  void startEngine(){
        System.out.println("the car's engine is starting");
    }

    public  void accelerate(){
        System.out.println("the car is accelerating");
    }

    public  void brake(){
        System.out.println("the car is braking");
    }
}
