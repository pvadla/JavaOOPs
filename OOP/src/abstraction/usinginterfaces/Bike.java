package abstraction.usinginterfaces;

public class Bike implements Vehicle{

    int speed;
    int gear;


    @Override
    public void changeGear(int a) {
        gear = a;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
