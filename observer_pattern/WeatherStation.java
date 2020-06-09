public class WeatherStation {
  public static void main(String args[]) {
    WeatherData wd = new WeatherData();
    CurrentConditionsDisplay cdd = new CurrentConditionsDisplay(wd);
    HeatIndex hi = new HeatIndex(wd);
    wd.setMeasurements(77, 33, 30);
    wd.removeObserver(hi);
    wd.setMeasurements(10,10,10);
  }
}
