/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author star_
 */
public interface RaceObserver {
    public void update(Race race);
    public void raceStarted();
    public void raceFinished();
    public void raceEnding();
    public void raceEnded();

    public void raceWinner(Car winner);
    
}
