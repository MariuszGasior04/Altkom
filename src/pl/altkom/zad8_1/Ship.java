package pl.altkom.zad8_1;

public class Ship extends Vehicle implements Sailing{

    public Ship (String name){
        super(name);


    }
    public double getFuelNeeds(){
        return 8;
    }

    public double getDistance(){
        return 100;
    }
    public void dock(){
        System.out.println("Łódka "+name+" przybija do portu");
    }
    public void stop(){
        dock();
    }

}
