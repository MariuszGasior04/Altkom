package pl.altkom.zad8_1;

public class Car extends Vehicle {


    public Car (String name){
        super(name);

    }
    public double getFuelNeeds(){
        return 5;
    }

    public double getDistance(){
        return 100;
    }
}
