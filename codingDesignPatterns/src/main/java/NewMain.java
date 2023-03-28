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
        Car car1 = new Car(new AggressiveDriveStrategy());
        Car car2 = new Car(new DefensiveDriveStrategy());

        Track track1 = new Track(new SimpleLayoutStrategy());
        Track track2 = new Track(new ComplexLayoutStrategy());

        track1.build();
        System.out.println("===<<>>>===");

        // Create race observers using the Observer pattern
        Race race = new Race(3);
        race.addCar(car1);
        race.addCar(car2);
//        race.setTracks(track1);

//        race.startRace();
        race.raceStarted();

        car1.getDescription();
        car2.getDescription();

        while (!race.isOver()) {
            race.update(race);
        }

        race.raceEnding();
        race.raceEnded();
//        race.endRace();

        Car winner = race.getWinner();
        System.out.println("The winner is " + winner.getName() + "!");

//        System.out.println("win the race");

    }

}
