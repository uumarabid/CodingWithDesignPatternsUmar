
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
    private List <Car> cars;
    private List<RaceObserver> observers = new ArrayList<>();

    public Race(int laps) {
        this.laps = laps;
        this.cars = new ArrayList<>();
        
    }

}
