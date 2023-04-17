
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

        // Create cars and tracks using the Strategy pattern
        Car car1 = new Car(new AggressiveDriveStrategy(), "Umar");
        Car car2 = new Car(new DefensiveDriveStrategy(), "Butt");

        Track track1 = new Track(new SimpleLayoutStrategy());
        Track track2 = new Track(new ComplexLayoutStrategy());

//        track1.build();
//        System.out.println("===<<>>>===");
        // Create race observers using the Observer pattern
        Race race = new Race(3);
        race.addCar(car1);
        race.addCar(car2);
//        race.setTracks(track1);

        Scanner scanner = new Scanner(System.in);
        int trackSelection;
        do {
            System.out.println("Which track do you want to go for?");
            System.out.println("Press 1 for simple track: ");
            System.out.println("Press 2 for complex track: ");
            trackSelection = scanner.nextInt();

            String track;
            switch (trackSelection) {
                case 1:
                    race.setTracks(track1);
                    track = "Simple Track";
                    break;
                case 2:
                    race.setTracks(track2);
                    track = "Complex Track";
                    break;
                default:
                    System.out.println("\n--Invalid selection. Please try again--\n");
                    continue; // Continue to the next iteration of the loop
            }

            
            System.out.println("Starting race on " + track + "...");
            break; // Exit the loop if a valid selection was made
        } while (true); // Loop indefinitely until a valid selection is made


        try {
            // Wait for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        race.getTrackDescription();
        System.out.println("===<<>>>===");

//        race.startRace();
        race.raceStarted();
        System.out.println(">>>>>>>>>>>>>");

        car1.getDescription();
        car2.getDescription();

        while (!race.isOver()) {
            race.update(race);
        }

        race.update(race);

        race.raceEnding();
        race.raceEnded();
//        race.endRace();

        Car winner = race.getWinner();
        System.out.println("The winner is " + winner.getName() + "!");

//        System.out.println("win the race");
    }

}
