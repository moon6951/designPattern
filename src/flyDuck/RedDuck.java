package flyDuck;

public class RedDuck extends Duck{
    public RedDuck(){
        flyBehavior = new FlyWithFeet();
    }
    public static void main(String[] args) {
        new RedDuck().flyBehavior.fly();
        new RedDuck().swim();
    }
}
