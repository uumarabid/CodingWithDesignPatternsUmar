
import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author star_
 */
public class Car {

    private String name;
    private int speed;
    private int distance;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.distance = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void move() {
        distance += speed;
    }
}
