
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author star_
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n-------Hello and welcome to Wacky car racer-----------\n");

        // Define an array of cars with their details
        CarSpecificationDetails[] carDatails = new CarSpecificationDetails[]{
            new CarSpecificationDetails("Audi R8", " coupe ", 200),
            new CarSpecificationDetails("Porsche 911", " hatchback ", 180),
            new CarSpecificationDetails("Mercedes-Benz", " coupe ", 190),
            new CarSpecificationDetails("BMW 8-Series", " coupe ", 190),
            new CarSpecificationDetails("Ferrari F40", " sports ", 210),};

        System.out.println("Enter the number of cars racing:...");
        //https://www.w3schools.com/java/java_user_input.asp
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // https://codegym.cc/groups/posts/scanner-nextint-method-in-java
        int numCars = scanner.nextInt();
        scanner.nextLine();

        // Create cars and tracks using the Strategy pattern
//        Car car1 = new Car(new AggressiveDriveStrategy(),"Umar");
//        Car car2 = new Car(new DefensiveDriveStrategy(),"Butt");
//
//        Track track1 = new Track(new SimpleRace());
//        Track track2 = new Track(new ComplexLayoutStrategy());
//
//        track1.build();
//        System.out.println("===<<>>>===");
//
//        // Create race observers using the Observer pattern
//        Race race = new Race(3);
//        race.addCar(car1);
//        race.addCar(car2);
//        race.setTracks(track2);
//
////        race.startRace();
//        race.raceStarted();
//        
//        race.getTrackDescription();
//
//        car1.getDescription();
//        car2.getDescription();
//
//        while (!race.isOver()) {
//            race.update(race);
//        }
//
//        race.raceEnding();
//        race.raceEnded();
////        race.endRace();
//
//        Car winner = race.getWinner();
//        System.out.println("The winner is " + winner.getName() + "!");
//        System.out.println("win the race");
    }

}
