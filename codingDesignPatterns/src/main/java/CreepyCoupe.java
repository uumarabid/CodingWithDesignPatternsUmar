
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author star_
 */
public class CreepyCoupe implements Car {

    public String getCarName() {
        return "The Creepy Coupe";
    }

    public int getSpeed() {
//        return 9;
        return (int) (Math.random() * 10);
    }

}
