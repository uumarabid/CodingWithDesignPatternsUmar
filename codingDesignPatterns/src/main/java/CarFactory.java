/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author star_
 */
// Factory method design pattern to create cars
// https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
public class CarFactory {

    public Car createCar(String carName) {
        switch (carName) {
            case "MeanMachine":
                return new MeanMachine();
            case "CreepyCoupe":
                return new CreepyCoupe();

            case "ConvertACar":
                return new ConvertACar();

            case "CrimsonHaybailer":
                return new CrimsonHaybailer();

            case "CompactPussycat":
                return new CompactPussycat();

            case "ArmySurplusSpecial":
                return new ArmySurplusSpecial();

            case "BulletproofBomb":
                return new BulletproofBomb();

            case "Ferrari250GTO":
                return new Ferrari250GTO();
            
            default:
                throw new IllegalArgumentException("Invalid car name : " + carName);

        }
    }
}
