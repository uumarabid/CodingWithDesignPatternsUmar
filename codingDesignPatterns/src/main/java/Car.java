
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
//    String winner = null;
    String name;
    private int lapsCompleted;

    public Car(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
        this.speed = new Random().nextInt(10);
        this.distance = 0;
        this.lapsCompleted = 0;

    }

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public String getName() {
        return name;
    }
    
      public void completeLap() {
        lapsCompleted++;
    }

    public int getLapsCompleted() {
        return lapsCompleted;
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

    public int moving() {
        int miles = new Random().nextInt(speed);
        return distance += miles;
    }

    public String getDescription() {
        System.out.println(
                "\nSpeed: " + speed 
                + "\nDistance: " + moving() + " miles"
                + "\n=======\n");
        return null;
    }
}
