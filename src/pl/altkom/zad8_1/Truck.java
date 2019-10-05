package pl.altkom.zad8_1;

public class Truck extends Car {
    public Truck(String name){
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds()*2;
    }
}
