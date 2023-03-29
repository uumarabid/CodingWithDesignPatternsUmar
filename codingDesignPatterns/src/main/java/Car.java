
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

    IDriveStrategy driveStrategy;
    int speed;
    int distance;
    LocalTime startTime;    
    LocalTime finishTime;

            
//    String winner = null;
    String name;
//    private int lapsCompleted;

    public Car(IDriveStrategy driveStrategy, String name) {
        this.driveStrategy = driveStrategy;
        this.speed = new Random().nextInt(20);
        this.distance = 0;
//        this.lapsCompleted = 0;
        this.name = name;
        this.startTime = LocalTime.now();
    }

    public void setDriveStrategy(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public String getName() {
        return name;
    }
//
//    public void completeLap() {
//        lapsCompleted++;
//    }
//
//    public int getLapsCompleted() {
//        return lapsCompleted;
//    }

    public void move() {
        driveStrategy.drive();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    public void setFinishTime(LocalTime time) {
        this.finishTime = time;
    }
    
    public int getDistance() {
        return this.speed * Duration.between(startTime, LocalTime.now()).getNano();
    }

    public void getDescription() {
        System.out.println("\nname: " + this.name 
                           + "\nSpeed: " + speed
                           + "\nDistance: " + (getDistance()/1000000) + " miles"
                            + "\n=======\n");
    }
}
