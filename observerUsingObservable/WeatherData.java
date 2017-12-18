import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

  //create an array from all of the items given by the Observer interface.
  //similar to 'items in item' in angular js repeat
  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  //create a new observers ArrayList
  public WeatherData() {}

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

  //update observer with  what is this for syntax?
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  //when the measurements change, notify the observers
  public void measurementsChanged() {
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
}

public float getTemperature() {
  return teperature;
}

public float getHumidity() {
  return humidity;
}

public float getPressure() {
  return pressure;
}
