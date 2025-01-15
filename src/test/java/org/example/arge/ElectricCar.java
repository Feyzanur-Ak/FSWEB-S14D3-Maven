package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;

    public double getAvgKmPerCharge() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }


    public ElectricCar(String name, String description,double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;

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
        return "Elektrik motoru sessizce çalışıyor";
    }
}
