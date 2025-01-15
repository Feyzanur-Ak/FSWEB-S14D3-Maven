package org.example.arge;

public class GasPoweredCar extends CarSkeleton {



    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " " + "silindirli benzinli motor çalıştırılıyor";
    }

    @Override
    public String drive() {
        return getClass().getSimpleName() + " " + runEngine();
    }

    @Override
    public String runEngine() {
        return "Benzinli motor düzenli çalışıyor";
    }
}

