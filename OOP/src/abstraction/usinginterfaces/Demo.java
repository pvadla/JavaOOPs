package abstraction.usinginterfaces;

public class Demo {
    public static void main(String[] args) {
        Bicycle bs = new Bicycle();
        bs.changeGear(3);
        bs.speedUp(10);
        bs.applyBrakes(1);

        System.out.println(bs);

        //Calling default method present in the interface using class object
        bs.inDefault();


        Bike bike = new Bike();
        bike.changeGear(4);
        bike.speedUp(3);
        bike.applyBrakes(5);

        System.out.println(bike);
    }
}
