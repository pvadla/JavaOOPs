package polymorphism;

public class BirdDemo {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.sound();
        bird = new Sparrow();
        bird.sound();
        bird = new Bird();
        bird.sound();
    }
}
