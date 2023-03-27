
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

    DriveStrategy driveStrategy;
    int speed;
    int distance;

    public Car(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
        this.speed = new Random().nextInt(10);
        this.distance = 0;

    }

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void move() {
        driveStrategy.drive();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistanece() {
        return distance;
    }

    public void moving() {
        int miles = new Random().nextInt(speed);
        distance += miles;
    }

}
