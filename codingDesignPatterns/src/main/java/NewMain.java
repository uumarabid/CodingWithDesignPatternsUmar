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

        race.startRace();
        
        while(!race.isOver()){
            race.update(race);
        }

        race.endRace();
        
      

        System.out.println("win the race");
//        WackyRacer dastardlyMuttley = new WackyRacer ("Dick Dastardly and Muttley", 
//                "MeanMachine", 00, 2,5.3);
//        WackyRacer gruesomeTwosome = new WackyRacer ("The Gruesome Twosome", 
//                "The creepy Coupe", 2, 2,6.2);
//        WackyRacer professorPat = new WackyRacer ("Professor Pat Pending", 
//                "The Convert-A-DriveStrategy", 3, 1,5.4);
//        WackyRacer redMax = new WackyRacer ("The Red Max", 
//                "The Crimson Haybailer", 4, 1,5.5);
//        WackyRacer penelopePitstop = new WackyRacer ("Penelope Pitstop", 
//                "The Compact Pussycat", 5, 1,5.6);
//        WackyRacer sergeantPrivate = new WackyRacer ("Sergeant Blast and Private Meekly", 
//                "The Army Surplus Special", 6, 2,5.7);
//        WackyRacer bulletproofBomb = new WackyRacer ("The Ant Hill Mob", 
//                "The Bulletproof Bomb", 7, 7 ,5.8);
//        WackyRacer authorUmar = new WackyRacer ("Umar", 
//                "Ferrari 250 GTO", 1, 2,5.6);
//        
//        System.out.println(gruesomeTwosome); 
//        System.out.println(authorUmar);
//        authorUmar.specialPower();
    }

}
