package abstraction.usinginterfaces;

public class Bicycle implements Vehicle{

    int speed;
    int gear;


    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed = this.speed - decrement;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
