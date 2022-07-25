package flyDuck;

public class FlyWithFeet implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly With Feet!");
    }
}
