import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() { }

  //add the passed observer to the observers ArrayList
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  //remove passed observer from ArrayList
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if(i >= 0) {
      observers.remove(i);
    }
  }

  //when the measurements change, notify the observers
  public void measurementsChanged() {
    //invoke functions in Observers class
    setChanged();
    notifyObservers();
  }

  //update the temperature, humidity, and pressure values for this
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

}
