package abstraction.usinginterfaces;

public interface Vehicle {

    //abstract methods

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);

    //default methods
    default void inDefault(){
        System.out.println("I am in default method");
    }
}
