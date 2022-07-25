package observe;

public class PressureDisplay implements Observer,DisplayElement{
    private float pressure;
    public PressureDisplay(Subject subject){
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("now Pressure is: "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure=pressure;
        display();
    }
}
