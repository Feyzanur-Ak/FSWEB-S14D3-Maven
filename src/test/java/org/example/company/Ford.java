package org.example.company;

public class Ford extends Car{

    private  int wheels;
    private boolean engine;

    public Ford(int cylinders, String name) {
        super(cylinders, name);

    }



   @Override
    public  void startEngine(){
        System.out.println("the car's engine is starting");
    }

    @Override
    public  void accelerate(){
        System.out.println("the car is accelerating");
    }

    @Override
    public  void brake(){
        System.out.println("the car is braking");
    }
}
