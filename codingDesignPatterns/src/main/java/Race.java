
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author star_
 */
public class Race {

    private int laps;
    private List<Car> cars;
    private List<RaceObserver> observers = new ArrayList<>();

    public Race(int laps) {
        this.laps = laps;
        this.cars = new ArrayList<>();

    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void startRace() {
        System.out.println("Race started");
    }

    public void endRace() {
        System.out.println("Race ended");
    }

    public boolean isOver() {
        return false;
    }
    
     public void addObserver(RaceObserver observer){
         observers.add(observer);
     }
     
     public void removeobserver(RaceObserver observer){
         observers.remove(observer);
     }
     
     public void notifyObservers(){
         for(RaceObserver observer : observers){
             observer.update(this);
         }
     }
}
