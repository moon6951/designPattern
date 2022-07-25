package observe;

public class WeatherStation {
    public static void main(String[] args) {
        WethereData wethereData=new WethereData();
        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(wethereData);
        PressureDisplay pressureDisplay=new PressureDisplay(wethereData);
        wethereData.setMeasurements(80,65,30.4f);
        wethereData.setMeasurements(82,70,29.2f);
        wethereData.setMeasurements(78,90,29.2f);
    }
}
