
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

// https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
public class Race {

    private List<RaceObserver> observers = new ArrayList<>();

    public void registerObserver(RaceObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(RaceObserver observer) {
        observers.remove(observer);
    }
    
    // race logic
    public void race(){
        WackyRacer winner = null;
        
        while (winner == null){
            Iterable<WackyRacer> racers = null;
            // move each racer forward by random number
            for(WackyRacer racer : racers){
                int distance = (int) (Math.random()*racer.getSpeed());
                racer.move(distance);
                
                // check if the racer has reached the finish line
                
                if(racer.getDistance()>=100){
                    winner = racer;
                    break;
                }
            }
            
            // notify observer current state of the race
        }
    
    
    }

}
