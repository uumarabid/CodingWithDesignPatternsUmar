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
        this.speed = speed;
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

    public int getDistance() {
        return distance;
    }
      
    public String toString(){
        return ("Name: " + this.contestantName + "\nCar Name: " + this.carName + 
                "\nCar Number: " + this.carNumber +
                "\nNumber of Contestants: " + this.numberOfContestants + 
                "\nHeight: " + this.height + 
                "\nSpeed: " + this.speed+
                "\nDistance: " + this.distance+"\n=======\n");
    }
}
