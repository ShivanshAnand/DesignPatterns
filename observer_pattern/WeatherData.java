import java.util.ArrayList;
import java.util.List;
//import java.util.Observable;
//import java.util.Observer;

public class WeatherData implements Subject {
  
  private float temperature;
  private float humidity;
  private float pressure;
  private List<Observer> observers;
  public String TAG = "yo";
  
  public WeatherData() {
    observers = new ArrayList<Observer>();
  }
  
  public void registerObserver(Observer o){
    observers.add(o);
  }
  
  public void removeObserver(Observer o){
    int i = observers.indexOf(o);
    if(i > -1)
      observers.remove(o);
  }
  
  public void notifyObservers() {
    for(int i=0; i<observers.size(); i++) {
      Observer o = (Observer)observers.get(i);
      o.update(temperature, humidity, pressure);
    }
  }
  
  public void measurementsChanges() {
    notifyObservers();
  }
  
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanges();
  }
}