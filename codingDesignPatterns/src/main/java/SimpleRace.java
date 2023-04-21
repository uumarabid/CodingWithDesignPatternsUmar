
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author star_
 */
public class SimpleRace implements RaceStrategy{

    private int numCircuits;
    private int circuitLength;
    private int winnerIndex;
    private int[] circuitTimes;

    public SimpleRace(int numCircuits, int circuitLength) {
        this.numCircuits = numCircuits;
        this.circuitLength = circuitLength;
        this.circuitTimes = new int[2];
        Random random = new Random();
    }

    public void race(Car car, RaceObserver observer) {
        int circuit = 0;
    // https://www.tutorialspoint.com/java/lang/system_currenttimemillis.htm#:~:text=currentTimeMillis()%20method%20returns%20the,units%20of%20tens%20of%20milliseconds.
    long startTime = System.currentTimeMillis();
    }

}
