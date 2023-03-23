/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author star_
 */
public class DetailsRaceObserver implements RaceObserver {

    public void update(WackyRacer racer) {

        if (racer.getDistance() >= 100) {
            System.out.println(racer.getContestantName()
                    + " has completed the race and travelled  "
                    + racer.getDistance() + " miles");
        }
    }

}
