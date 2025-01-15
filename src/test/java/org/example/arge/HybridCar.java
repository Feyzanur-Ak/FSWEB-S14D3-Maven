package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public double  getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }



    public HybridCar(String name, String description,double avgKmPerLitre, int batterySize,int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
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
        return "Hibrit sistem optimize çalışıyor";
    }
}
