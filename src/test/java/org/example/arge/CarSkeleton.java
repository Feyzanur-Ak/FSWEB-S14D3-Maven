package org.example.arge;
import org.example.company.Car;

public class CarSkeleton  {


    private String name;
    private String description;


    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        return  getClass().getSimpleName();
    }

    public String drive() {
       return  getClass().getSimpleName() + " " + runEngine();
    }

    public String runEngine() {
        return "The engine works quietly";
    }
}
