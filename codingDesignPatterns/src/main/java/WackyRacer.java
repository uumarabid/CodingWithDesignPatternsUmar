
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author star_
 */
public class WackyRacer {
    String contestantName;
    String carName;
    int carNumber;
    int numberOfContestants;
    double height;
    int speed;
    int distance;

    public WackyRacer(String contestantName, String carName, int carNumber, int numberOfContestants, double height) {
        this.contestantName = contestantName;
        this.carName = carName;
        this.carNumber = carNumber;
        this.numberOfContestants = numberOfContestants;
        this.height = height;
        // https://www.geeksforgeeks.org/java-util-random-nextint-java/
        //this.speed = new Random().nextInt(10);
        this.speed = (int)(Math.random()*11);
        this.distance = 0;
    }

    public String getContestantName() {
        return contestantName;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getNumberOfContestants() {
        return numberOfContestants;
    }

    public double getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }
    
//    public int move(int distance){
//        distance = speed*car.getSpeed();
//        return distance;
//    }
    
//    public int move(){
//        int miles = new Random().nextInt(speed);
//        return distance+=miles;
//    }
    
    public void specialPower(){
         System.out.println(this.contestantName + " has a special power");
    }
    
          
    public String toString(){
        return ("Name: " + this.contestantName + "\nCar Name: " + this.carName + 
                "\nCar Number: " + this.carNumber +
                "\nNumber of Contestants: " + this.numberOfContestants + 
                "\nHeight: " + this.height + 
                "\nSpeed: " + this.speed+
                "\nDistance: " + distance +" miles"+
                "\n=======\n");
    }
}
