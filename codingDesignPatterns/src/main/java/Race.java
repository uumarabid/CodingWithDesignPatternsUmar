
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

    private List<RaceObserver> observers = new ArrayList<>();

    public void registerObserver(RaceObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(RaceObserver observer) {
        observers.remove(observer);
    }

}
