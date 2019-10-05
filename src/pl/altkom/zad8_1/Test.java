package pl.altkom.zad8_1;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicles [] = new Vehicle[5];
        vehicles[0] = new Car("Audi");
        vehicles[1] = new Truck("Scania");
        vehicles[2] = new RaceCar("F1");
        vehicles[3] = new Ship("Dar Młodzierzy");
        vehicles[4] = new Plane("AirBus");

        for(Vehicle v:vehicles){
            v.go();
            v.stop();

        }
    }
}
